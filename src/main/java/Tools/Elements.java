package Tools;

import Utils.ObjectGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.logging.Logger;

import static Tools.AppiumDriver.getObjectGenerator;

public class Elements {
    ObjectGenerator OG = getObjectGenerator();

    Logger log = Logger.getLogger(Elements.class.getName());

    public  void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            log.info("Click is failed " + e);
        }
    }

    public  void Builberclick(WebDriver driver, String element, String strValue) {

        WebElement ele = driver.findElement(By.xpath(element.replace("<<REPLACE>>", strValue)));
        if (ele.isDisplayed()) {
            ele.click();
        } else {
            log.info("Builder Click is failed ");
        }
    }


    public  boolean Jsclick(WebDriver driver, WebElement element) {
        boolean isClicked = false;
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            isClicked = true;
        } catch (Exception e) {
            log.info("JsClick is failed " + e);
        }
        return isClicked;
    }

    public  void MouseClick(WebDriver driver, WebElement element) {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            actions.click();
            actions.build().perform();

        } catch (Exception e) {
            log.info("MouseClick is failed " + e);
        }

    }

    public  void MouseOver(WebDriver driver, WebElement element) {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
        } catch (Exception e) {
            log.info("Mouseover is failed " + e);
        }
    }

    public  void dragAndDropXpath(WebElement dragElement, WebElement dropElement, WebDriver driver) {

            try {
                if (dragElement.isDisplayed() && dropElement.isDisplayed()) {
                    Actions builder = new Actions(driver);
                    builder.dragAndDrop(dragElement, dropElement).build().perform();

                } else {
                    log.info("Element not found to drag");
                }
            } catch (Exception e) {
                log.info("Drag n Drop If Failed " + e);
            }

    }

    public  boolean scrollToElement(WebDriver driver,WebElement element) {
        boolean isScrollToView = false;
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            isScrollToView = true;

        } catch (Exception e) {
            log.info("Element not found to scroll  " + e);
        }
        System.out.println("scrollToElement bool value is"+isScrollToView);
        return isScrollToView;
    }




}
