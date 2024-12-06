package StepDefinitions;

import org.openqa.selenium.WebDriver;

import SauceDemoCucumber.CheckoutCompletePg;
import SauceDemoCucumber.CheckoutInfoPg;
import SauceDemoCucumber.CheckoutOverviewPg;
import SauceDemoCucumber.LoginPage;
import SauceDemoCucumber.SwagLabProductPg;
import SauceDemoCucumber.YoursCartPg;
import commons.Screenshot;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoStepsDef {
	
	WebDriver driver = commons.BrowserConfiguration.getDriver();
	
	LoginPage Login = new LoginPage(driver);
	SwagLabProductPg ProductPg = new SwagLabProductPg(driver);
	YoursCartPg CartPg = new YoursCartPg(driver);
	CheckoutInfoPg CkInfoPg = new CheckoutInfoPg(driver);
	CheckoutOverviewPg ChkOverPg = new CheckoutOverviewPg(driver);
	CheckoutCompletePg ChkCompPg = new CheckoutCompletePg(driver);

@Given("User is on login Page")
public void user_is_on_login_page() {
	
		driver.get("https://www.saucedemo.com/");
}

@When("user input username {string} and {string} password and clicks on login button")
public void user_input_username_and_password_and_clicks_on_login_button(String string, String string2) {
	Login.InputUserPswd(string, string2);
	Login.LoginButton();
}
@Then("user select Add to cart of product1 & product2 on Product page")
public void user_select_add_to_cart_of_product1_product2_on_product_page() {
	ProductPg.AddProduct1();
	ProductPg.AddProduct2();
}

@When("clicks on Cart icon and user is navigated to Your Cart Page")
public void clicks_on_cart_icon_and_user_is_navigated_to_your_cart_page() {
	ProductPg.ToCart();
}

@When("user clicks on Checkout button and is navigated to Chkinformation Page")
public void user_clicks_on_checkout_button_and_is_navigated_to_chkinformation_page() {
	CartPg.Checkout();
}

@When("user inputs FirstName {string} LastName {string} ZipCode {string} & clicks on continue")
public void user_inputs_first_name_last_name_zip_code_clicks_on_continue(String string, String string2, String string3) {
	CkInfoPg.UserInfo(string, string2, string3);
	CkInfoPg.ContinueButton();
}

@When("On ChkOverview Page, clicks on Finish button & navigates to Checkout Completed Page")
public void on_chk_overview_page_clicks_on_finish_button_navigates_to_checkout_completed_page() {
	ChkOverPg.Finish();
}

@When("user clicks on Backhome button & navigates to Products page")
public void user_clicks_on_backhome_button_navigates_to_products_page() {
	Screenshot.getScreenshot();
	ChkCompPg.BackButton();
}

@When("user clicks on menu icon & select Logout from the menu")
public void user_clicks_on_menu_icon_select_logout_from_the_menu() {
	ProductPg.MainMenu();
	ProductPg.LogoutMenu();
}

@Then("user is signout of the application")
public void user_is_signout_of_the_application() {
	driver.close();
    System.out.println("Sign out successfully");
}

}
