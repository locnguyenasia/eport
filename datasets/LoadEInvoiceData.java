package datasets;

import org.testng.annotations.DataProvider;
import supports.ReadDataTest;
import java.lang.reflect.Method;

public class LoadEInvoiceData {
    public static String optionPaymentSite="0";
    public static String sign="false";

    @DataProvider(name="LoadEInvoiceData")
    public Object[][] objData(Method m){
        int sheet=5;
        int row=7;
        int col=5;
        String arr[][];
        arr = new String[row][col];

        ReadDataTest r = new ReadDataTest();
        arr = r.readDataTest(sheet, row, col);

        if (m.getName().equalsIgnoreCase("lei001_LoadEInvoice")){
            optionPaymentSite = arr[row-6][col-5];
            sign = arr[row-6][col-4];
            return new Object[][]{
                    new Object[]{arr[row-6][col-3], arr[row-6][col-2], arr[row-6][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("lei002_LoadEInvoice")) {
            optionPaymentSite = arr[row-5][col-5];
            sign = arr[row-5][col-4];
            return new Object[][]{
                    new Object[]{arr[row-5][col-3], arr[row-5][col-2], arr[row-5][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("lei003_LoadEInvoice")) {
            optionPaymentSite = arr[row-4][col-5];
            sign = arr[row-4][col-4];
            return new Object[][]{
                    new Object[]{arr[row-4][col-3], arr[row-4][col-2], arr[row-4][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("lei004_LoadEInvoice")) {
            optionPaymentSite = arr[row-3][col-5];
            sign = arr[row-3][col-4];
            return new Object[][]{
                    new Object[]{arr[row-3][col-3], arr[row-3][col-2], arr[row-3][col-1]}
            };

        } else if (m.getName().equalsIgnoreCase("lei005_LoadEInvoice")) {
            optionPaymentSite = arr[row-2][col-5];
            sign = arr[row-2][col-4];
            return new Object[][]{
                    new Object[]{arr[row-2][col-3], arr[row-2][col-2], arr[row-2][col-1]}
            };

        } else {
            optionPaymentSite = arr[row-1][col-5];
            sign = arr[row-1][col-4];
            return new Object[][]{
                    new Object[]{arr[row-1][col-3], arr[row-1][col-2], arr[row-1][col-1]}
            };
        }
    }
}
