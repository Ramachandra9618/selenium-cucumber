package Utilities;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility {

    public static String getCellData(String filePath, String sheetName, int rownum, int colnum) {
        String cellData = null;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet " + sheetName + " does not exist.");
            }

            Row row = sheet.getRow(rownum);
            if (row == null) {
                throw new IllegalArgumentException("Row " + rownum + " does not exist in sheet " + sheetName);
            }

            Cell cell = row.getCell(colnum);
            if (cell == null) {
                throw new IllegalArgumentException("Column " + colnum + " does not exist in row " + rownum);
            }

            cellData = cell.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return cellData;
    }

}
