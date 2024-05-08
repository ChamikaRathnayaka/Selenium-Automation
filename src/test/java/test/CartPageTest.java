package test;

import Pages.CartPage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {
    @Test
    public void navigateToCart() {
        ProductsPage pp = new ProductsPage(driver);
        pp.AddToCart();
        pp.cartIcon();
        CartPage cartpage = new CartPage(driver);
        Assert.assertTrue(cartpage.isCartPageLoaded());
    }
}
