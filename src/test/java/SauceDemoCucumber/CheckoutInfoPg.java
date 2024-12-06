package SauceDemoCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutInfoPg {
WebDriver driver;
	
	@FindBy(id = "first-name") WebElement FirstName;
	
	@FindBy(id = "last-name") WebElement LastName;
	
	@FindBy(id = "postal-code") WebElement Zip;
		
	@FindBy(id = "continue") WebElement Continue;
	
	public CheckoutInfoPg(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	public void UserInfo(String FName, String LName, String ZipCode)
	{	
		FirstName.sendKeys(FName);
		LastName.sendKeys(LName);
		Zip.sendKeys(ZipCode);
		
	}

	public void ContinueButton()
	{
		Continue.click();

	}
	
}
