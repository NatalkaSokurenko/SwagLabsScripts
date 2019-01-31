package tests.mobile_test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mobile_pages.HomeScreen;
import pages.mobile_pages.LoginScreen;

@Epic("MOBILE APP TESTS")
@Feature("LOGIN")
@Story("RANDOM-4")
public class LoginInvalidUserTest extends GenericMobileTest{
    @Test
    public void testLogin(){

        HomeScreen homeScreen = new HomeScreen();
        LoginScreen loginScreen = homeScreen.expandMenu().clickOnLoginMenu().loginAs("user123","password123");

        Assert.assertEquals(loginScreen.getErrorMessageText(), "You gave me the wrong username and password",
                "Error message is not displayed");
    }
}
