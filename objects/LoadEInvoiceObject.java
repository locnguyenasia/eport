package objects;

import datasets.LoadEInvoiceData;
import org.openqa.selenium.By;

public class LoadEInvoiceObject {
    public By loadEInvoiceLnk = By.xpath("//a[contains(text(),'Tai HDDT')]");
    public By paymentSiteDdl = By.xpath("//*[@id=\"ContentPlaceHolder2_cboSite\"]/div/div[2]/span");
    public By selectpaymentSiteDdl = By.cssSelector("#ContentPlaceHolder2_cboSite_L_LBI" + LoadEInvoiceData.optionPaymentSite + "LBL");
    public By signRab = By.cssSelector("#ContentPlaceHolder2_chk1");
    public By signTxt = By.cssSelector("#tbxSerial_I");
    public By invoiceNumberTxt = By.cssSelector("#tbxInvoiceNo_I");
    public By invoiceCodeRab = By.cssSelector("#ContentPlaceHolder2_chk2");
    public By invoiceCodeTxt = By.cssSelector("#txtFKey_I");
    public By searchBtn = By.cssSelector("#ContentPlaceHolder2_btnSearch");
    public By refresh = By.cssSelector("#ContentPlaceHolder2_btnReset");
    public By loadAllBtn = By.cssSelector("#ContentPlaceHolder2_btnDownAllHDDT");
}
