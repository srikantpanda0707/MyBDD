package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {

    public static boolean checkFrame(WebDriver driver) {
        boolean isFramePresent = false;
        Sync.waitForSeconds(3);
            isFramePresent = driver.getPageSource().contains("iframe");
            if (isFramePresent) {

                isFramePresent = true;
            }
        return isFramePresent;
    }

    public static boolean switchFrameByIndex(int strFrameIndex,WebDriver driver) {
        boolean isFrameSwitched = false;

        try {
            driver.switchTo().frame(strFrameIndex);
            isFrameSwitched = true;
        } catch (Exception e) {
            System.out.println("switchFrameById catch " + e.getMessage());
        }
        return isFrameSwitched;
    }

    public static boolean switchFrameByName(String strFrameName,WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().frame(strFrameName);
            isFrameSwitched = true;
        } catch (Exception e) {
            System.out.println("switchFrameByName catch " + e.getMessage());
        }
        return isFrameSwitched;
    }

    public static boolean switchFrameById(int strFrameId,WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().frame(strFrameId);
            isFrameSwitched = true;
        } catch (Exception e) {
            System.out.println("switchFrameById catch " + e.getMessage());
        }
        return isFrameSwitched;
    }

    public static boolean switchToFrameByElement(WebDriver driver, WebElement element)
    {
        boolean isSwitched=false;
        try {
            driver.switchTo().frame(element);
            isSwitched= true;
        } catch (Exception e) {
            System.out.println("switchFrameById catch " + e.getMessage());
        }
        return isSwitched;
    }

    public static boolean switchFrameByWebElement(WebElement frameWebElement,WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().frame(frameWebElement);
            isFrameSwitched = true;
        } catch (Exception e) {
            System.out.println("switchFrameByWebElement catch " + e.getMessage());
        }
        return isFrameSwitched;
    }

    public static boolean switchToParentFrame(WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().parentFrame();
            isFrameSwitched = true;
        } catch (Exception e) {
            System.out.println("switchToParentFrame catch " + e.getMessage());
        }
        return isFrameSwitched;
    }

    public static boolean switchFrameToDefaultContent(WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().defaultContent();
            isFrameSwitched = true;
        } catch (Exception e) {
            System.out.println("switchFrameToDefaultContent catch " + e.getMessage());
        }
        return isFrameSwitched;
    }
}