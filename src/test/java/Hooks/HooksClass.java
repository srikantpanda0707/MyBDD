package Hooks;

import Tools.BaseClass;
import Utils.ConfigDataProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HooksClass extends BaseClass  {


ConfigDataProvider cdp = new ConfigDataProvider();

    @Before
    public void LaunchBrowser(){

//        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//        driver = new ChromeDriver();

     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//     BaseClass instanceDriver = BaseClass.getInstanceDriver();
        Properties property = cdp.returnProperty();
     driver.get(property.getProperty("URL"));
//        driver = instanceDriver.Init_Driver(property.getProperty("browser"));


    }
    @After
    public void TearDown(){
     BaseClass.QuitBrowser();
    }

}
