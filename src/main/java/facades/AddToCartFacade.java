package facades;

import Base.DriverManager;
import pages.CartPage;
import pages.FilterSideBar;
import pages.Homepage;
import pages.ProductDetailPage;
import testdata.Product;

public class AddToCartFacade {

    public CartPage addToCart(String categoryName, int qty){
        Homepage homepage = new Homepage(DriverManager.getDriver());
        FilterSideBar filterBar = homepage.getFilterBar();
        filterBar.selectFilterCategory(categoryName);
        ProductDetailPage productDetailPage = homepage.selectProduct(1);
        productDetailPage.increaseProductQty(qty);
        productDetailPage.addToCart();
        return productDetailPage.goToCart();
    }

    public CartPage addToCart(Product product){
        Homepage homepage = new Homepage(DriverManager.getDriver());
        FilterSideBar filterBar = homepage.getFilterBar();
        filterBar.selectFilterCategory(product.getType());
        ProductDetailPage productDetailPage = homepage.selectProduct(1);
        productDetailPage.increaseProductQty(product.getQty());
        productDetailPage.addToCart();
        return productDetailPage.goToCart();
    }
}
