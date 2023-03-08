package avby.tests;

import avby.pageObject.pages.RegPageInvalidName;
import framework.BaseTest;
import org.testng.annotations.Test;



public class RegInvalidName extends BaseTest {
    @Test
    public void avByRegName() {
        RegPageInvalidName regPageInvalidName = new RegPageInvalidName();
        regPageInvalidName.navigateLoginPage("Войти");
        regPageInvalidName.navigateSpan();
        regPageInvalidName.inPutName();
        regPageInvalidName.inPutMail();
        regPageInvalidName.inPutPassword();
        regPageInvalidName.clickCheckBox();
        regPageInvalidName.clickReg();
    }
}
