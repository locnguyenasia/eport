package datasets;

import org.testng.annotations.DataProvider;
import supports.ReadDataTest;
import java.lang.reflect.Method;

public class SearchDeclareCustomsDeclarationData {

    @DataProvider(name = "SearchDeclareCustomsDeclarationData")
    public static Object[][] objData(Method m) {

        int sheet=1;
        int row=5; //row>1
        int col=8;
        String arr[][];
        arr = new String[row][col];

        ReadDataTest r = new ReadDataTest();
        arr = r.readDataTest(sheet, row, col);

        if (m.getName().equalsIgnoreCase("sdc001_SearchDeclareCustomsDeclaration")) {
            return new Object[][]{
                    new Object[]{arr[row-4][col-8], arr[row-4][col-7], arr[row-4][col-6], arr[row-4][col-5], arr[row-4][col-4], arr[row-4][col-3], arr[row-4][col-2], arr[row-4][col-1]}
            };
        } else if (m.getName().equalsIgnoreCase("sdc002_SearchDeclareCustomsDeclaration")) {
            return new Object[][]{
                    new Object[]{arr[row-3][col-8], arr[row-3][col-7], arr[row-3][col-6], arr[row-3][col-5], arr[row-3][col-4], arr[row-3][col-3], arr[row-3][col-2], arr[row-3][col-1]}
            };
        } else if (m.getName().equalsIgnoreCase("sdc003_SearchDeclareCustomsDeclaration")) {
            return new Object[][]{
                    new Object[]{arr[row-2][col-8], arr[row-2][col-7], arr[row-2][col-6], arr[row-2][col-5], arr[row-2][col-4], arr[row-2][col-3], arr[row-2][col-2], arr[row-2][col-1]}
            };
        } else {
            return new Object[][]{
                    new Object[]{arr[row-1][col-8], arr[row-1][col-7], arr[row-1][col-6], arr[row-1][col-5], arr[row-1][col-4], arr[row-1][col-3], arr[row-1][col-2], arr[row-1][col-1]}
            };
        }
    }
}
