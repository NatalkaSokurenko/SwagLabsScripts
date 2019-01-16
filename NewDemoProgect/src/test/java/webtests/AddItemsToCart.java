package webtests;

import data.Constant;
import data.UserData;
import data.UserDataProvider;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CheckoutOverviewPage;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;


@Epic("MAIN EPIC")
@Feature("Add items to cart")
@Story("RANDOM-3")
public class AddItemsToCart extends GenericWebTest{
    private UserData userData;

    @Override
    @BeforeClass
    public void beforeClass() {
        super.beforeClass();
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
