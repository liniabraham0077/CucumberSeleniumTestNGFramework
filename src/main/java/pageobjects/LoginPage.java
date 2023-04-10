package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.WaitHelper;

public class LoginPage {
    private final WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "user-name")
    private WebElement userNameText;

    @FindBy(id = "password")
    private WebElement passwordText;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void validLogin(String username, String password) {
        userNameText.isEnabled();
        userNameText.clear();
        userNameText.sendKeys(username);

        passwordText.isEnabled();
        passwordText.clear();
        passwordText.sendKeys(password);

        loginButton.click();
    }

    public void waitForPageLoad(){
        WaitHelper.untilPageReadyState(webDriver, 10L);

    }
}
