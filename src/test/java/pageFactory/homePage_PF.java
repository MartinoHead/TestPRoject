package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage_PF {
    @FindBy(id = "logout")
    WebElement logoutBtn;

    WebDriver webDriver;

    public homePage_PF(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void logoutBtnIsDisplayed(){
        logoutBtn.isDisplayed();
    }
}
