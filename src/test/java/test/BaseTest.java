package test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

    protected WebDriver driver;
    String url = "https://www.saucedemo.com/";

    @BeforeTest
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    @Test(priority = 0)
    public void LoginTest()  {
        LoginPage gpo = new LoginPage(driver);
        gpo.TextInUserName("standard_user");
        gpo.CodeInPassword("secret_sauce");
        gpo.LoginButtonClick();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(5000);
            driver.quit();
        }
        System.out.println("Test case execution completed");
    }
}
