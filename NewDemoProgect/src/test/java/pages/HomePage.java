package pages;

import apps.WebApp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends GenericWebPage{
    private WebDriver driver;

    public HomePage(){
        PageFactory.initElements(WebApp.getDriver(), this);
    }
    @FindBy(id= "shopping_cart_container")
    private WebElement shoppingCartButton;

    public boolean isHomePageOpen(){
        return shoppingCartButton.isDisplayed();
    }

    @FindBy(xpath = "(//div[@class='inventory_item'])[1]")
    private List<WebElement> productItems;

    private void getProductItem (String productItemName) {
        for (int i = 0; i < productItems.size(); i++) {
            if (productItems.get(i).getText().equals(productItemName)) {
                productItems.get(i).getText();
                break;
            }
        }


        // @FindBy(xpath = "(//div[@class='inventory_item'])[1]")
        //private WebElement firstItem;


        // @FindBy(id= "shopping_cart_container")
        // private WebElement shoppingCartButton;


//    @FindBy(xpath = "//button[@class='add-to-cart-button']")
//    private WebElement addToCartButton;
//
//    @FindBy(id= "shopping_cart_container")
//    private WebElement shoppingCartButton;

//    @Step("Add product to cart")
//    private void addProductToCart(){
//        addToCartButton.click();
//    }
//    @Step("Open shopping cart")
//    public ShoppingCartPage openShoppingCart(){
//        shoppingCartButton.click();
//        return new ShoppingCartPage(driver);

    }}
