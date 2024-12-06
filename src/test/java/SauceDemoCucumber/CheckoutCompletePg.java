package SauceDemoCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePg {
WebDriver driver;
	
	@FindBy(id = "back-to-products") WebElement BackHomeButton;
	
	public CheckoutCompletePg(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void BackButton()
	{
		BackHomeButton.click();
	}

}
