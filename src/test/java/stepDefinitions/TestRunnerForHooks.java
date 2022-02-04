package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/hooksDemo/hooksDemo.feature",
        glue = {"stepsForHooks"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports/report.html",
                "json:target/JSONReports/report.json",
                "junit:target/JUnitReports/report.xml"})
public class TestRunnerForHooks {
}
