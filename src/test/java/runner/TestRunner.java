package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				tags = "@Test1 or @Test2 or @Test3",
				features = {"src/test/resources/features/"},
				glue = {"stepDefination"},
				plugin = {"html:target/cucumberReport.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/rerun.txt"},
				monochrome = true,
				dryRun = false)

public class TestRunner {
	
}
