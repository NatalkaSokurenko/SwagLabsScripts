package tools;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Browser {
    private String defaultBrowser = "chrome";
    private String pathToDriverFolder = System.getProperty("user.dir")
            + File.separator + "drivers" + File.separator
            + getOsDriverFolder() + File.separator;

    private String getCurrentOsName(){
        return System.getProperty("os.name");
    }

    @Step("Open browser")
    public WebDriver getWebDriver() {
        String browserName;
        if(System.getProperty("browser") == null){
            browserName = defaultBrowser;
        } else {
            browserName = System.getProperty("browser");
        }

        WebDriver driver = getDriverByType(browserName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
    private String getOsDriverFolder(){
        String osName = getCurrentOsName();
        switch (osName){
            case "Windows 10":
                return "window";

            case "Windows 8.1":
                return "window";

            case "Mac OS X":
                return "macOs";

            default:
                throw new IllegalStateException("Unknown OS name");
        }
    }

    public WebDriver getDriverByType(String browserName){
        switch (browserName){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", pathToDriverFolder + "chromedriver");
                return new ChromeDriver();

            case "firefox":
                System.setProperty("webdriver.gecko.driver", pathToDriverFolder + "geckodriver");
                return new FirefoxDriver();

            default:
                throw new IllegalStateException("Please, provide existed browser " +
                        "name due to current is unknown " + browserName);
        }
    }
    public static void main(String[] args) {
        System.out.println(new Browser ().getCurrentOsName());
    }
}
