package webtests;
import apps.WebApp;
import io.qameta.allure.Step;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class GenericWebTest extends WebApp {

    //@BeforeClass
    public void beforeClass(){
        getDriver();
    }
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
