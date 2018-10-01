package datasets;

import org.testng.annotations.DataProvider;
import supports.ReadDataTest;
import java.lang.reflect.Method;

public class SearchVesselInformationData {
    public static String optionSite = "0";

    @DataProvider(name = "SearchVesselInformationData")
    public Object[][] objData(Method m) {

        int sheet=4;
        int row=8;
        int col=2;
        String arr[][];
        arr = new String[row][col];

        ReadDataTest r = new ReadDataTest();
        arr = r.readDataTest(sheet, row, col);

        if (m.getName().equalsIgnoreCase("svi001_SearchVesselInformation")) {
            optionSite = arr[row-7][col-2];
            return new Object[][]{
                    new Object[]{arr[row-7][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("svi002_SearchVesselInformation")) {
            optionSite = arr[row-6][col-2];
            return new Object[][]{
                    new Object[]{arr[row-6][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("svi003_SearchVesselInformation")) {
            optionSite = arr[row-5][col-2];
            return new Object[][]{
                    new Object[]{arr[row-5][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("svi004_SearchVesselInformation")) {
            optionSite = arr[row-4][col-2];
            return new Object[][]{
                    new Object[]{arr[row-4][col-1]}
            };
        } else if (m.getName().equalsIgnoreCase("svi005_SearchVesselInformation")) {
            optionSite = arr[row-3][col-2];
            return new Object[][]{
                    new Object[]{arr[row-3][col-1]}
            };
        } else if (m.getName().equalsIgnoreCase("svi006_SearchVesselInformation")) {
            optionSite = arr[row-2][col-2];
            return new Object[][]{
                    new Object[]{arr[row-2][col-1]}
            };

        } else {
            optionSite = arr[row-1][col-2];
            return new Object[][]{
                    new Object[]{arr[row-1][col-1]}
            };
        }
    }
}
