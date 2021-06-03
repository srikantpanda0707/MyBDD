package Tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Elements {


    public static void verifyElement(WebElement element) {
        try {
            if (element.isDisplayed()) {
                System.out.println("VerifyElement pass");
            } else {
                System.out.println("VerifyElement Try Fails ");
            }
        } catch (Exception e) {
            System.out.println("VerifyElement Fails "+e);
        }
    }

    public static void click(WebElement element) {
        try {
            Sync.PageWait(3);
             element.click();
        } catch (Exception e) {
            System.out.println("Click is failed "+e);
        }
    }

    public static boolean Jsclick(WebDriver driver, WebElement element) {
        boolean isClicked = false;
        try {
            Sync.PageWait(3);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            isClicked = true;
        } catch (Exception e) {
            System.out.println("JsClick is failed "+e);
        }
        return isClicked;
    }

    public static void MouseClick(WebDriver driver, WebElement element) {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            Sync.ImplicityWait(5);
            actions.click();
            actions.build().perform();

        } catch (Exception e) {
            System.out.println("MouseClick is failed "+e);
        }

    }

    public static void MouseOver(WebDriver driver, WebElement element) {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            Sync.PageWait(10);
        } catch (Exception e) {
            System.out.println("MouseClick is failed "+e);
        }
    }

    public static void dragAndDropXpath(WebElement dragElement,WebElement dropElement, WebDriver driver) {
        try {
            try {
                if (dragElement.isDisplayed() && dropElement.isDisplayed()) {
                    Sync.ImplicityWait(5);
                    Actions builder = new Actions(driver);
                    builder.dragAndDrop(dragElement, dropElement).build().perform();

                } else {
                    System.out.println("Element not found to drag");
                }
            } catch (Exception e) {
                System.out.println("Drag n Drop If Failed "+e);
            }

        } catch (Exception e) {
            System.out.println("Drag n Drop is failed "+e);
        }
    }

}
