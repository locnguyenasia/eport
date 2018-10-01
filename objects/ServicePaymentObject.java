package objects;

import datasets.ServicePaymentData;
import org.openqa.selenium.By;

public class ServicePaymentObject {
    public By servicePaymentLnk = By.xpath("//*[@id=\"side-menu\"]/li[1]/ul/li[4]/a");
    public By sitePaymentDdl = By.xpath("//*[@id=\"ContentPlaceHolder2_UCThanhToanHo_cboSite\"]/div/div[2]/span");
    public By selectSitePaymentDdl = By.cssSelector("#ContentPlaceHolder2_UCThanhToanHo_cboSite_L_LBI"+ ServicePaymentData.optionServicePaymentSite +"LBL");
    public By registrationNumberTxt = By.cssSelector("#ContentPlaceHolder2_UCThanhToanHo_tbxMaDichVu_I");
    public By searchBtn = By.cssSelector("#ContentPlaceHolder2_UCThanhToanHo_btnTimKiem");
    public By paymentBtn = By.cssSelector("#ContentPlaceHolder2_UCThanhToanHo_btnThanhToan");
}
