package pages.web_pages;

import app.WebApp;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends GenericWebPage {

    @FindBy(id = "user-name")
    private WebElement usernameElement;

    @FindBy(id = "password")
    private WebElement passwordElement;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorMessage;

    public LoginPage(){
        PageFactory.initElements(WebApp.getDriver(), this);
    }

    @Step("Fill login form")
    private void fillForm(String username, String password){
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButton.click();
    }

    @Step("Fill login form with invalid data")
    private void fillFormWithInvalidData(String username, String password) {
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButton.click();
    }

    public boolean isErrorMessageDisplayed(){
        return errorMessage.isDisplayed();
    }

    public HomePage loginAs(String username, String password){
        fillForm(username, password);
        return new HomePage();
    }
    public LoginPage loginInvalidUserAs(String username, String password){
        fillFormWithInvalidData(username, password);
        return new LoginPage();
    }
}
