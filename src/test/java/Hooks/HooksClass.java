package Hooks;

import Tools.BaseClass;
import Utils.ConfigDataProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.Properties;

public class HooksClass extends BaseClass {

    BaseClass BC = new BaseClass();
ConfigDataProvider cdp = new ConfigDataProvider();
    private Properties property;

 @Before
    public void LaunchBrowser(){

//        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//     WebDriverManager.chromedriver().setup();
//     driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        property = cdp.returnProperty();
        BC.Init_Driver(property.getProperty("browser"));
        driver.get(property.getProperty("URL"));
    }
    @After
    public void QuitBrowser(){
        driver.quit();
    }

}
