package pages;

import apps.WebApp;
import data.UserData;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends GenericWebPage{

    public CheckoutPage() {
        PageFactory.initElements(WebApp.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
    private WebElement zipCodefield;

    @FindBy(xpath = "//input[@class='cart_checkout_link']")
    private WebElement continuebutton;

    @Step("Fill checkout form")
    public CheckoutOverviewPage checkoutAs(UserData data){
        firstNameField.sendKeys(data.getFirstName());
        lastNameField.sendKeys(data.getLastName());
        zipCodefield.sendKeys(data.getZipCode());
        continuebutton.click();
        return new CheckoutOverviewPage();
    }
}
