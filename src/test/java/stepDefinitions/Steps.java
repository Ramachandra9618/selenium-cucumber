package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;


import java.awt.*;
import java.util.Set;

public class Steps extends Index {

    private static final Logger logger = Logger.getLogger(Steps.class);
    WebDriver webDriver;

    @Given("the user launches the Chrome browser")
    public void the_user_launches_the_chrome_browser() {
        webDriver = initializeBrowser();
    }

//    @Given("the user launches the Chrome browser")
//    public void the_user_launches_the_chrome_browser() throws MalformedURLException {
//        DesiredCapabilities ds = new DesiredCapabilities();
//        ds.setPlatform(Platform.LINUX);
//        ds.setBrowserName("MicrosoftEdge");
//        ds.setBrowserName("chrome");
//        webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ds);
//        logger.info("Chrome browser launched on Selenium Grid.");
//    }

    @Given("the user opens the Flipkart website {string}")
    public void the_user_opens_the_flipkart_website(String url) {
        webDriver.get(url);
        logger.info("Opened Flipkart website: " + url);
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        getLoginPage().clickOnLogin();
        logger.info("Clicked on login button.");
    }

    @When("the user enters a the mobile number {string}")
    @When("the user enters the mobile number {string}")
    public void the_user_enters_the_mobile_number(String num) {
        getLoginPage().enterMobileNumber(num);
        logger.info("Entered mobile number: " + num);
    }

    @When("the user clicks on the request OTP button")
    public void the_user_clicks_on_the_request_otp_button() {
        getLoginPage().clickOnRequestOTP();
        logger.info("Clicked on request OTP button.");
    }

    @Then("the verify button should be visible")
    public void the_verify_button_should_be_visible() throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertTrue(getLoginPage().isVerifyButton());
        logger.info("Verify button is visible.");
    }

    @Then("the result should be \"\"verify button visible\"\"")
    public void the_result_should_be_verify_button_visible() throws InterruptedException {
        Thread.sleep(5000);
        Assertions.assertTrue(getLoginPage().isVerifyButton());
        logger.info("Verify button is visible.");
    }

    @Then("the result should be \"\"error message displayed\"\"")
    @Then("the result should be \"error message displayed\"")
    public void the_result_should_be_error_message_displayed() throws InterruptedException {
        Thread.sleep(5000);
        Assertions.assertTrue(getLoginPage().isVerifyErrorMessage1());
        getActionUtility().screenShot("error");
        logger.info("Error message is displayed.");
    }

    @Then("the user closes the website")
    public void the_user_closes_the_website() {
        if (webDriver != null) {
            webDriver.quit();
            logger.info("Closed the browser and quit WebDriver.");
        }
    }

    @When("the user moves on login button.")
    public void the_user_moves_on_login_button() {
        getLoginPage().mouseOnLogin();
        logger.info("Hovered over login button.");
    }

    @When("the user clicks on the register button.")
    public void the_user_clicks_on_the_register_button() {
        getRegisterPage().clickRegister();
        logger.info("Clicked on register button.");
    }

    @When("the user move the mouse {string} and {string} right click")
    public void the_user_move_the_mouse_and_right_click(String string, String string2) throws AWTException {
        int x = Integer.parseInt(string);
        int y = Integer.parseInt(string2);
      getActionUtility().robotClick(x, y);
    }

    @When("the clicks on the continue button.")
    public void the_clicks_on_the_continue_button() {
        getRegisterPage().clickContinue();
        logger.info("Clicked on continue button.");
    }

    @Then("the user  {string}")
    public void the_user(String condition) throws InterruptedException {
        switch (condition) {
            case "check the error message":
                Assertions.assertTrue(getLoginPage().isVerifyErrorMessage());
                logger.info("Verified error message.");
                getActionUtility().screenShot("errorMessage capture");
                break;
            case "verify the verify button":
                Thread.sleep(5000);
                Assertions.assertTrue(getLoginPage().isVerifyButton());
                logger.info("Verified verify button.");
                getActionUtility().screenShot("verify message capture");
                break;
            case "verify the request OTP Button":
                Assertions.assertTrue(getLoginPage().isVerifyOtpButton());
                logger.info("Verified request OTP button.");
                getActionUtility().screenShot("otp capture");
                break;
        }
    }


        @When("search the product in the search {string}")
        public void search_the_product_in_the_search(String string) {
            getHomePage().enterSearch(string);
        }

        @When("press the enter button")
        public void press_the_enter_button() throws AWTException {
            getActionUtility().clickEnterButton();
        }

