package objects;

import org.openqa.selenium.By;
import datasets.SearchContainerInformationData;

public class SearchContainerInformationObject {
    public static By searchLnk = By.xpath("//*[@id=\"side-menu\"]/li[1]/a");
    public By containerInformationLnk = By.xpath("//a[contains(text(),'Thông tin container')]");
    public By areaDdl = By.xpath("//*[@id=\"cbSite\"]/div/div[2]/span");
    public By selectAreaDdl = By.xpath("//*[@id=\"cbSite_L_LBI" + SearchContainerInformationData.optionArea + "LBL\"]");
    public By inYardChk = By.xpath("//*[@id=\"chkInYard_I\"]");
    public By batchChk = By.xpath("//*[@id=\"ContentPlaceHolder2_chkBatch_I\"]");
    public By containerTxt = By.cssSelector("#txtItemNo_I");
    public By searchBtn = By.cssSelector("#ContentPlaceHolder2_btnSearch");
    public By exportExcelBtn = By.cssSelector("#ContentPlaceHolder2_btnExportExcel");
    public By restoreLayoutBtn = By.cssSelector("#ContentPlaceHolder2_btnRestoreLayout");

}
