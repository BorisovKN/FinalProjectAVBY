package avby;

import avby.pageObject.RegPageInvalidName;
import framework.BaseTest;
import org.testng.annotations.Test;



public class RegInvalidName extends BaseTest {
    @Test
    public void avByRegName() {
        RegPageInvalidName loginPageInvalidMail = new RegPageInvalidName();
        RegPageInvalidName.navigateLoginPage("Войти");
        RegPageInvalidName.navigateSpan();
        RegPageInvalidName.inPutName();
        RegPageInvalidName.inPutMail();
        RegPageInvalidName.inPutPassword();
        RegPageInvalidName.clickCheckBox();
        RegPageInvalidName.clickReg();
    }
}
