package apps;

import org.openqa.selenium.WebDriver;
import tools.Driver;

public class WebApp {
    private static ThreadLocal<Driver> browser = null;
    public static ThreadLocal<Driver> getWebBrowser(){
        if(browser == null) {
            browser = new ThreadLocal<Driver>() {
                @Override
                protected Driver initialValue() {
                    return new Driver();
                }
            };
            return browser;
        } else {
            return browser;
        }
    }
    public static WebDriver getDriver(){
        return getWebBrowser().get().getDriver();
    }
    public static void closeWebApp(){
        getWebBrowser().get().closeDriver();
    }
}
