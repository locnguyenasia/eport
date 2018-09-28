package supports;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class ReadDataTest {
    public String[][] readDataTest(int sheet, int row, int col) {
        String array[][];
        array = new String[row][col];
        try {
            File src = new File("\\AutoTest\\EPORT\\src\\test\\datatest\\DataTest.xlsx");
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sh = wb.getSheetAt(sheet);
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return array;
    }
}
