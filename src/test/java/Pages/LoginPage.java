package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver = null;
    By user_name= By.id("user-name");
    By password= By.id("password");
    By login_button = By.id("login-button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void TextInUserName(String text){
        driver.findElement(user_name).sendKeys(text);
    }
    public void CodeInPassword(String text){
        driver.findElement(password).sendKeys(text);
    }
    public  void LoginButtonClick(){
        driver.findElement(login_button).sendKeys(Keys.RETURN);
    }
}


