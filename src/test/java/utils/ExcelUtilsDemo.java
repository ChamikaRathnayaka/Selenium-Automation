package utils;

import java.io.IOException;

public class ExcelUtilsDemo {
    public static void main(String[] args) throws IOException {

        ExcelUtils excel = new ExcelUtils("C:\\Users\\Chamika\\Desktop\\selenuim\\POM\\excel\\data.xlsx", "Sheet1");
        excel.getRowCount("Sheet1");
        excel.getCellDataString(0,0);
        excel.getCellDataNumber(1,1);
    }
}
