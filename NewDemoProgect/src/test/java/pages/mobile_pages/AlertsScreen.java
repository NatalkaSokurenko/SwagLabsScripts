package pages.mobile_pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class AlertsScreen extends AbstractMobileScreen {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button[2]")
    private AndroidElement alertButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement alertMessage;

    @Step("Click on Alert button")
    public AlertsScreen clickAlertButton(){
        elementsUtils().waitForElement(alertButton);
        alertButton.click();
        return this;
    }

    public String getAlertMessageText(){ return alertMessage.getText();
    }


}
