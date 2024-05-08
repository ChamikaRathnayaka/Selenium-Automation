package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    By checkoutButtonLocator = By.id("checkout");
    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public boolean isCartPageLoaded(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButtonLocator)).isDisplayed();
    }

    public void checkoutbutton_click(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButtonLocator));
        driver.findElement(checkoutButtonLocator).click();
    }
}
