package test;

import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ProductsPageTest extends BaseTest {
    @Test(priority = 1)
    public void TitleValidationTest(){
        ProductsPage pp = new ProductsPage(driver);
        pp.isProductPageLoaded();
        String expected = "Swag Labs";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }

  @Test(priority = 2)
    public void AddToCartTest()  {
      ProductsPage pp = new ProductsPage(driver);
      pp.AddToCart();
  }

    @Test(priority = 3)
    public void removeFromCartTest()  {
        ProductsPage pp = new ProductsPage(driver);
        pp.removeFromCart();
    }

}
