package parallel;



import Tools.BaseClass;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.logging.Logger;

@CucumberOptions(features = "src/test/resources/parallel",
        glue = {"parallel", "Hooks"},
        plugin = {"pretty", "html:testoutput/testReport.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "not @Skip",
//        dryRun = true,
        monochrome = true

)

public class RunnerNGTest extends AbstractTestNGCucumberTests {
    Logger log = Logger.getLogger(RunnerNGTest.class.getName());

    protected WebDriver driver;
//    @BeforeClass()
//    public void SkipScenario(Scenario scenario){
//        log.info("*************************Skiped the scenario*****************************");
//        System.out.println("Scenario skiped are "+scenario.getName());
//        Assume.assumeTrue(false);
//
//    }
    @Parameters("BrowserType")
    @BeforeClass
    public void LaunchBrowser(@Optional("Chrome") String Browser){
        log.info("*************************Launching browser*****************************");
//        String browsername = PropertyReader.getProperty(Browser);
            BaseClass BC = new BaseClass();
            driver = BC.init_driver(Browser);
    }

    @AfterClass
    public void teardown() {
        log.info("*************************Browser got closed*****************************");
        driver.quit();}

//    @AfterClass
//    public void ScreenShot(Scenario scenario) {
//        if (scenario.isFailed()) {
//            // take screenshot:
//            String screenshotName = scenario.getName().replaceAll(" ", "_");
//            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(sourcePath, "image/png", screenshotName);
//            log.info("*************************Screen shot for failed test cases*****************************");
//        }
//    }


//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}
