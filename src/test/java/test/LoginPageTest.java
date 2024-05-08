package test;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public  void LoginTest(){
        LoginPage gpo = new LoginPage(driver);
        gpo.TextInUserName("standard_user");
        gpo.CodeInPassword("secret_sauce");
        gpo.LoginButtonClick();
    }

}
