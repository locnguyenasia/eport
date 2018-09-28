package libraries;

import objects.SearchDeclareCustomsDeclarationObject;
import static supports.CommonFunctions.*;

public class SearchDeclareCustomsDeclarationFunction {

    SearchDeclareCustomsDeclarationObject obj = new SearchDeclareCustomsDeclarationObject();

    public void selectLink(){
        click(obj.KhaiBaoHaiQuanLnk);
        click(obj.DanhSachKhaiBaoToKhaiSoQlhhLnk);
    }

    public void fillForm(String tuNgay, String denNgay, String maLo, String soContainer, String soVanDon, String soQlhh, String soToKhai, String tinhTrangDoiChieu){
        fillIn(obj.TuNgayDtp, tuNgay);
        fillIn(obj.DenNgayDtp, denNgay);
        fillIn(obj.MaLoTxt, maLo);
        fillIn(obj.SoContainerTxt, soContainer);
        fillIn(obj.SoVanDonTxt, soVanDon);
        fillIn(obj.SoQlhhTxt, soQlhh);
        fillIn(obj.SoToKhaiTxt, soToKhai);
        click(obj.TinhTrangDoiChieuDdl);

        switch (tinhTrangDoiChieu) {
            case "1":
                click(obj.OptionKhopDdl);
                break;
            case "2":
                click(obj.OptionKhongKhopDdl);
                break;
            case "3":
                click(obj.OptionChuaDoiChieuDdl);
                break;
            default:
                break;
        }
        click(obj.TimKiemBtn);
    }

    public void selectTab(){
        if (isEnabled(obj.SoToKhaiTab)){
            click(obj.SoToKhaiTab);
            click(obj.XuatExcelSoToKhaiBtn);
        }
    }
}
