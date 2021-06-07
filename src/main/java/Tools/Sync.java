package Tools;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

public class Sync    {

    public  void waitForSeconds(int lngSeconds) {
        try {
            Thread.sleep( lngSeconds);

        } catch (Exception e) {
            System.out.println("Static wait "+e);
        }
    }

    public  void PageWait(WebDriver driver,long lngSeconds){

        try {
            driver.manage().timeouts().pageLoadTimeout(lngSeconds, TimeUnit.SECONDS);
        }
        catch (Exception e){
            System.out.println("Dynamic wait "+e);
        }

    }

    public  void ImplicityWait(WebDriver driver,long lngSeconds){

        try {
            driver.manage().timeouts().implicitlyWait(lngSeconds, TimeUnit.SECONDS);
        }
        catch (Exception e){
            System.out.println("Dynamic wait "+e);
        }

    }

    public  WebElement ExplicityWait(WebDriver driver, WebElement element, int timeout){

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        catch (Exception e){
            System.out.println("Dynamic wait "+e);
        }


        return element;
    }





}
