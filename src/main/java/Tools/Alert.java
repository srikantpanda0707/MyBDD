package Tools;

import Utils.ObjectGenerator;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;

import static Tools.AppiumDriver.getObjectGenerator;

public class Alert {
    ObjectGenerator OG = getObjectGenerator();

//    ObjectGenerator OG = new ObjectGenerator();
    Logger log = Logger.getLogger(Alert.class.getName());

    public  boolean switchToAlert(WebDriver driver) {
        boolean isAlertSwitched = false;
        try {
            driver.switchTo().alert();
            isAlertSwitched = true;
        } catch (Exception e) {
            log.info("switchToAlert catch " + e.getMessage());
        }
        return isAlertSwitched;
    }

    public  boolean acceptAlert(WebDriver driver) {
        boolean isAlertAccepted = false;
        try {
            OG.sync.waitForSeconds(3000);
            driver.switchTo().alert().accept();
            isAlertAccepted = true;
        } catch (Exception e) {
            log.info("switchToAlert catch " + e.getMessage());
        }
        return isAlertAccepted;
    }

    public  boolean dismissAlert(WebDriver driver){
        boolean isAlertDismissed = false;
        try {
            OG.sync.waitForSeconds(3000);
            driver.switchTo().alert().dismiss();
            isAlertDismissed = true;
        }
        catch (Exception e){
            log.info("Dismissalert catch " + e.getMessage());
        }
        return  isAlertDismissed;
    }

    public  boolean GetAlertMessage(WebDriver driver) {
        boolean GetAltMss = false;
        try {
            driver.switchTo().alert().getText();
            GetAltMss = true;
        } catch (Exception e) {
            log.info("GetAlertMessage catch " + e.getMessage());
        }
        return GetAltMss;
    }

    public  boolean acceptAlertByText(WebDriver driver, String enterVal ) {
        boolean SendAlertText = false;
        try {
            driver.switchTo().alert().sendKeys(enterVal);
            driver.switchTo().alert().accept();
            SendAlertText = true;
        } catch (Exception e) {
            log.info("acceptAlertByText catch " + e.getMessage());
        }
        return SendAlertText;
    }

    public  boolean DismissAlertByText(WebDriver driver, String enterVal ) {
        boolean SendAlertText = false;
        try {
            driver.switchTo().alert().sendKeys(enterVal);
            driver.switchTo().alert().dismiss();
            SendAlertText = true;
        } catch (Exception e) {
            log.info("acceptAlertByText catch " + e.getMessage());
        }
        return SendAlertText;
    }
}
