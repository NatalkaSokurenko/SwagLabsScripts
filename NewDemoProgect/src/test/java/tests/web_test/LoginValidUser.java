package tests.web_test;

import data.Constant;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.web_pages.HomePage;

@Epic("WEB TESTS")
@Feature("LOGIN")
@Story("RANDOM-1")
public class LoginValidUser extends GenericWebTest {

    @Test
    public void testLoginValidUser() {
        HomePage homePage = openWebApp(Constant.URL).loginAs(Constant.USERNAME, Constant.PASSWORD);

        Assert.assertTrue(homePage.isHomePageOpen(),
                "User is not logged into application");
    }
}
