package Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllSheetData {

    public List<String[]> loadDataFromExcel(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheet(sheetName);

        List<String[]> data = new ArrayList<>();

        // Loop through each row in the sheet
        for (Row row : sheet) {
            // Get the number of cells in the row
            int cellCount = row.getLastCellNum();

            // Array to store the data from each cell in the row
            String[] rowData = new String[cellCount];

            // Loop through each cell in the row
            for (int i = 0; i < cellCount; i++) {
                Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                // Store the cell's value as a string
                rowData[i] = cell.toString();
            }


            // Add the row's data to the list
            data.add(rowData);
        }

        // Close the workbook and the FileInputStream
        workbook.close();
        fis.close();

        // Return the list of data
        return data;
    }


//    public static void main(String[] args) throws IOException {
//        AllSheetData allSheetData = new AllSheetData();
//        List<String[]> data = allSheetData.loadDataFromExcel("src/test/resources/products.xlsx", "productNames");
//          for (String[] ar : data){
//              for(int i =0 ; i<ar.length; i++){
//                  System.out.println(ar[i]);
//              }
//          }
//
//
//    }
}
