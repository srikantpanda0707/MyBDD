package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    public static boolean check(WebDriver driver, WebElement element) {
        boolean isChecked = false;
        try {
            isChecked = element.isSelected();
            System.out.println("check bool value" + isChecked);
            if (!isChecked) {
                Sync.waitForSeconds(3);
                System.out.println("not selected inside if " + isChecked);
                isChecked = Elements.Jsclick(driver, element);
                System.out.println("check inside if isChecked JSClick " + isChecked);
            }
        } catch (Exception Ex) {
            System.out.println("check " + Ex.getMessage());
        }

        System.out.println("isChecked check " + isChecked);
        return isChecked;
    }

    public static boolean unCheck(WebDriver driver, WebElement element) {

        boolean isUnChecked = false;
        boolean isSelected = element.isSelected();
        if (isSelected) {
            Sync.waitForSeconds(4);
            isUnChecked = Elements.Jsclick(driver, element);
            Sync.waitForSeconds(4);
            isUnChecked = true;
        }
        return isUnChecked;

    }

    public static boolean isChecked(WebDriver driver, WebElement element) {
        boolean isSelected = false;
            if (element.isSelected()) {
                isSelected = true;
            }

        return isSelected;
    }
    public static boolean isCheckable(WebDriver driver, WebElement element) {

        boolean blResult = false;
            element = Sync.ExplicityWait(driver, element, 5);
            if (element.isDisplayed()) {
                if (element.isEnabled()) {
                    if (!element.isSelected()) {
                        blResult = true;
                    }
                }
            }

        return blResult;
    }





}
