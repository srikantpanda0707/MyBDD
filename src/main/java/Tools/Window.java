package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class Window {

    public static boolean focusWindow(WebDriver driver, int strWindowArrayValue) {
        boolean blResult = false;
        String strWindowHandle = driver.getWindowHandles().toArray()[strWindowArrayValue].toString();
        try {
            driver.switchTo().window(strWindowHandle);
            driver.manage().window().maximize();
            blResult = true;
        } catch (Exception e) {
            System.out.println("Window Not Focused  "+e.getMessage());
        }
        return blResult;
    }

    public static boolean switchwindowByName(WebDriver driver) {
        boolean isWindowSwitched = false;
        String currentWinHandle = driver.getWindowHandle();
        System.out.println("currentWinHandle is " + currentWinHandle);
        try {
            if (currentWinHandle != "") {
                driver.switchTo().window(currentWinHandle);
                isWindowSwitched = true;
            } else {
                isWindowSwitched = false;
            }
        } catch (Exception e) {
            System.out.println("switchwindowByName  "+e.getMessage());
        }
        return isWindowSwitched;

    }

    public static boolean switchtoChildWindow(WebDriver driver, WebElement element){
        boolean isChildWindowSwitched = false;
        try {
            String mainWindowHandle = driver.getWindowHandle();
            Set<String> allWindowHandles = driver.getWindowHandles();
            Iterator<String> iterator = allWindowHandles.iterator();
            while (iterator.hasNext()) {
                String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);
                    WebElement text = element;
                    System.out.println("Heading of child window is " + text.getText());
                }
            }
        }
        catch (Exception e){
            System.out.println("switchtoChildWindow  "+e.getMessage());
        }
        return  isChildWindowSwitched;
    }

    public static boolean closeWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.close();
            blResult = true;
        } catch (Exception e) {
            System.out.println("closeWindow  "+e.getMessage());
        }
        return blResult;
    }

    public static boolean refreshWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.navigate().refresh();
            blResult = true;
        } catch (Exception e) {
            System.out.println("refreshWindow  "+e.getMessage());
        }
        return blResult;
    }

    public static boolean NavBackWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.navigate().back();
            blResult = true;
        } catch (Exception e) {
            System.out.println("NavBackWindow  "+e.getMessage());
        }
        return blResult;
    }

    public static boolean NavForWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.navigate().forward();
            blResult = true;
        } catch (Exception e) {
            System.out.println("NavForWindow  "+e.getMessage());
        }
        return blResult;
    }
}
