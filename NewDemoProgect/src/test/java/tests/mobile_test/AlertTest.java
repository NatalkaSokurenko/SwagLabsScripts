package tests.mobile_test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mobile_pages.AlertsScreen;
import pages.mobile_pages.HomeScreen;

@Epic("MOBILE APP TESTS")
@Feature("ALERTS")
@Story("RANDOM-5")
public class AlertTest extends GenericMobileTest{
    @Test
    public void testAlert() {
        HomeScreen homeScreen = new HomeScreen();
        AlertsScreen alertsScreen = homeScreen.expandMenu().clickOnAlertsMenu().clickAlertButton();

        Assert.assertTrue(alertsScreen.getAlertMessageText().contains("This is the alert message"),
                "Error message is not correct");
    }
}
