package pages;

import apps.WebApp;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends GenericWebPage {

    public HomePage() {
        PageFactory.initElements(WebApp.getDriver(), this);
    }

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartButton;

    public boolean isHomePageOpen() {
        return shoppingCartButton.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='inventory_item'][1]//*[@class='add-to-cart-button']")
    private WebElement addToCartFirstItemButton;

    @FindBy(xpath = "//div[@class='inventory_item'][1]//*[@class='inventory_item_name']")
    public WebElement firstItemNameElement;

    @FindBy(xpath = "//div[@class='inventory_item'][2]//*[@class='add-to-cart-button']")
    private WebElement addToCartSecondItemButton;

    @FindBy(xpath = "//div[@class='inventory_item'][2]//*[@class='inventory_item_name']")
    public WebElement secondItemNameElement;

    public String firstItemName;
    public String secondItemName;

    @Step("Add First item to shopping cart")
    private void addFirstItemToShoppingCart() {
        addToCartFirstItemButton.click();
    }

    @Step("Add Second item to shopping cart")
    private void addSecondItemToShoppingCart() {
        addToCartSecondItemButton.click();
    }

    public ShoppingCartPage addItemsAndOpenShoppingCart() {
        addFirstItemToShoppingCart();
        addSecondItemToShoppingCart();
        firstItemName = firstItemNameElement.getText();
        secondItemName = secondItemNameElement.getText();
        shoppingCartButton.click();
        return new ShoppingCartPage();
    }
}




//    @FindBy(xpath = "(//div[@class='inventory_item'])[1]")
//    private List<WebElement> productItems;
//
//    private void getProductItem (String productItemName) {
//        for (int i = 0; i < productItems.size(); i++) {
//            if (productItems.get(i).getText().equals(productItemName)) {
//                productItems.get(i).getText();
//                break;
//            }



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


