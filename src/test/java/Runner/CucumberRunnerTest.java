package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
        glue = {"Flow","Hooks"},
        plugin = {"html:testoutput/testReport.html"}
        )
public class CucumberRunnerTest {
}
