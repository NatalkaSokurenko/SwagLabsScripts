package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Browser {
    private String pathToDriverFolder = System.getProperty("user.dir")
            + File.separator + "drivers" + File.separator;

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

}
