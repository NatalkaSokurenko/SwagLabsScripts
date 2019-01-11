package webtests;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import tools.Browser;
import java.util.concurrent.TimeUnit;

public class GenericWebTest {
    public WebDriver driver;
    private String defaultBrowser = "chrome";

    @BeforeClass
    public void beforeClass(){
        driver = getWebDriver();
    }

    @Step("Open browser")
    public WebDriver getWebDriver() {
        String browserName;
        if(System.getProperty("browser") == null){
            browserName = defaultBrowser;
        } else {
            browserName = System.getProperty("browser");
        }

        WebDriver driver = new Browser().getDriverByType(browserName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
    @Step("Open Web app")
    public LoginPage openWebApp(WebDriver driver, String url){
        driver.get(url);
        return new LoginPage(driver);
    }
    @Step("Close browser")
    public void closeBrowser(WebDriver driver){
        driver.quit();
    }

}
