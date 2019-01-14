package webtests;

import data.Constant;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


@Epic("MAIN EPIC")
@Feature("Login")
@Story("RANDOM-2")
public class LoginInvalidUser extends GenericWebTest {

    @Test
    public void testLoginInvalidUser() {
        LoginPage loginPage = openWebApp(Constant.URL).loginInvalidUserAs(Constant.INVALID_USERNAME, Constant.PASSWORD);

        Assert.assertTrue(loginPage.isErrorMessageDisplayed(),
                "Error message is not displayed ");
    }
}