//        @Then("verify the search results  {string}")
        @Then("verify the search results  {string}")
        public void verify_the_search_results(String string) throws InterruptedException {
        Thread.sleep(20000);
            System.out.println(webDriver.getCurrentUrl() + ""+11111);
           Assertions.assertTrue(webDriver.getCurrentUrl().contains(string));
           getActionUtility().screenShot(string);
        }

    @When("the user click on the search bar")
    public void the_user_click_on_the_search_bar() {
       getHomePage().clickSearchBar();
    }

    @When("search the product in the search by keyboard {string}")
    public void search_the_product_in_the_search_by_keyboard(String string) throws AWTException {
       getActionUtility().enterDataByKeyboard(string);
    }




    @When("the user mouse on the Fashion")
    public void the_user_mouse_on_the_Fashion() throws InterruptedException {
       getHomePage().mouseOnFashion();
        Thread.sleep(2000);
    }
    @When("the use select the  kids")
    public void the_use_select_the_kids() throws InterruptedException {
       getHomePage().mouseOnKids();
        Thread.sleep(2000);
    }
    @When("in the select the in order girlsDresses")
    public void in_the_select_the_in_order() {
        getHomePage().mouseOnGirls();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("verify the page")
    @Then("the user verifies the cart page")
    public void  verify_the_page(){
        System.out.println(webDriver.getCurrentUrl());
        Assertions.assertTrue(webDriver.getCurrentUrl().contains("viewcart"));
    }

    @When("the user select the dress")
    public void the_user_select_the_dress() throws InterruptedException {
        getHomePage().selectDress();
        Thread.sleep(2000);
    }
    @When("the use click on the AddCart")
    @When("the user adds the product to the cart")
    public void the_use_click_on_the_add_cart() throws InterruptedException {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Get the current window handle (current tab)
        String originalTab = webDriver.getWindowHandle();
        Set<String> allTabs = webDriver.getWindowHandles();
        for (String tab : allTabs) {
            System.out.println(tab);
            if (!tab.equals(originalTab)) {
                webDriver.switchTo().window(tab);
                break;
            }
        }
        getProductPage().clickAddCart();
        Thread.sleep(2000);
      getActionUtility().screenShot("AddCart");

    }



    /*  End to End test  */


    @When("user click on the realme p1 Pro 5g")
    public void user_click_on_the_realme_p1_pro_5g() {
     getProductPage().clickOnLink();
    }

    @When("user remove the all the items in the cart")
    public void user_remove_the_all_the_items_in_the_cart() throws InterruptedException {
        Thread.sleep(2000);
        getCartPage().clickOnRemove();
    }


    @When("the user clicks on the search bar")
    public void the_user_clicks_on_the_search_bar() {
        getHomePage().clickSearchBar();
    }

    @When("the user presses the Enter key")
    public void the_user_presses_the_enter_key() throws AWTException {
        getActionUtility().clickEnterButton();
    }
    @When("the user clicks on the first product in the search results")
    public void the_user_clicks_on_the_first_product_in_the_search_results() throws AWTException {
        getActionUtility().robotClick(700,500);
    }

    @Then("verify the cart page")
    public void verify_the_cart_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Given("the user navigates to the {string} category")
    public void the_user_navigates_to_the_category(String string) throws InterruptedException {
       getHomePage().mouseOnCategory(string);
    }
    @Given("the user selects {string} from the Electronics category")
    public void the_user_selects_from_the_electronics_category(String string) throws InterruptedException {
        getHomePage().mouseOnSubCategory(string);
    }
    @Then("the user verifies that the Mobiles page is displayed")
    public void the_user_verifies_that_the_mobiles_page_is_displayed() {
      Assertions.assertTrue(webDriver.getCurrentUrl().contains("Mobile"));
    }
}
