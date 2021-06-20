package Tools;

import Utils.ObjectGenerator;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Logger;

public class Window {
    Logger log = Logger.getLogger(Window.class.getName());
    ObjectGenerator OG = BaseClass.getObjectGenerator();

    public  boolean focusWindow(WebDriver driver, int strWindowArrayValue) {
        boolean blResult = false;
        String strWindowHandle = driver.getWindowHandles().toArray()[strWindowArrayValue].toString();
        try {
            driver.switchTo().window(strWindowHandle);
            driver.manage().window().maximize();
            blResult = true;
        } catch (Exception e) {
            log.info("Window Not Focused  "+e.getMessage());
        }
        return blResult;
    }

    public  void switchwindowByName(WebDriver driver) {
        String currentWinHandle = driver.getWindowHandle();
        System.out.println("currentWinHandle is " + currentWinHandle);

            if (currentWinHandle != "") {
                driver.switchTo().window(currentWinHandle);
                log.info("Window Not Focused");
            } else {
                log.info("WNot Swithced to current window ");
            }

    }


    public  void switchtoChildWindow(WebDriver driver){

        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("total window present " + count);
        for (String Child:allWindows){
            if (!parent.equalsIgnoreCase(Child)){
                driver.switchTo().window(Child);
                OG.sync.waitForSeconds(3000);
                log.info("Swithced to child window");
            }else {
                log.info("Not swithced to child window");
            }
        }
    }

    public  void switchtoTab(WebDriver driver, int number ){

        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("total window present " + count);
        ArrayList<String> tabs = new ArrayList<>(allWindows);
        for (String Child:tabs){
            if (!parent.equalsIgnoreCase(Child)){
                driver.switchTo().window(tabs.get(number));
                OG.sync.waitForSeconds(3000);
                log.info("Swithced to child window");
            }else if(parent.equalsIgnoreCase(Child)) {
                driver.switchTo().window(parent);
                log.info("Not Swithced to child window" + driver.getTitle());
            }
        }
    }

    public  boolean GetWindowName(WebDriver driver) {
        boolean blResult = false;
        String window = driver.getWindowHandle();
        System.out.println("Current Window Name " + driver.getTitle());
        return blResult;
    }

    public  boolean MaxWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.manage().window().maximize();
            blResult = true;
        } catch (Exception e) {
            log.info("MaxWindow  "+e.getMessage());
        }
        return blResult;
    }


    public  boolean closeWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.close();
            blResult = true;
        } catch (Exception e) {
            System.out.println("closeWindow  "+e.getMessage());
        }
        return blResult;
    }

    public  boolean refreshWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.navigate().refresh();
            blResult = true;
        } catch (Exception e) {
            System.out.println("refreshWindow  "+e.getMessage());
        }
        return blResult;
    }

    public  boolean NavBackWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.navigate().back();
            blResult = true;
        } catch (Exception e) {
            System.out.println("NavBackWindow  "+e.getMessage());
        }
        return blResult;
    }

    public  boolean NavForWindow(WebDriver driver) {
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
