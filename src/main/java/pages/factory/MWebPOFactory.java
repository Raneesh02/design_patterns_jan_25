package pages.factory;

import org.openqa.selenium.WebDriver;
import pages.interfaces.HomePage;
import pages.mweb.MWebHomePage;

public class MWebPOFactory extends POFactory{
    @Override
    public HomePage getHomepage(WebDriver driver) {
        return new MWebHomePage(driver);
    }
}
