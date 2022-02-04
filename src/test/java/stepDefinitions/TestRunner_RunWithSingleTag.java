package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featuresWithTags/Tags.feature",
        glue = {"stepDefinitions"},
        monochrome = true,
        tags = "@Smoke or @Regression and @Important")
public class TestRunner_RunWithSingleTag {

}
