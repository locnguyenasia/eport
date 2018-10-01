package datasets;

import org.testng.annotations.DataProvider;
import supports.ReadDataTest;
import java.lang.reflect.Method;

public class SearchContainerInformationData {
    public static String optionArea="0";
    public static String inYard="false";
    public static String batch="false";

    @DataProvider(name = "SearchContainerInformationData")
    public Object[][] objData(Method m) {
        int sheet=3;
        int row=6;
        int col=4;
        String arr[][];
        arr = new String[row][col];

        ReadDataTest r = new ReadDataTest();
        arr = r.readDataTest(sheet, row, col);

        if (m.getName().equalsIgnoreCase("sci001_SearchContainerInformation")) {
            optionArea = arr[row-5][col-4];
            inYard = arr[row-5][col-3];
            batch = arr[row-5][col-2];
            return new Object[][]{
                    new Object[]{arr[row-5][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("sci002_SearchContainerInformation")) {
            optionArea = arr[row-4][col-4];
            inYard = arr[row-4][col-3];
            batch = arr[row-4][col-2];
            return new Object[][]{
                    new Object[]{arr[row-4][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("sci003_SearchContainerInformation")) {
            optionArea = arr[row-3][col-4];
            inYard = arr[row-3][col-3];
            batch = arr[row-3][col-2];
            return new Object[][]{
                    new Object[]{arr[row-3][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("sci004_SearchContainerInformation")) {
            optionArea = arr[row-2][col-4];
            inYard = arr[row-2][col-3];
            batch = arr[row-2][col-2];
            return new Object[][]{
                    new Object[]{arr[row-2][col-1]}
            };

        } else {
            optionArea = arr[row-1][col-4];
            inYard = arr[row-1][col-3];
            batch = arr[row-1][col-2];
            return new Object[][]{
                    new Object[]{arr[row-1][col-1]}
            };
        }
    }
}
