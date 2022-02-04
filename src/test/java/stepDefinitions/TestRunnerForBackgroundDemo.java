package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/backgroundDemo/BackgroundDemo.feature",
        glue = {"stepsForBackground"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports/report.html",
                "json:target/JSONReports/report.json",
                "junit:target/JUnitReports/report.xml"})
public class TestRunnerForBackgroundDemo {
}
