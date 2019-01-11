package tools;

import org.openqa.selenium.WebDriver;

public class Driver {
    private WebDriver driver;
    public WebDriver getDriver(){
        if(driver == null){
            this.driver = new Browser().getWebDriver();
                return driver;
        }else{
            return driver;
        }
    }
    public void closeDriver(){
        try {
            if(driver != null) {
                driver.quit();
            }
        }finally {
            driver = null;
        }
    }
}
