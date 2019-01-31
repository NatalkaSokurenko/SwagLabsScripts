package pages.mobile_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class LoginScreen extends AbstractMobileScreen {

    @AndroidFindBy(accessibility = "Username Input Field")
    private AndroidElement userNameField;

    @AndroidFindBy(accessibility = "Password Input Field")
    private AndroidElement passwordField;

    @AndroidFindBy(accessibility = "Login Button")
    private AndroidElement loginButton;

    @AndroidFindBy(accessibility = "Alt Message")
    private AndroidElement errorMessage;

    @Step("Fill login form")
    private void fillForm(String username, String password){
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public LoginScreen loginAs(String username, String password){
        fillForm(username, password);
        loginButton.click();
        return new LoginScreen();
    }
    @Step
    public String getErrorMessageText(){
        return errorMessage.getText();
    }


}
