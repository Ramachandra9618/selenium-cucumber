package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public static Properties prop;
 public static    WebDriver webDriver;
    // Constructor to load properties file
    public BaseClass() {
        try {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file");
        }
    }

    // Method to initialize browser
    public static WebDriver initializeBrowser() {


        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            webDriver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            webDriver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Browser type unsupported");
        }

        webDriver.manage().window().maximize();
        return webDriver;
    }
}
