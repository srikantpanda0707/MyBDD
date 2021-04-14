package Tools;

import org.openqa.selenium.WebElement;

public class Elements {

    public static boolean verifyElement(WebElement element) {
        boolean blResult = false;
        try {
            if (element.isDisplayed()) {
                blResult = true;
            } else {
                blResult = false;
            }
        } catch (Exception e) {
            System.out.println("VerifyElement Fails"+e);
        }
        return blResult;
    }
}
