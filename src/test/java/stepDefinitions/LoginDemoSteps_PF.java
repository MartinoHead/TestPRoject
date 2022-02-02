package stepDefinitions;

import pageFactory.homePage_PF;
import pageFactory.loginPage_PF;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoSteps_PF {

    WebDriver webDriver = null;
    loginPage_PF loginPage_pf;
    homePage_PF homePage_pf;

    @When("The user is on login page_PF")
    public void the_user_is_on_login_page() {
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://example.testproject.io/web/");
        webDriver.manage().window().maximize();
    }

    @When("The user enters {word} and {word} _PF")
    public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
        loginPage_pf = new loginPage_PF(webDriver);
        loginPage_pf.enterUsername(username);
        loginPage_pf.enterUPassword(password);
        Thread.sleep(2000);
    }

    @When("The user click on login button_PF")
    public void theUserClickOnLoginButton() {
        loginPage_pf.clickLogin();
    }

    @Then("The user is navigated to home page_PF")
    public void the_user_is_navigated_to_home_page() throws InterruptedException {
        homePage_pf = new homePage_PF(webDriver);
        homePage_pf.logoutBtnIsDisplayed();
        webDriver.close();
        webDriver.quit();
    }
}
