package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Elements {

    public  void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            System.out.println("Click is failed " + e);
        }
    }

    public  void Builberclick(WebDriver driver, String element, String strValue) {

        WebElement ele = driver.findElement(By.xpath(element.replace("<<REPLACE>>", strValue)));
        ele.click();
    }


    public  boolean Jsclick(WebDriver driver, WebElement element) {
        boolean isClicked = false;
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            isClicked = true;
        } catch (Exception e) {
            System.out.println("JsClick is failed " + e);
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
            System.out.println("MouseClick is failed " + e);
        }

    }

    public  void MouseOver(WebDriver driver, WebElement element) {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
        } catch (Exception e) {
            System.out.println("MouseClick is failed " + e);
        }
    }

    public  void dragAndDropXpath(WebElement dragElement, WebElement dropElement, WebDriver driver) {
        try {
            try {
                if (dragElement.isDisplayed() && dropElement.isDisplayed()) {
                    Actions builder = new Actions(driver);
                    builder.dragAndDrop(dragElement, dropElement).build().perform();

                } else {
                    System.out.println("Element not found to drag");
                }
            } catch (Exception e) {
                System.out.println("Drag n Drop If Failed " + e);
            }

        } catch (Exception e) {
            System.out.println("Drag n Drop is failed " + e);
        }
    }

    public  boolean scrollToElement(WebDriver driver,WebElement element) {
        boolean isScrollToView = false;
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            isScrollToView = true;

        } catch (Exception e) {
            System.out.println("Element not found to scroll " + e);
        }
        System.out.println("scrollToElement bool value is"+isScrollToView);
        return isScrollToView;
    }




}
