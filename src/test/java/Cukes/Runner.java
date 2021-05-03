package Cukes;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature/Base.feature",
        glue = {"test.java.Flow.Steps"},
        dryRun = true,
        monochrome = true,
        plugin = {"pretty","html:test-output" }
)
public class Runner {
}
