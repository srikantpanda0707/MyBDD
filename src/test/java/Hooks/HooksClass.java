package Hooks;

import Tools.BaseClass;
import Utils.ConfigDataProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class HooksClass {

    private BaseClass BC;
    private ConfigDataProvider CDP;
    Properties prop;
    private WebDriver driver;


    @Before(order = 0)
    public void getProperty() {
        CDP = new ConfigDataProvider();
        prop = CDP.DataProvider();
    }


    @Before(order = 1)
    public void LaunchBrowser() {
        String browserName = prop.getProperty("browser");
        BC = new BaseClass();
        driver = BC.init_driver(browserName);
        driver.get(prop.getProperty("URL"));
    }

    @After
    public void teardown() {
        driver.quit();
    }

}
