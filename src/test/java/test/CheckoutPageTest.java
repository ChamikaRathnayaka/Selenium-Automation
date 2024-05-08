package test;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.ProductsPage;
import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseTest{
    @Test(priority = 0)
    public void navigateToCheckoutPage(){
        ProductsPage pp = new ProductsPage(driver);
        pp.AddToCart();
        pp.cartIcon();
        CartPage cartpage = new CartPage(driver);
        cartpage.checkoutbutton_click();
    }

    @Test(priority = 1)
    public void CheckoutInformation(){
        CheckoutPage cp = new CheckoutPage(driver);

        cp.firstName("sample_first_name");
        cp.lastName("sample_last_name");
        cp.zipCode("123");
        cp.continueButton();

    }
}
