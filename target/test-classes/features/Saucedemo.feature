
@AddProductSauceDemo
Feature: Title of your feature
  I want to use this template for my feature file

  @Add2Product
  Scenario: Add two item & Checkout
    Given User is on login Page
    When user input username "standard_user" and "secret_sauce" password and clicks on login button
    Then user select Add to cart of product1 & product2 on Product page
    When clicks on Cart icon and user is navigated to Your Cart Page
    And user clicks on Checkout button and is navigated to Chkinformation Page
    When user inputs FirstName "Chicken" LastName "Briyani" ZipCode "656565" & clicks on continue
    And On ChkOverview Page, clicks on Finish button & navigates to Checkout Completed Page
    When user clicks on Backhome button & navigates to Products page
    And user clicks on menu icon & select Logout from the menu
    Then user is signout of the application