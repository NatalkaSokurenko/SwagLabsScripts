package pages.mobile_pages;

import app.MobileApp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;

public class InputControlScreen extends AbstractMobileScreen {

    @AndroidFindBy(xpath = "//*[@class='android.widget.RelativeLayout']")
    private AndroidElement inputControlScreen;

    @AndroidFindBy(accessibility = "Checkbox Control")
    private AndroidElement checkbox;

    @AndroidFindBy(accessibility = "Checkbox Display")
    private AndroidElement checkboxStatus;

    @AndroidFindBy(accessibility = "Radio Button 3")
    private AndroidElement servicesRadioButton;

    @AndroidFindBy(accessibility = "Radio Button Display")
    private AndroidElement radioButtonStatus;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.TextView[2]")
    private AndroidElement checkboxTab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.TextView[3]")
    private AndroidElement radioButtonTab;

    @Step("Open Checkbox tab")
    public InputControlScreen openCheckboxTab() {
        getAndroidDriver().performTouchAction(new TouchAction(getAndroidDriver())
                .press(PointOption.point(921, 991))
                .moveTo(PointOption.point(333, 979)).release().perform());
        return this;
    }
    @Step("Check checkbox")
    public InputControlScreen checkCheckbox() {
        checkbox.click();
        return this;
    }
    public String getCheckboxStatusText(){
        return checkboxStatus.getText();
    }

    @Step("Open Radiobutton tab")
    public InputControlScreen openRadiobuttonTab() {
        checkboxTab.click();
        radioButtonTab.click();
//        getAndroidDriver().performTouchAction(new TouchAction(getAndroidDriver())
//                .press(PointOption.point(921, 991))
//                .moveTo(PointOption.point(333, 979)).release().perform());
        return this;
    }
    @Step("Check services radio button")
    public InputControlScreen checkServicesRadioButton() {
        servicesRadioButton.click();
        return this;
    }
    public String getRadioButtonStatusText(){
        return radioButtonStatus.getText();
    }


}
