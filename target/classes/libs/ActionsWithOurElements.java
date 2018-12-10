package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.WatchListPage;

import java.awt.*;
import java.awt.event.InputEvent;

public class ActionsWithOurElements {
    public WatchListPage mousePosition;
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    public String text;


    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterTextInToElement(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info(text + " " + "was inputted into Input");

        } catch (Exception e) {
            logger.error("Cannot work with element" + e);
            Assert.fail("Cannot work with element" + e);
        }
    }
    public void clickOnElement(WebElement element) {
        try {
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            logger.error("Cannot work with element" + e);
            Assert.fail("Cannot work with element" + e);
        }

    }
    public boolean isAuthorizationFormPresent() {
        try {
            return webDriver.findElement(By.xpath(".//p[@class='login-box-msg']")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isElementDisplayed (WebElement element){
        try {
            return element.isDisplayed();

        }catch (Exception e){
            return false;
        }
    }
    public void selectTextInDD(WebElement element, String text) {
        try {
            Select select = new Select(element);
            select.selectByVisibleText(text);
            logger.info(text + " " + "was selected in DD");
        } catch (Exception e) {
            logger.error("Cannot work with element" + e);
            Assert.fail("Cannot work with element" + e);
        }
    }

    public boolean isElementDisplayed(By by) {
        try {
            return isElementDisplayed(webDriver.findElement(by));
        }catch (Exception e){
            return false;
        }

    }

    public boolean isTextDisplayed (By by){
        try {
            return isTextDisplayed((By) webDriver.findElements(by));
        }catch (Exception e){
            return false;
        }
    }

    public   void mousePosition(String[] args) throws Exception {
        Robot robot = new Robot();


        // SET THE MOUSE X Y POSITION
        robot.mouseMove(757, 307);
    }

    public static void mouseEvent(String[] args) throws Exception {
        Robot robot = new Robot();

        // LEFT CLICK
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

        // RIGHT CLICK
        robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
    }


}
