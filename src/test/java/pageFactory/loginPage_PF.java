package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class loginPage_PF {
    @FindBy(id = "name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login")
    WebElement loginBtn;

    @FindBy(id="links")
    List<WebElement> myLinks;

    WebDriver webDriver;

    public loginPage_PF(WebDriver webDriver) {
        this.webDriver = webDriver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(webDriver, 30);
        PageFactory.initElements(factory, this);
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterUPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }


}
