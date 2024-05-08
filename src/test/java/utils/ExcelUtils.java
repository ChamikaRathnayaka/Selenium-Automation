package utils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {
    static XSSFWorkbook workbook;
    static  XSSFSheet sheet;

    public  ExcelUtils(String excelPath, String sheetName) throws IOException {
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet(sheetName);
    }

    public static void main(String[] args) throws IOException {
//        getRowCount("Sheet1");
//        getCellDataNumber(1,1);
//        getCellDataString(0,0);

    }

    public static void getRowCount(String sheetName) throws IOException {
        workbook.getSheet(sheetName);
        int row_count = sheet.getPhysicalNumberOfRows();
        System.out.println("No of Rows :" + row_count);
    }

    public static void getCellDataString(int rowNum, int colNum){
        String cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        System.out.println(cellData);
    }
    public static void getCellDataNumber(int rowNum, int colNum){
        double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
        System.out.println(cellData);
    }
}
