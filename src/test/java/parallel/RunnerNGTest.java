package parallel;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
@CucumberOptions(features = "src/test/resources/parallel",
        glue = {"parallel", "Hooks"},
        plugin = {"pretty", "html:testoutput/testReport.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@TC10",
//        dryRun = true,
        monochrome = true

)

public class RunnerNGTest extends AbstractTestNGCucumberTests {
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}
