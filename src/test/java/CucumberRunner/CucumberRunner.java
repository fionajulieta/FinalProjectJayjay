package CucumberRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:report/cucumber-report.html", "json:report/cucumber-report.html"},
        glue = {"DummyAPITest/StepDef"},
        features = {"src/test/java/features"}
)

public class CucumberRunner {
}