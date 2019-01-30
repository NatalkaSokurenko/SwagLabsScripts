package tests.web_test;

import data.Constant;
import data.UserData;
import data.UserDataProvider;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.web_pages.CheckoutOverviewPage;
import pages.web_pages.HomePage;
import java.util.List;

@Epic("WEB TESTS")
@Feature("ADD TO CART")
@Story("RANDOM-3")
public class AddItemsToCart extends GenericWebTest{
    private UserData userData;
    @BeforeClass
    public void beforeClass() {
        userData = new UserDataProvider().generateUserData();
    }

    @Test
    public void testAddItemsToCart() {
        HomePage homePage = openWebApp(Constant.URL).loginAs(Constant.USERNAME, Constant.PASSWORD);
        CheckoutOverviewPage checkoutOverviewPage = homePage.addItemsAndOpenShoppingCart().checkout().checkoutAs(userData);

        List<String> names = checkoutOverviewPage.getNames();
        Assert.assertTrue(names.contains(homePage.firstItemName), homePage.firstItemName + " is not added to cart");
        Assert.assertTrue(names.contains(homePage.secondItemName), homePage.secondItemName + " is not added to cart");
    }
}
