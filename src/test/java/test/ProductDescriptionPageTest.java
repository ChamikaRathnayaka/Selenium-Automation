package test;

import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDescriptionPageTest extends BaseTest{
    @Test
    public void navigateToDescription(){
        ProductsPage pp = new ProductsPage(driver);
        pp.productTitle();
    }
}
