package stepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HooksDemoSteps {
    WebDriver webDriver = null;

    @Before(value="@smoke", order=1)
    public void browserSetup() {
        System.out.println("I am inside browserSetup");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        webDriver.manage().window().maximize();
        System.out.println("Browser is open");
    }

    @Before(order=0)
    public void setup2(){
        System.out.println("I am inside setup2 \n");
    }

    @After(order=1)
    public void tearDown() {
        System.out.println("I am inside tearDown");
        webDriver.close();
        webDriver.quit();
    }

    @After(order=2)
    public void tearDown2(){
        System.out.println("I am inside tearDown2 \n");
    }

    @BeforeAll
    public static void beforeSteps() {
        System.out.println("I am inside beforeSteps...");
    }

    @AfterStep
    public void afterSteps() {
        System.out.println("I am inside afterSteps...");
    }

    @Given("The user is on login page")
    public void the_user_is_on_login_page() {
    }

    @When("The user enters username and password")
    public void the_user_enters_username_and_password() {

    }

    @When("The user click on login button")
    public void the_user_click_on_login_button() {

    }

    @Then("The user is navigated to home page")
    public void the_user_is_navigated_to_home_page() {

    }
}
