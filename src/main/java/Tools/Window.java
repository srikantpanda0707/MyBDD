package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
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

    public static void switchwindowByName(WebDriver driver) {
        String currentWinHandle = driver.getWindowHandle();
        System.out.println("currentWinHandle is " + currentWinHandle);

            if (currentWinHandle != "") {
                driver.switchTo().window(currentWinHandle);
                System.out.println("Swithced to current window");
            } else {
                System.out.println("Not Swithced to current window");
            }

    }

    public static void switchtoChildWindow(WebDriver driver){

        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("total window present" + count);
        for (String Child:allWindows){
            if (!parent.equalsIgnoreCase(Child)){
                driver.switchTo().window(Child);
                Sync.waitForSeconds(3);
                System.out.println("Swithced to child window");
            }else if(parent.equalsIgnoreCase(Child)) {
                driver.switchTo().window(parent);
                System.out.println("Not Swithced to child window" + driver.getTitle());
            }
        }
    }

    public static void switchtoTab(WebDriver driver, int number ){

        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("total window present" + count);
        ArrayList<String> tabs = new ArrayList<>(allWindows);
        for (String Child:tabs){
            if (!parent.equalsIgnoreCase(Child)){
                driver.switchTo().window(tabs.get(number));
                Sync.waitForSeconds(3);
                System.out.println("Swithced to child window");
            }else if(parent.equalsIgnoreCase(Child)) {
                driver.switchTo().window(parent);
                System.out.println("Not Swithced to child window" + driver.getTitle());
            }
        }
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
