package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alert {

    public static boolean switchToAlert(WebDriver driver) {
        boolean isAlertSwitched = false;
        try {
            driver.switchTo().alert();
            isAlertSwitched = true;
        } catch (Exception e) {
            System.out.println("switchToAlert catch " + e.getMessage());
        }
        return isAlertSwitched;
    }

    public static boolean acceptAlert(WebDriver driver) {
        boolean isAlertAccepted = false;
        try {
            Sync.waitForSeconds(3);
            driver.switchTo().alert().accept();
            isAlertAccepted = true;
        } catch (Exception e) {
            System.out.println("acceptAlert catch " + e.getMessage());
        }
        return isAlertAccepted;
    }

    public static boolean dismissAlert(WebDriver driver){
        boolean isAlertDismissed = false;
        try {
            Sync.waitForSeconds(3);
            driver.switchTo().alert().dismiss();
            isAlertDismissed = true;
        }
        catch (Exception e){
            System.out.println("Dismissalert catch " + e.getMessage());
        }
        return  isAlertDismissed;
    }

    public static boolean GetAlertMessage(WebDriver driver) {
        boolean GetAltMss = false;
        try {
            driver.switchTo().alert().getText();
            GetAltMss = true;
        } catch (Exception e) {
            System.out.println("GetAlertMessage catch " + e.getMessage());
        }
        return GetAltMss;
    }

    public static boolean acceptAlertByText(WebDriver driver, String enterVal ) {
        boolean SendAlertText = false;
        try {
            driver.switchTo().alert().sendKeys(enterVal);
            driver.switchTo().alert().accept();
            SendAlertText = true;
        } catch (Exception e) {
            System.out.println("acceptAlertByText catch " + e.getMessage());
        }
        return SendAlertText;
    }

    public static boolean DismissAlertByText(WebDriver driver, String enterVal ) {
        boolean SendAlertText = false;
        try {
            driver.switchTo().alert().sendKeys(enterVal);
            driver.switchTo().alert().dismiss();
            SendAlertText = true;
        } catch (Exception e) {
            System.out.println("acceptAlertByText catch " + e.getMessage());
        }
        return SendAlertText;
    }
}
