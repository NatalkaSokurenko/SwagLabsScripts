package webtests;

import data.Constant;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;


@Epic("MAIN EPIC")
@Feature("Login")
@Story("RANDOM-2")
public class LoginInvalidUser extends GenericWebTest {
    private WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = getWebDriver();
    }

    @Test
    public void testLoginInvalidUser() {
        LoginPage loginPage = openWebApp(driver, Constant.URL).loginInvalidUserAs(Constant.INVALID_USERNAME, Constant.PASSWORD);

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/",
                "User is not on the Login page ");
    }
    @AfterClass
    public void afterClass() {
        closeBrowser(driver);
    }
}
