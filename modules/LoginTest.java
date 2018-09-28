package modules;

import data.LoginData;
import libraries.LoginFunction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

//    @Test(dataProvider = "LoginData", dataProviderClass = LoginData.class)
//    public void log001_Login(String username, String password, String result){
//        LoginFunction fnc = new LoginFunction();
//        fnc.fillForm(username,password);
//        Assert.assertEquals(result, fnc.getInvalidUser());
//    }

    @Test(dataProvider = "LoginData", dataProviderClass = LoginData.class)
    public void log002_Login(String username, String password, String result){
        LoginFunction fnc = new LoginFunction();
        fnc.fillForm(username,password);
        Assert.assertEquals(result, fnc.getResult());
    }
}
