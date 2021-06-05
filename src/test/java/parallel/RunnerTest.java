package parallel;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/parallel",
        glue = {"parallel","Hooks"},
        plugin = {"pretty","html:testoutput/testReport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@TC05",
//        dryRun = true,
        monochrome = true

        )
//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
//com.cucumber.listener.ExtentCucumberFormatter:testoutput/testReport.html

//https://cucumber.io/docs/guides/parallel-execution/

public class RunnerTest {


}
