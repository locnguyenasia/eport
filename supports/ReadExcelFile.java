package supports;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile {
    public String[][] readExcel(String filePath, String fileName, String sheetName) throws IOException {
        String[][] arrayExcelData = null;
        File file = new File(filePath + "\\" + fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook readWorkbook = null;
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        if (fileExtensionName.equals(".xlsx")) {
            readWorkbook = new XSSFWorkbook(inputStream);
        } else if (fileExtensionName.equals(".xls")) {
            readWorkbook = new HSSFWorkbook(inputStream);
        }
        Sheet readSheet = readWorkbook.getSheet(sheetName);
        int rowCount = readSheet.getLastRowNum() - readSheet.getFirstRowNum();
        for (int i = 1; i < rowCount; i++) {
            Row row = readSheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                System.out.print(row.getCell(j).getStringCellValue() + "|");
                arrayExcelData[i - 1][j] = row.getCell(j).getStringCellValue();
            }
            System.out.println();
        }
        return arrayExcelData;
    }
}
