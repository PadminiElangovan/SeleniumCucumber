package commons;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends BrowserConfiguration {

	
public static void getScreenshot() {
	Date currentDate = new Date();
	String SSFileName = "SauceDemo" + currentDate.toString().replace(" ", "-").replace(":", "-");
	File SSFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(SSFile, new File(".//Screenshot//"+SSFileName+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
