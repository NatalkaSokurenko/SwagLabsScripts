package tests.web_test;
import app.WebApp;
import io.qameta.allure.Step;
import org.testng.annotations.AfterClass;
import pages.web_pages.LoginPage;

public class GenericWebTest extends WebApp {

    @Step("Open Web app")
    public LoginPage openWebApp(String url){
        getDriver().get(url);
        return new LoginPage();
    }
    @AfterClass(alwaysRun = true)
    public void closeBrowser(){
        closeWebApp();
    }

}
