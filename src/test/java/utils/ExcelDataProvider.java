package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
public class ExcelDataProvider {
    WebDriver driver;
    String url = "https://www.saucedemo.com/";
    @BeforeTest
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }
@DataProvider(name = "test1Data")
public static Object[][] getData() throws IOException {
    String excelPath = "C:\\Users\\Chamika\\Desktop\\selenuim\\POM\\excel\\data.xlsx";
    Object data[][]=testData(excelPath,"Sheet1");
    return data;
}
@Test(dataProvider = "test1Data")
public void test1(String username, String password) throws InterruptedException {
    System.out.println(username+ " " + password);
    driver.get(url);
    driver.findElement(By.id("user-name")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    Thread.sleep(3000);
}
public static Object[][] testData(String excelPath, String sheetName) throws IOException {
        ExcelUtils excelUtils = new ExcelUtils(excelPath,sheetName);
        int row_count= excelUtils.getRowCount();
        int col_count= excelUtils.getColCount();

        Object data[][] = new Object[row_count-1][col_count];

        for(int i=1;i<row_count;i++){
            for(int j=0;j<col_count;j++){
                String cellData = excelUtils.getCellDataString(i,j);
                System.out.print(cellData + " | ");
                data[i-1][j] = cellData;
            }
            System.out.println(" ");
        }
        return data;
     }
}
