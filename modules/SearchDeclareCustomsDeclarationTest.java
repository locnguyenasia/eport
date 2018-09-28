package modules;

import data.SearchDeclareCustomsDeclarationData;
import libraries.SearchDeclareCustomsDeclarationFunction;
import org.testng.annotations.Test;

public class SearchDeclareCustomsDeclarationTest extends BaseTest {

    @Test(dataProvider = "SearchDeclareCustomsDeclarationData", dataProviderClass = SearchDeclareCustomsDeclarationData.class)
    public void sdc001_SearchDeclareCustomsDeclaration(String tuNgay, String denNgay, String maLo, String soContainer, String soVanDon, String soQlhh, String soToKhai, String tinhTrangDoiChieu){
        sdc000_SearchDeclareCustomsDeclaration(tuNgay, denNgay, maLo, soContainer, soVanDon, soQlhh, soToKhai, tinhTrangDoiChieu);
    }

    @Test(dataProvider = "SearchDeclareCustomsDeclarationData", dataProviderClass = SearchDeclareCustomsDeclarationData.class)
    public void sdc002_SearchDeclareCustomsDeclaration(String tuNgay, String denNgay, String maLo, String soContainer, String soVanDon, String soQlhh, String soToKhai, String tinhTrangDoiChieu){
        sdc000_SearchDeclareCustomsDeclaration(tuNgay, denNgay, maLo, soContainer, soVanDon, soQlhh, soToKhai, tinhTrangDoiChieu);
    }

    @Test(dataProvider = "SearchDeclareCustomsDeclarationData", dataProviderClass = SearchDeclareCustomsDeclarationData.class)
    public void sdc003_SearchDeclareCustomsDeclaration(String tuNgay, String denNgay, String maLo, String soContainer, String soVanDon, String soQlhh, String soToKhai, String tinhTrangDoiChieu){
        sdc000_SearchDeclareCustomsDeclaration(tuNgay, denNgay, maLo, soContainer, soVanDon, soQlhh, soToKhai, tinhTrangDoiChieu);
    }

    @Test(dataProvider = "SearchDeclareCustomsDeclarationData", dataProviderClass = SearchDeclareCustomsDeclarationData.class)
    public void sdc004_SearchDeclareCustomsDeclaration(String tuNgay, String denNgay, String maLo, String soContainer, String soVanDon, String soQlhh, String soToKhai, String tinhTrangDoiChieu){
        sdc000_SearchDeclareCustomsDeclaration(tuNgay, denNgay, maLo, soContainer, soVanDon, soQlhh, soToKhai, tinhTrangDoiChieu);
    }
    public void sdc000_SearchDeclareCustomsDeclaration(String tuNgay, String denNgay, String maLo, String soContainer, String soVanDon, String soQlhh, String soToKhai, String tinhTrangDoiChieu){
        SearchDeclareCustomsDeclarationFunction fnc = new SearchDeclareCustomsDeclarationFunction();
        fnc.selectLink();
        fnc.fillForm(tuNgay,denNgay,maLo,soContainer,soVanDon,soQlhh,soToKhai,tinhTrangDoiChieu);
        fnc.selectTab();
    }
}
