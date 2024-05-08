package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CheckoutPage {
 WebDriver driver;
 WebDriverWait wait;

 By f_name = By.id("first-name");
 By l_name = By.id("last-name");
 By zip_code = By.id("postal-code");
 By continue_button= By.id("continue");



 public  CheckoutPage(WebDriver driver){
  this.driver = driver;
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 }

 public void firstName(String text){
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.findElement(f_name).sendKeys(text);
 }
 public void lastName(String text){
  driver.findElement(l_name).sendKeys(text);
 }
 public void zipCode(String text){
  driver.findElement(zip_code).sendKeys(text);
 }
 public void continueButton(){
  driver.findElement(continue_button).sendKeys(Keys.RETURN);
 }




}
