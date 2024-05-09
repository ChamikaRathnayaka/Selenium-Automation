package utils;
import java.io.IOException;
public class ExcelDataProvider {

public static void main(String[] args) throws IOException {
    String excelPath = "C:\\Users\\Chamika\\Desktop\\selenuim\\POM\\excel\\data.xlsx";
    testData(excelPath,"Sheet1");
}
public static void testData(String excelPath, String sheetName) throws IOException {
        ExcelUtils excelUtils = new ExcelUtils(excelPath,sheetName);
        int row_count= excelUtils.getRowCount();
        int col_count= excelUtils.getColCount();

        for(int i=1;i<row_count;i++){
            for(int j=0;j<col_count;j++){
                String cellData = excelUtils.getCellDataString(i,j);
                System.out.print(cellData + " | ");
            }
            System.out.println(" ");
        }
     }
}
