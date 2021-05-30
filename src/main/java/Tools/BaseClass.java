package Tools;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Properties;


public class BaseClass {

    public static WebDriver driver;

    public WebDriver Init_Driver(String browser){

        if (browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (browser.equals("IE Driver")){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        Sync.ImplicityWait(20);
        driver.manage().window().maximize();
        return getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

}
