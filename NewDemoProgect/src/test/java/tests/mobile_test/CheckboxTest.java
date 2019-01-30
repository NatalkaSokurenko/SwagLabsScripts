package tests.mobile_test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mobile_pages.HomeScreen;
import pages.mobile_pages.InputControlScreen;

@Epic("MOBILE APP TESTS")
@Feature("CHECKBOX")
@Story("RANDOM-6")
public class CheckboxTest extends GenericMobileTest {
    @Test
    public void testCheckbox() {
        HomeScreen homeScreen = new HomeScreen();

        InputControlScreen inputControlScreen = homeScreen.expandMenu().clickOnInputControlsMenu()
                .openCheckboxTab().checkCheckbox();

        Assert.assertTrue(inputControlScreen.getCheckboxStatusText().contains("Checked"),
                "The checkbox is not checked");
    }
}
