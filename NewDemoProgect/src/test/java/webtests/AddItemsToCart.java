package webtests;


import data.Constant;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.HomePage;

@Epic("MAIN EPIC")
@Feature("Add items to cart")
@Story("RANDOM-3")
public class AddItemsToCart extends GenericWebTest{

    @Test
    public void testAdditemsToCart() {
        HomePage homePage = openWebApp(Constant.URL).loginAs(Constant.USERNAME, Constant.PASSWORD);
        //ShoppingCartPage shoppingCartPage =
        System.out.println();


    }

}
