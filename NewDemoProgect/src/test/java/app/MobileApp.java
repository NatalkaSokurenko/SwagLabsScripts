package app;

import io.appium.java_client.android.AndroidDriver;
import tools.Driver;

public class MobileApp {
    private static ThreadLocal<Driver> browser = null;
    public static ThreadLocal<Driver> getMobile(){
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
    public static AndroidDriver getAndroidDriver(){
        return getMobile().get().getAndroidDriver();
    }
    public static void closeAnroidDriver(){
        getMobile().get().closeAndroidDriver();
    }
}
