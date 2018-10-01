package libraries;

import datasets.LoadEInvoiceData;
import objects.LoadEInvoiceObject;
import objects.SearchContainerInformationObject;
import static supports.CommonFunctions.*;

public class LoadEInvoiceFunction {

    LoadEInvoiceObject obj = new LoadEInvoiceObject();

    public void selectLink(){
        click(SearchContainerInformationObject.searchLnk);
        click(obj.loadEInvoiceLnk);
    }

    public void fillForm(String signName, String invoiceNumber, String invoiceCode){
        click(obj.paymentSiteDdl);
        click(obj.selectpaymentSiteDdl);

        if (LoadEInvoiceData.sign.equalsIgnoreCase("true")){
            if (isSelected(obj.signRab)!=true){
                click(obj.signRab);
            }
            fillIn(obj.signTxt, signName);
            fillIn(obj.invoiceNumberTxt, invoiceNumber);
        } else {
            fillIn(obj.invoiceNumberTxt, invoiceNumber);
            click(obj.invoiceCodeRab);
            fillIn(obj.invoiceCodeTxt, invoiceCode);
        }
    }

    public void search(){
        click(obj.searchBtn);
        click(obj.loadAllBtn);
    }
}
