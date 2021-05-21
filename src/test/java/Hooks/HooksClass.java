package Hooks;

import Tools.BaseClass;
import Utils.ConfigDataProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class HooksClass extends BaseClass {

    ConfigDataProvider cdp = new ConfigDataProvider();

    @Before
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        property = cdp.returnProperty();
        driver.get(property.getProperty("URL"));
    }
    @After
    public void QuitBrowser(){
        driver.quit();
    }

}
