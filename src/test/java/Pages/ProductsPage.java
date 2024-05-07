package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ProductsPage {

    WebDriver driver;
    WebDriverWait wait;

    By addToCart_button = By.id("add-to-cart-sauce-labs-backpack");
    By removeCart_button = By.id("remove-sauce-labs-backpack");
    By cart_icon = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");
    By product_title = By.id("item_4_title_link");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isProductPageLoaded() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cart_icon)).isDisplayed();
    }

    public void AddToCart(){
        driver.findElement(addToCart_button).sendKeys(Keys.RETURN);
    }

    public void removeFromCart(){
        driver.findElement(removeCart_button).sendKeys(Keys.RETURN);
    }

    public void cartIcon(){
        driver.findElement(cart_icon).click();
    }

    public void productTitle(){
        driver.findElement(product_title).sendKeys(Keys.RETURN);
    }


}
