package tests.web_test;

import data.Constant;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.web_pages.LoginPage;

@Epic("WEB TESTS")
@Feature("LOGIN")
@Story("RANDOM-2")
public class LoginInvalidUser extends GenericWebTest {

    @Test
    public void testLoginInvalidUser() {
        LoginPage loginPage = openWebApp(Constant.URL).loginInvalidUserAs(Constant.INVALID_USERNAME, Constant.PASSWORD);

        Assert.assertTrue(loginPage.isErrorMessageDisplayed(),
                "Error message is not displayed ");
    }
}
