package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='New customer?']") WebElement register;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='CONTINUE']") WebElement continueButton;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Existing User? Log in']") WebElement existingUser;
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Terms of Use']") WebElement termAndUse;
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Privacy Policy']") WebElement privacyPolicy;
    @FindBy(how = How.XPATH, using = "//a[@class='QqFHMw twnTnD OD+dVw']") WebElement login;


    public void clickRegister(){
        register.click();
    }

    public void clickContinue(){
        continueButton.click();
    }

    public void clickExistingUser(){
        existingUser.click();
    }
    public void clickTermsAndCondition(){
        termAndUse.click();
    }



}
