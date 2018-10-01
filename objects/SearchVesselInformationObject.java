package objects;

import datasets.SearchVesselInformationData;
import org.openqa.selenium.By;

public class SearchVesselInformationObject {
    public By vesselInformationLnk = By.xpath("//a[contains(text(),'Thông tin chuyến tàu')]");
    public By siteDdl = By.cssSelector("#ContentPlaceHolder2_cbSite_I");
    public By selectSiteDdl = By.cssSelector("#ContentPlaceHolder2_cbSite_L_LBI" + SearchVesselInformationData.optionSite + "LBL");
//    public By selectSiteDdl = By.xpath("//*[@id=\"ContentPlaceHolder2_cbSite_L_LBI0LBL\"]");
    public By vesselVoyageTxt = By.cssSelector("#txtVesselName_I");
    public By searchBtn = By.cssSelector("#ContentPlaceHolder2_btnSearch");
    public By exportExcelBtn = By.cssSelector("#ContentPlaceHolder2_btnExportExcel");
    public By restoreLayoutBtn = By.cssSelector("#ContentPlaceHolder2_btnRestoreLayout");
}
