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
import pages.HomePage;

@Epic("MAIN EPIC")
@Feature("Login")
@Story("RANDOM-1")
public class LoginValidUser extends GenericWebTest {
    private WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = getWebDriver();
    }

    @Test
    public void testLoginValidUser() {
        HomePage homePage = openWebApp(driver, Constant.URL).loginAs(Constant.USERNAME, Constant.PASSWORD);

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html",
                "User is not on the Home page ");
    }
    @AfterClass
    public void afterClass() {
        closeBrowser(driver);
    }


}
