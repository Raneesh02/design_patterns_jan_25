package pages.factory;

import org.openqa.selenium.WebDriver;
import pages.interfaces.CartPage;
import pages.interfaces.HomePage;
import pages.mweb.MWebCartPage;
import pages.mweb.MWebHomePage;
import pages.web.WebCartPage;
import pages.web.WebHomePage;
import utilities.PropertyHandler;

public class POFactory {

    public HomePage getHomePage(WebDriver driver){
        HomePage homePage;
        if(PropertyHandler.platform.equals("mweb")){
            homePage = new MWebHomePage(driver);
        }
        else{
            homePage = new WebHomePage(driver);
        }
        return homePage;
    }

    public CartPage getCartPage(WebDriver driver){
        CartPage cartPage;
        if(PropertyHandler.platform.equals("mweb")){
            cartPage = new MWebCartPage(driver);
        }
        else{
            cartPage = new WebCartPage(driver);
        }
        return cartPage;
    }




}
