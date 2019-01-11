package webtests;


import data.Constant;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShoppingCartPage;

@Epic("MAIN EPIC")
@Feature("Add items to cart")
@Story("RANDOM-3")
public class AddItemsToCart extends GenericWebTest{
    private WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = getWebDriver();
    }

    @Test
    public void testAdditemsToCart() {
        HomePage homePage = openWebApp(driver, Constant.URL).loginAs(Constant.USERNAME, Constant.PASSWORD);
        //ShoppingCartPage shoppingCartPage =
        System.out.println();


    }

}
