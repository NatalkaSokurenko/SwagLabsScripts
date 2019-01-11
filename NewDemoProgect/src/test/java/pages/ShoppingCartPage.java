package pages;

import apps.WebApp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@class='cart_checkout_link']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//*[@class='remove-from-cart-button']")
    private WebElement removeButton;

    @FindBy(xpath = "//*[@class='cart_cancel_link']")
    private WebElement continueShoppingButton;

    public ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(WebApp.getDriver(), this);
    }
}
