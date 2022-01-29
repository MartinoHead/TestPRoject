package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("User enters username and password");
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click on login button")
    public void user_click_on_login_button() {
        System.out.println("User click on login button");
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("User is logged in")
    public void user_is_logged_in() {
        System.out.println("User is logged in");
        // Write code here that turns the phrase above into concrete actions
    }
}
