package libraries;

import objects.SearchContainerInformationObject;
import objects.ServicePaymentObject;
import static supports.CommonFunctions.*;

public class ServicePaymentFunction {

    ServicePaymentObject obj = new ServicePaymentObject();

    public void selectLink(){
        click(SearchContainerInformationObject.searchLnk);
        click(obj.servicePaymentLnk);
    }

    public void fillForm(String regNum){
        click(obj.sitePaymentDdl);
        click(obj.selectSitePaymentDdl);
        fillIn(obj.registrationNumberTxt, regNum);
    }

    public void search(){
        click(obj.searchBtn);
    }

    public void payment(){
        click(obj.paymentBtn);
    }
}
