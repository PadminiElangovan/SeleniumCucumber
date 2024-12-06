package SauceDemoCucumber;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabProductPg {
WebDriver driver;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack") WebElement BackpackAddCart;
	
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt") WebElement TshirtAddCart;
	
	@FindBy(id = "shopping_cart_container") WebElement ToCart;
	
	@FindBy(id="react-burger-menu-btn") WebElement Menu;
	
	@FindBy(id="logout_sidebar_link") WebElement LogoutButton;
	

	public SwagLabProductPg(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void AddProduct1()
	{
		BackpackAddCart.click();
		
	}
	public void AddProduct2()
	{
	
		TshirtAddCart.click();
	}
	public void ToCart()
	{
		ToCart.click();
	}
	
	public void MainMenu()
	{
		Menu.click();
		
	}
	public void LogoutMenu()
	{
		LogoutButton.click();
		
	}
	
}
