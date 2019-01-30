package pages.mobile_pages;

import app.MobileApp;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import tools.ElementsUtils;

public class AbstractMobileScreen {
    public AbstractMobileScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(MobileApp.getAndroidDriver()), this);
    }

    public ElementsUtils elementsUtils(){
        return new ElementsUtils();
    }

    public AndroidDriver getAndroidDriver() {
        return MobileApp.getAndroidDriver();
    }

}
