package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for Products, Brands and More']") WebElement searchBar;

    @FindBy(how = How.XPATH, using = "//div[@class=\"_1ch8e_\"]")  WebElement fashion;

    @FindBy(how = How.LINK_TEXT, using = "Kids") WebElement kids;
    @FindBy(how = How.LINK_TEXT, using = "Girls Dresses") WebElement girls;

    public void clickSearchBar() {
        searchBar.click();
    }

    public void enterSearch(String data) {
        searchBar.sendKeys(data);
    }
    public void mouseOnGirls(){
        girls.click();
    }

    public void selectDress() {
        Actions actions = new Actions(driver);
        actions.moveByOffset(500, 200).click().build().perform();
    }
    public void mouseOnKids() {
        Actions actions = new Actions(driver);
        actions.moveToElement(kids).build().perform();
    }


    public void mouseOnFashion() {
        Actions actions = new Actions(driver);
        actions.moveToElement(fashion).build().perform();
    }

    public void mouseOnCategory(String category) throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        WebElement categoryElement = driver.findElement(By.xpath("//span[contains(text(), '" + category + "')]"));
        actions.moveToElement(categoryElement).perform();
        Thread.sleep(2000);
    }

    public void mouseOnSubCategory(String subCategory){
        WebElement subCategoryElement =  driver.findElement(By.partialLinkText(subCategory));
        Actions actions = new Actions(driver);
       subCategoryElement.click();
    }
}

