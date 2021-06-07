package Tools;

import Actions.ObjectGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {
    ObjectGenerator OG = new ObjectGenerator(BaseClass.getDriver());

    public  boolean check(WebDriver driver, WebElement element) {
        boolean isChecked = false;
        try {
            isChecked = element.isSelected();
            System.out.println("check bool value" + isChecked);
            if (!isChecked) {
                OG.sync.waitForSeconds(3000);
                System.out.println("not selected inside if " + isChecked);
                isChecked = OG.ele.Jsclick(driver, element);
                System.out.println("check inside if isChecked JSClick " + isChecked);
            }
        } catch (Exception Ex) {
            System.out.println("check " + Ex.getMessage());
        }

        System.out.println("isChecked check " + isChecked);
        return isChecked;
    }

    public  boolean unCheck(WebDriver driver, WebElement element) {

        boolean isUnChecked = false;
        boolean isSelected = element.isSelected();
        if (isSelected) {
            OG.sync.waitForSeconds(4000);
            isUnChecked = OG.ele.Jsclick(driver, element);
            OG.sync.waitForSeconds(400);
            isUnChecked = true;
        }
        return isUnChecked;

    }

    public  boolean isChecked(WebDriver driver, WebElement element) {
        boolean isSelected = false;
            if (element.isSelected()) {
                isSelected = true;
            }

        return isSelected;
    }
    public  boolean isCheckable(WebDriver driver, WebElement element) {

        boolean blResult = false;
            element = OG.sync.ExplicityWait(driver, element, 500);
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
