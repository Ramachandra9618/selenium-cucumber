package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActionUtility {

        WebDriver driver;

        public ActionUtility(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void screenShot(String name) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

            File destFile = new File("screenshot/" + name + "_" + timestamp + "_screenshot.png");
            try {
                FileUtils.copyFile(srcFile, destFile);
                System.out.println("Screenshot saved successfully at: " + destFile.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void clickEnterButton() throws AWTException {
            Robot robot = new Robot();
            robot.delay(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }

        public void enterDataByKeyboard(String data) throws AWTException {
            Robot robot = new Robot();
            robot.delay(2000);
            for (char ch : data.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            }
        }

    public void robotMouseOn(int x, int y) throws AWTException {
        Robot robot = new Robot();
        robot.delay(2000);
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }

        public void robotClick(int x, int y) throws AWTException {
            Robot robot = new Robot();
            robot.delay(2000);
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
    }

