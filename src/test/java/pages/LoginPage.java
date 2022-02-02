package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver webDriver;
    private By usernameInput = By.id("name");
    private By passwordInput = By.id("password");
    private By loginBtn = By.id("login");
    private By logoutBtn = By.id("logout");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        if(!webDriver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not Login Page. The current page is " + webDriver.getCurrentUrl());
        }
    }

    public void enterUsername(String username) {
        webDriver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        webDriver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        webDriver.findElement(loginBtn).click();
    }

    public void logoutBtnIsDisplayed() {
        webDriver.findElement(logoutBtn).isDisplayed();
    }

    public void loginValidUser(String username, String password) {
        webDriver.findElement(usernameInput).sendKeys(username);
        webDriver.findElement(passwordInput).sendKeys(password);
        webDriver.findElement(loginBtn).click();
    }
}
