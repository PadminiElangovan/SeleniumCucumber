package SauceDemoCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(name="user-name") WebElement UserName;
	
	@FindBy(name="password") WebElement Password;
	
	@FindBy(id = "login-button") WebElement LoginButton;
	
	
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void InputUserPswd(String Name, String Pswd)
	{
		
		UserName.sendKeys(Name);
		Password.sendKeys(Pswd);
		
	}
	
	public void LoginButton()
	{
		LoginButton.click();
	}
	
}
