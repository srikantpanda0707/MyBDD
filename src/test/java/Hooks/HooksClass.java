package Hooks;

import Tools.BaseClass;
import Utils.ConfigDataProvider;
import Utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class HooksClass {

    Logger log = Logger.getLogger(HooksClass.class.getName());
    private WebDriver driver;


    @Before(value = "@Skip", order = 0)

    public void SkipScenario(Scenario scenario){
        log.info("*************************Skiped the scenario*****************************");
        System.out.println("Scenario skiped are "+scenario.getName());
        Assume.assumeTrue(false);

    }

    @Before(order = 1)
    public void LaunchBrowser() throws MalformedURLException {
        log.info("*************************Launching browser*****************************");
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        URL RL = new URL("http://localhost:4444/wd/hub");
//        RemoteWebDriver Driver = new RemoteWebDriver(RL,dc);
//        Driver.get(PropertyReader.getProperty("url"));
//        System.out.println("title of page "+ Driver.getTitle());
        String browserName = PropertyReader.getProperty("browser");
        BaseClass BC = new BaseClass();
        driver = BC.init_driver(browserName);


    }

    @After(order = 0)
    public void teardown() {
        log.info("*************************Browser got closed*****************************");
        driver.quit();
    }

    @After(order = 0)
    public void ScreenShot(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot:
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
            log.info("*************************Screen shot for failed test cases*****************************");
        }
    }

}
