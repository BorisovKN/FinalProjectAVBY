package avby;

import avby.pageObject.RegPageInvalidPassword;
import org.testng.annotations.Test;


public class RegInvalidPassword {
    @Test
    public void avByRegPassword() {
        RegPageInvalidPassword regPageInvalidPassword = new RegPageInvalidPassword();
        regPageInvalidPassword.navigateLoginPage("Войти");
        regPageInvalidPassword.navigateSpan();
        regPageInvalidPassword.inPutName();
        regPageInvalidPassword.inPutMail();
        regPageInvalidPassword.inPutPassword();
        regPageInvalidPassword.clickCheckBox();
        regPageInvalidPassword.clickReg();
    }
}
