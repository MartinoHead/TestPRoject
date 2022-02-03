package stepDefinitions;

import pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoSteps_POM {

    WebDriver webDriver = null;
    LoginPage loginPage;

    @When("The user is on login page_POM")
    public void the_user_is_on_login_page() {
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://example.testproject.io/web/");
        webDriver.manage().window().maximize();
    }

    @When("The user enters {word} and {word} _POM")
    public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername(username);
        Thread.sleep(2000);
        loginPage.enterPassword(password);
        Thread.sleep(2000);
    }

    @When("The user click on login button_POM")
    public void theUserClickOnLoginButton() {
        loginPage.clickLogin();
    }

    @Then("The user is navigated to home page_POM")
    public void the_user_is_navigated_to_home_page() throws InterruptedException {
        loginPage.logoutBtnIsDisplayed();
        webDriver.close();
        webDriver.quit();
    }
}


