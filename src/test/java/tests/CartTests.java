package tests;

import Base.BaseTest;
import Base.DriverManager;
import com.beust.ah.A;
import facades.AddToCartFacade;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.FilterSideBar;
import pages.Homepage;
import pages.ProductDetailPage;
import testdata.Product;

import java.util.List;

public class CartTests extends BaseTest {

    @Test
    public void testCartHammers(){
        Homepage homepage = new Homepage(DriverManager.getDriver());
        FilterSideBar filterBar = homepage.getFilterBar();
        filterBar.selectFilterCategory("Hammer");
        ProductDetailPage productDetailPage = homepage.selectProduct(1);
        productDetailPage.increaseProductQty(2);
        productDetailPage.addToCart();
        CartPage cartPage = productDetailPage.goToCart();
        //Assertions
    }

    @Test
    public void testCartPliers(){
        Homepage homepage = new Homepage(DriverManager.getDriver());
        FilterSideBar filterBar = homepage.getFilterBar();
        filterBar.selectFilterCategory("Pliers");
        ProductDetailPage productDetailPage = homepage.selectProduct(1);
        productDetailPage.increaseProductQty(1);
        productDetailPage.addToCart();
        CartPage cartPage = productDetailPage.goToCart();
        //Assertions
    }

    @Test
    public void testCartHammersFacade(){
        //create product via api
        Product product = new Product.ProductBuilder()
                .setType("Hammer")
                .setName("Thor Hammer")
                .setQty(2).build();

        //use the product pojo
        AddToCartFacade addToCartFacade= new AddToCartFacade();
        CartPage cartPage = addToCartFacade.addToCart(product);

        //Assertions
        Assert.assertTrue(cartPage.isProceedPresent());
        Assert.assertTrue(cartPage.getProductName().contains(product.getType()));
    }

    @Test
    public void testCartPliersBuilder(){
        //create product via api
        Product product = new Product.ProductBuilder()
                .setType("Pliers")
                .setName("Thor Pliers")
                .setQty(2).build();

        //use the product pojo
        AddToCartFacade addToCartFacade= new AddToCartFacade();
        CartPage cartPage = addToCartFacade.addToCart(product);

        //Assertions
        Assert.assertTrue(cartPage.isProceedPresent());
        Assert.assertTrue(cartPage.getProductName().contains(product.getName()));
    }


}
