package modules;

import datasets.ServicePaymentData;
import libraries.ServicePaymentFunction;
import org.testng.annotations.Test;

public class ServicePaymentTest extends BaseTest {
    @Test(dataProvider = "ServicePaymentData", dataProviderClass = ServicePaymentData.class)
    public void spm001_ServicePayment(String regNum){
        spm000_ServicePayment(regNum);
    }

    @Test(dataProvider = "ServicePaymentData", dataProviderClass = ServicePaymentData.class)
    public void spm002_ServicePayment(String regNum){
        spm000_ServicePayment(regNum);
    }

    @Test(dataProvider = "ServicePaymentData", dataProviderClass = ServicePaymentData.class)
    public void spm003_ServicePayment(String regNum){
        spm000_ServicePayment(regNum);
    }

    @Test(dataProvider = "ServicePaymentData", dataProviderClass = ServicePaymentData.class)
    public void spm004_ServicePayment(String regNum){
        spm000_ServicePayment(regNum);
    }

    @Test(dataProvider = "ServicePaymentData", dataProviderClass = ServicePaymentData.class)
    public void spm005_ServicePayment(String regNum){
        spm000_ServicePayment(regNum);
    }

    @Test(dataProvider = "ServicePaymentData", dataProviderClass = ServicePaymentData.class)
    public void spm006_ServicePayment(String regNum){
        spm000_ServicePayment(regNum);
    }

    public void spm000_ServicePayment(String regNum){
        ServicePaymentFunction fnc = new ServicePaymentFunction();
        fnc.selectLink();
        fnc.fillForm(regNum);
        fnc.search();
        fnc.payment();
    }
}
