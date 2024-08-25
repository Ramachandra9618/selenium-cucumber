package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Login']") WebElement login;

    @FindBy(how = How.XPATH, using = "//input[@class='r4vIwl BV+Dqf']") WebElement mobileInput;

    @FindBy(how = How.XPATH, using = "//button[@class='QqFHMw twnTnD _7Pd1Fp']") WebElement requestOTP;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Verify']") WebElement verifyButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Please enter a valid Mobile number')]") WebElement errorMessage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Please enter valid Email ID/Mobile number')]") WebElement errorMessage1;

    public void clickOnLogin() {
        login.click();
    }

    public void enterMobileNumber(String num) {
        mobileInput.sendKeys(num);
    }

    public void clickOnRequestOTP() {
        requestOTP.click();
    }

    public boolean isVerifyOtpButton() {
        return requestOTP.isDisplayed();
    }

    public boolean isVerifyButton() {
        return verifyButton.isDisplayed();
    }

    public boolean isVerifyErrorMessage() {
        return errorMessage.isDisplayed();
    }

    public boolean isVerifyErrorMessage1() {
        return errorMessage1.isDisplayed();
    }

    public void mouseOnLogin() {
        Actions actions = new Actions(driver);
        actions.moveToElement(login).build().perform();
    }
}






































































//package pageObjects;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//
//import java.awt.*;
//import java.awt.event.InputEvent;
//import java.awt.event.KeyEvent;
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//
//
//public class LoginPage {
// WebDriver driver;
//    public LoginPage(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//
//    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Login']") WebElement login;
//    @FindBy(how = How.XPATH, using = "//input[@class='r4vIwl BV+Dqf']") WebElement mobileInput;
//    @FindBy(how = How.XPATH, using = "//button[@class='QqFHMw twnTnD _7Pd1Fp']") WebElement requestOTP;
//    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Verify']") WebElement verifyButton;
//    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Please enter a valid Mobile number')]") WebElement errorMessage;
//    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Please enter valid Email ID/Mobile number')]") WebElement errorMessage1;
//    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for Products, Brands and More']") WebElement searchBar;
//    @FindBy(how = How.XPATH, using = "//div[@class=\"_1ch8e_\"]")  WebElement electronics;
//    @FindBy(how = How.LINK_TEXT, using = "Kids") WebElement kids;
//    @FindBy(how = How.LINK_TEXT, using = "Girls Dresses") WebElement girls;
//    @FindBy(how = How.CSS, using = ".In9uk2") WebElement addCart;
//    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "realme P1 Pro 5G (Parrot Blue, 256 GB)") WebElement link;
//    @FindBy(how = How.XPATH, using = "//div[normalize-space()='Remove']") WebElement removeOption;
//
//
//
//
//    public void clickOnLink(){
//        link.click();
//    }
//    public void clickOnRemove(){
//        removeOption.click();
//    }
//
//
//public void mouseOnElectronic()  {
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(electronics).build().perform();
//    }
//
//    public void clickAddCart(){
//        addCart.click();
//    }
//    public boolean isAddCart(){
//       return addCart.isDisplayed();
//    }
//    public void mouseOnGaming(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(kids).build().perform();
//    }
//    public void mouseOnGirls(){
//        girls.click();
//    }
//
//    public void selectDress() {
//        // Move to the center of the page and click
//        Actions actions = new Actions(driver);
//        actions.moveByOffset(500, 200).click().build().perform();
//    }
//
//
//
//
//
//    public void clickOnLogin(){
//        login.click();
//    }
//    public void mouseOnLogin(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(login).build().perform();
//    }
//
//    public void enterMobileNumber(String num){
//        mobileInput.sendKeys(num);
//    }
//    public void clickOnRequestOTP(){
//        requestOTP.click();
//    }
//    public boolean isVerifyOtpButton(){
//        return requestOTP.isDisplayed();
//    }
//    public boolean isVerifyButton(){
//        return verifyButton.isDisplayed();
//    }
//    public boolean isVerifyErrorMessage(){
//        return errorMessage.isDisplayed();
//    }
//    public boolean isVerifyErrorMessage1(){
//        return errorMessage1.isDisplayed();
//    }
//    public void clickEnterButton() throws AWTException {
//        Robot robot = new Robot();
//        robot.delay(2000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//    }
//
//    public void enterSearch(String data) {
//        searchBar.sendKeys(data);
//    }
//
//    public void clickSearchBar(){
//        searchBar.click();
//    }
//
//    public void robotClick(String a1, String a2) throws AWTException {
//        Robot robot = new Robot();
//        robot.delay(2000);
//        robot.mouseMove(Integer.parseInt(a1), Integer.parseInt(a2));
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//    }
//
//    public void enterDataByKeyboard(String data) throws AWTException {
//        Robot robot = new Robot();
//        robot.delay(2000);
//        for (char ch : data.toCharArray()){
//            int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
//            robot.keyPress(keyCode);
//            robot.keyRelease(keyCode);
//        }
//
//    }
//
//    public void screenShot(String name) {
//        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//
//        File destFile = new File("screenshot/" + name +timestamp+ "_screenshot.png");
//        try {
//            FileUtils.copyFile(srcFile, destFile);
//            System.out.println("Screenshot saved successfully.");
//            System.out.println("Screenshot saved successfully at: " + destFile.getAbsolutePath());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
