package Data;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider {

    @DataProvider(name = "excelDataMale")
    public static Object[][] excelDataProviderMale() throws IOException {
        return getExcelData("C:\\Users\\admi\\Downloads\\WEBSHOP.xlsx", "Sheet1", 1);
    }
 @DataProvider(name = "excelDataFemale")
    public static Object[][] excelDataProviderFemale() throws IOException {
        return getExcelData("C:\\Users\\admi\\Downloads\\WEBSHOP.xlsx", "Sheet1", 2);
    }
@DataProvider(name = "excelDataInvalidMale") 
    public static Object[][] excelDataInvalidMaleProvider() throws IOException {
        return getExcelData("C:\\Users\\admi\\Downloads\\WEBSHOP_INVALID.xlsx", "Sheet1", 1);
    }
  public static Object[][] getExcelData(String filePath, String sheetName, int rowIndex) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
 Row row = sheet.getRow(rowIndex); 
        int colCount = row.getLastCellNum();
        Object[][] data = new Object[1][colCount];
 for (int j = 0; j < colCount; j++) {
            Cell cell = row.getCell(j);
            data[0][j] = (cell != null) ? cell.getStringCellValue() : "";
        }
 workbook.close();
        fis.close();
        return data;
    }
}
