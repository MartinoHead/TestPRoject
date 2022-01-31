package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoSteps {

    WebDriver webDriver = null;

    @When("The user is on login page")
    public void the_user_is_on_login_page() {
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://example.testproject.io/web/");
        webDriver.manage().window().maximize();
    }

    @When("The user enters {word} and {word}")
    public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
        webDriver.findElement(By.id("name")).sendKeys(username);
        Thread.sleep(2000);
        webDriver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
    }

    @When("The user click on login button")
    public void theUserClickOnLoginButton() {
        webDriver.findElement(By.id("login")).click();
    }

    @Then("The user is navigated to home page")
    public void the_user_is_navigated_to_home_page() throws InterruptedException {
        webDriver.findElement(By.id("logout")).isDisplayed();
        Thread.sleep(3000);
        webDriver.close();
        webDriver.quit();
    }
}
