package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver;
    public static void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver","E://Caesar//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void geturl(String url) {
        driver.get(url);
    }
    public static void QuitBrowser(){
        driver.quit();
    }

}
