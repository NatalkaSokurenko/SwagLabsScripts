package pages.mobile_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class HomeScreen extends AbstractMobileScreen {

    @AndroidFindBy(accessibility = "ReferenceApp")
    private AndroidElement menuButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login Page']")
    private AndroidElement loginPageMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Alerts']")
    private AndroidElement alertsPageMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Input Controls']")
    private AndroidElement inputControlsPageMenu;

    @Step ("Expand menu")
    public HomeScreen expandMenu(){
        menuButton.click();
        return this;
    }

    @Step ("Open Login screen")
    public LoginScreen clickOnLoginMenu(){
        elementsUtils().waitForElement(loginPageMenu);
        loginPageMenu.click();
        return new LoginScreen();
    }

    @Step ("Open Alerts screen")
    public AlertsScreen clickOnAlertsMenu(){
        elementsUtils().waitForElement(alertsPageMenu);
        alertsPageMenu.click();
        return new AlertsScreen();
    }

    @Step ("Open Input Controls screen")
    public InputControlScreen clickOnInputControlsMenu(){
        elementsUtils().waitForElement(inputControlsPageMenu);
        inputControlsPageMenu.click();
        return new InputControlScreen();
    }



}
