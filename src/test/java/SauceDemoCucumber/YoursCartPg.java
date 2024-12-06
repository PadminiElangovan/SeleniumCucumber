package SauceDemoCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class YoursCartPg {
WebDriver driver;
	
	@FindBy(id = "checkout") WebElement CheckoutButton;
	
	public YoursCartPg(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	
	public void Checkout()
	{
			
		CheckoutButton.click();
	}
	

}
