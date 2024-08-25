package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

    public class CartPage {

        WebDriver driver;

        public CartPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.XPATH, using = "//div[normalize-space()='Remove']")
        WebElement removeOption;

        public void clickOnRemove() {
            removeOption.click();
        }
    }


