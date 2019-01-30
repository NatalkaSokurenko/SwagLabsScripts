package pages.web_pages;

import app.WebApp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CheckoutOverviewPage extends GenericWebPage {
    public CheckoutOverviewPage() {
        PageFactory.initElements(WebApp.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='inventory_item_name']")

    public List<WebElement> cartItems;

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < cartItems.size(); i++) {
            names.add(cartItems.get(i).getText());
        }
        return names;
    }
}
