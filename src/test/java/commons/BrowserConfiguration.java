package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfiguration {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		driver = new FirefoxDriver();
		return driver;
	}
}