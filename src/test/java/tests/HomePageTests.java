package tests;

import Base.BaseTest;
import Base.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.interfaces.HomePage;
import pages.factory.POFactory;
import pages.web.WebHomePage;

import java.util.Arrays;

public class HomePageTests extends BaseTest {

    @Test
    public void testCategories(){
        POFactory POFactory = new POFactory();
        HomePage homePage = POFactory.getHomePage(DriverManager.getDriver());
        homePage.openCategories();
        Assert.assertEquals(homePage.getCategoriesList(), Arrays.asList("Hand Tools", "Power Tools", "Other", "Special Tools","","Rentals"));
    }

    @Test
    public void testCategories2(){
        POFactory POFactory = new POFactory();
        HomePage homePage = POFactory.getHomePage(DriverManager.getDriver());
        homePage.getCategoriesList();
        Assert.assertEquals(homePage.getCategoriesList(), Arrays.asList("Hand Tools", "Power Tools", "Other", "Special Tools","","Rentals"));
    }


    @Test
    public void testHeader(){
        WebHomePage homepage = new WebHomePage(DriverManager.getDriver());
        homepage.validateHeader();
    }

    @Test
    public void testFooter(){
        WebHomePage homepage = new WebHomePage(DriverManager.getDriver());
        Assert.assertEquals(homepage.getFooterText(),"This is a DEMO application (GitHub repo), used for software testing training purpose. | Support this project | Privacy Policy | Banner photo by Barn Images on Unsplash.");
    }
}
