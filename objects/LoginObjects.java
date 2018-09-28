package objects;

import org.openqa.selenium.By;

public class LoginObjects {
    public By userNameTxt = By.id("Username");
    public By passwordTxt = By.id("Password");
    public By loginBtn = By.xpath("//input[@value='Đăng nhập']");
    public By logoutBtn = By.xpath("//a[@class='btn btn-primary']");
    public By resultLbl = By.xpath("//b[contains(text(),'Chào mừng Đội Phát hành Chứng từ')]");
    public By invalidUserLbl = By.xpath("//li[contains(text(),'Người dùng không tồn tại')]");
    public By invalidPasswordLbl = By.xpath("//li[contains(text(),'Mật khẩu không đúng')]");
}
