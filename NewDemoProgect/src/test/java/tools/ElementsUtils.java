package tools;

import app.MobileApp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsUtils {

    public void waitForElement(WebElement el){
        WebDriverWait waiter = new WebDriverWait(MobileApp.getAndroidDriver(), 5);
        waiter.until(ExpectedConditions.elementToBeClickable(el));
    }

}
