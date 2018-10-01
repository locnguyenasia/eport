package datasets;

import org.testng.annotations.DataProvider;
import supports.ReadDataTest;
import java.lang.reflect.Method;

public class ServicePaymentData {
    public static String optionServicePaymentSite="0";
    public static String sign="false";

    @DataProvider(name="ServicePaymentData")
    public Object[][] objData(Method m){
        int sheet=6;
        int row=7;
        int col=2;
        String arr[][];
        arr = new String[row][col];

        ReadDataTest r = new ReadDataTest();
        arr = r.readDataTest(sheet, row, col);

        if (m.getName().equalsIgnoreCase("spm001_ServicePayment")){
            optionServicePaymentSite = arr[row-6][col-2];
            return new Object[][]{
                    new Object[]{arr[row-6][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("spm002_ServicePayment")) {
            optionServicePaymentSite = arr[row-5][col-2];
            return new Object[][]{
                    new Object[]{arr[row-5][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("spm003_ServicePayment")) {
            optionServicePaymentSite = arr[row-4][col-2];
            return new Object[][]{
                    new Object[]{arr[row-4][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("spm004_ServicePayment")) {
            optionServicePaymentSite = arr[row-3][col-2];
            return new Object[][]{
                    new Object[]{arr[row-3][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("spm005_ServicePayment")) {
            optionServicePaymentSite = arr[row-2][col-2];
            return new Object[][]{
                    new Object[]{arr[row-2][col-1]}
            };

        } else {
            optionServicePaymentSite = arr[row-1][col-2];
            return new Object[][]{
                    new Object[]{arr[row-1][col-1]}
            };
        }
    }
}
