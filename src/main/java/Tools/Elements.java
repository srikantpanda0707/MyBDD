package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Elements extends BaseClass{

    public Elements(){super();}

    public static void verifyElement(WebElement element) {
        //boolean blResult = false;
        try {
            if (element.isDisplayed()) {
                System.out.println("VerifyElement pass");
                //blResult = true;
            } else {
                System.out.println("VerifyElement Try Fails ");
            }
        } catch (Exception e) {
            System.out.println("VerifyElement Fails "+e);
        }
    }

    public static void click(WebDriver driver, WebElement element) {
        //boolean blResult = false;
        try {
             element.click();
            //blResult = true;
        } catch (Exception e) {
            System.out.println("Click is failed "+e);
        }
    }
    public static boolean mouseClick(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            actions.click();
            actions.build().perform();
            blResult = true;
        } catch (Exception e) {
            System.out.println("MouseClick is failed "+e);
        }
        return blResult;
    }

}
