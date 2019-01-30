package tests.mobile_test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mobile_pages.HomeScreen;
import pages.mobile_pages.InputControlScreen;

@Epic("MOBILE APP TESTS")
@Feature("SERVICES")
@Story("RANDOM-7")
public class ServicesTest extends GenericMobileTest{
        @Test
        public void testServices(){
            HomeScreen homeScreen = new HomeScreen();

            InputControlScreen inputControlScreen = homeScreen.expandMenu().clickOnInputControlsMenu()
                    .openRadiobuttonTab().checkServicesRadioButton();

             Assert.assertTrue(inputControlScreen.getRudioButtonStatusText().contains("Services"),
                     "The Services is not selected");
    }
}
