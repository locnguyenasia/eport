package libraries;

import objects.LoginObjects;
import static supports.CommonFunctions.*;

public class LoginFunction {

    LoginObjects obj = new LoginObjects();

    public void fillForm(String username, String password){
        fillIn(obj.userNameTxt, username);
        fillIn(obj.passwordTxt, password);
        click(obj.loginBtn);
    }

    public void logOut(){
        click(obj.logoutBtn);
    }

    public String getResult(){
        return getText(obj.resultLbl);
    }

    public String getInvalidUser(){
        return getText(obj.invalidUserLbl);
    }

    public String getInvalidPassword(){
        return getText(obj.invalidPasswordLbl);
    }

}
