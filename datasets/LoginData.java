package datasets;

import org.testng.annotations.DataProvider;
import supports.ReadDataTest;
import java.lang.reflect.Method;

public class LoginData {

    @DataProvider(name = "LoginData")
    public Object[][] objData(Method m) {
        int sheet=0;
        int row=3; //row>1
        int col=3;
        String arr[][];
        arr = new String[row][col];

        ReadDataTest r = new ReadDataTest();
        arr = r.readDataTest(sheet, row, col);

        if (m.getName().equalsIgnoreCase("log002_Login")) {
            return new Object[][]{
                    new Object[]{arr[row-2][col-3], arr[row-2][col-2], arr[row-2][col-1]}
            };
        } else {
            return new Object[][]{
                    new Object[]{arr[row-1][col-3], arr[row-1][col-2], arr[row-1][col-1]}
            };
        }
    }
}
