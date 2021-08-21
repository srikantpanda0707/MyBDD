package Hooks;

import Tools.AppiumDriver;
import Tools.RemoteDriver;
import Utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;
import java.util.logging.Logger;

public class HooksClass {

    Logger log = Logger.getLogger(HooksClass.class.getName());
    protected WebDriver driver;


    @Before(value = "@Skip", order = 0)

    public void SkipScenario(Scenario scenario){
        log.info("*************************Skiped the scenario*****************************");
        System.out.println("Scenario skiped are "+scenario.getName());
        Assume.assumeTrue(false);

    }
    @Before(order = 1)
    public void LaunchBrowser() throws MalformedURLException {
        log.info("*************************Launching browser*****************************");
        AppiumDriver AP = new AppiumDriver();
        String browser = PropertyReader.getProperty("browser");
        driver = AP.init_APdriver(browser);

//        RemoteDriver RD = new RemoteDriver();
//        String browser = PropertyReader.getProperty("browser");
//        driver = RD.init_Rdriver(browser);
//        String browsername = PropertyReader.getProperty("browser");
//        String browsername1 = PropertyReader.getProperty("browser1");
//        if (browser.equalsIgnoreCase("chrome")) {
//            BaseClass BC = new BaseClass();
//            driver = BC.init_driver(browsername);
//        }else if (browser.equalsIgnoreCase("firefox")){
//            BaseClass BC = new BaseClass();
//            driver = BC.init_driver(browsername1);
//        }

    }

    @After(order = 0)
    public void teardown() {
        log.info("*************************Browser got closed*****************************");
        driver.quit();
    }

    @After(order = 1)
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
