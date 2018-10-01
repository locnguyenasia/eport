package modules;

import datasets.LoadEInvoiceData;
import libraries.LoadEInvoiceFunction;
import org.testng.annotations.Test;

public class LoadEInvoiceTest extends BaseTest {
    @Test(dataProvider = "LoadEInvoiceData", dataProviderClass = LoadEInvoiceData.class)
    public void lei001_LoadEInvoice(String signName, String invoiceNumber, String invoiceCode){
        lei000_LoadEInvoice(signName, invoiceNumber, invoiceCode);
    }

    @Test(dataProvider = "LoadEInvoiceData", dataProviderClass = LoadEInvoiceData.class)
    public void lei002_LoadEInvoice(String signName, String invoiceNumber, String invoiceCode){
        lei000_LoadEInvoice(signName, invoiceNumber, invoiceCode);
    }

    @Test(dataProvider = "LoadEInvoiceData", dataProviderClass = LoadEInvoiceData.class)
    public void lei003_LoadEInvoice(String signName, String invoiceNumber, String invoiceCode){
        lei000_LoadEInvoice(signName, invoiceNumber, invoiceCode);
    }

    @Test(dataProvider = "LoadEInvoiceData", dataProviderClass = LoadEInvoiceData.class)
    public void lei004_LoadEInvoice(String signName, String invoiceNumber, String invoiceCode){
        lei000_LoadEInvoice(signName, invoiceNumber, invoiceCode);
    }

    @Test(dataProvider = "LoadEInvoiceData", dataProviderClass = LoadEInvoiceData.class)
    public void lei005_LoadEInvoice(String signName, String invoiceNumber, String invoiceCode){
        lei000_LoadEInvoice(signName, invoiceNumber, invoiceCode);
    }

    @Test(dataProvider = "LoadEInvoiceData", dataProviderClass = LoadEInvoiceData.class)
    public void lei006_LoadEInvoice(String signName, String invoiceNumber, String invoiceCode){
        lei000_LoadEInvoice(signName, invoiceNumber, invoiceCode);
    }

    public void lei000_LoadEInvoice(String signName, String invoiceNumber, String invoiceCode){
        LoadEInvoiceFunction fnc = new LoadEInvoiceFunction();
        fnc.selectLink();
        fnc.fillForm(signName, invoiceNumber, invoiceCode);
        fnc.search();
    }
}
