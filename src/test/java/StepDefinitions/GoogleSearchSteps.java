package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSearchSteps {

    private By googleSearchInput = By.name("q");
    private By googleAcceptCookies = By.id("L2AGLb");
    WebDriver webDriver = null;

    @Given("Open browser")
    public void open_browser() {
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is" + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        System.out.println("Browser is open");
    }

    @When("The user is on google search page")
    public void the_user_is_on_google_search_page() {
        webDriver.navigate().to("http://www.google.bg");
        System.out.println("User is on Google search page");
    }

    @When("The user accept google cookies")
    public void the_user_accept_google_cookies() {
        webDriver.findElement(By.id("L2AGLb")).click();
        System.out.println("The user accept google cookies");
    }

    @When("The user enter text on google search")
    public void the_user_enter_text_on_google_search() throws InterruptedException {
        webDriver.findElement(By.name("q")).sendKeys("Automation Step by Step");
        Thread.sleep(2000);
        System.out.println("The user enter text on google search");
    }

    @When("The user press ENTER button")
    public void the_user_press_enter_button() throws InterruptedException {
        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println("The user press ENTER button");

    }

    @Then("The user is navigated to search results")
    public void the_user_is_navigated_to_search_results() {
        webDriver.getPageSource().contains("Online Courses");
        System.out.println("The user is navigated to search results");
        webDriver.close();
        webDriver.quit();
    }
}
