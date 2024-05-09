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
    public static int getRowCount() throws IOException {
        int row_count = 0;
        row_count = sheet.getPhysicalNumberOfRows();
        System.out.println("No of Rows :" + row_count);
        return row_count;
    }
    public static int getColCount() throws IOException {
        int col_count = 0;
        col_count = sheet.getPhysicalNumberOfRows();
        System.out.println("No of Colums :" + col_count);
        return col_count;
    }
    public static String getCellDataString(int rowNum, int colNum){
        String cellData= null;
        cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        return cellData;
    }
    public static void getCellDataNumber(int rowNum, int colNum){
        double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
        System.out.println(cellData);
    }
}
