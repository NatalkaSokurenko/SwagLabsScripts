package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class GenericWebPage {
    private WebDriver driver;

    public GenericWebPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public GenericWebPage(){

    }
}
