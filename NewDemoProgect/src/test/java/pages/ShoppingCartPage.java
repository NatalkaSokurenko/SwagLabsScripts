package pages;

import apps.WebApp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webtests.GenericWebTest;

public class ShoppingCartPage extends GenericWebPage {

    public ShoppingCartPage() {
        PageFactory.initElements(WebApp.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='cart_checkout_link']")
    private WebElement checkoutButton;

    public CheckoutPage checkout() {
        checkoutButton.click();
        return new CheckoutPage();
    }
}
