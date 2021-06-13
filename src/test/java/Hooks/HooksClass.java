package Hooks;

import Tools.BaseClass;
import Utils.ConfigDataProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class HooksClass {

    Properties prop;
    private WebDriver driver;


    @Before(order = 0)
    public void getProperty() {
        ConfigDataProvider CDP = new ConfigDataProvider();
        prop = CDP.DataProvider();
    }


    @Before(order = 1)
    public void LaunchBrowser() {
        String browserName = prop.getProperty("browser");
        BaseClass BC = new BaseClass();
        driver = BC.init_driver(browserName);
        driver.get(prop.getProperty("URL"));
    }

    @After(order = 0)
    public void teardown() {
        driver.quit();
    }

    @After(order = 1)
    public void ScreenShot(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot:
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);

        }
    }

}
