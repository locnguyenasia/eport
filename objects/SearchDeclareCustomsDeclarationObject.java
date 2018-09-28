package objects;

import org.openqa.selenium.By;

public class SearchDeclareCustomsDeclarationObject {
    public By KhaiBaoHaiQuanLnk = By.xpath("//*[@id=\"side-menu\"]/li[8]/a");
    public By DanhSachKhaiBaoToKhaiSoQlhhLnk = By.xpath("//*[@id=\"side-menu\"]/li[8]/ul/li[2]/a");
    public By TuNgayDtp = By.xpath("//input[@id='tuNgay']");
    public By DenNgayDtp = By.xpath("//input[@id='denNgay']");
    public By MaLoTxt = By.xpath("//input[@id='maLo']");
    public By SoContainerTxt = By.xpath("//input[@id='soCont']");
    public By SoVanDonTxt = By.xpath("//input[@id='soVanDon']");
    public By SoQlhhTxt = By.xpath("//input[@id='soQuanLyHangHoa']");
    public By SoToKhaiTxt = By.xpath("//input[@id='soToKhai']");
    public By TinhTrangDoiChieuDdl = By.xpath("//input[@id='tinhTrangDoiChieu']");
    public By OptionKhopDdl = By.xpath("//div[@class='dx-scrollview-content']//div[1]//div[1]");
    public By OptionKhongKhopDdl = By.xpath("//div[contains(text(),'Không Khớp')]");
    public By OptionChuaDoiChieuDdl = By.xpath("//div[contains(text(),'Chưa Đối Chiếu')]");
    public By TimKiemBtn = By.xpath("//*[@id=\"devextreme8\"]/div");
    public By SoToKhaiTab = By.xpath("//span[contains(text(),'Số tờ khai')]");
    public By SoQlhhTab = By.xpath("//span[contains(text(),'Số quản lý hàng hóa')]");
    public By XuatExcelSoToKhaiBtn = By.xpath("//span[contains(text(),'Xuất excel')]");
    public By XuatExcelSoQlhhBtn = By.xpath("//*[@id=\"devextreme15\"]/div");
}
