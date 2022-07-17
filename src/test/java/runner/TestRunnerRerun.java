package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/rerun.txt"},
        glue = {"stepDefination"},
        plugin = {"html:target1/cucumberReport.html"},
        monochrome = true)

public class TestRunnerRerun {
}
