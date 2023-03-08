package avby.tests;

import avby.pageObject.pages.RegPageInvalidMail;
import framework.BaseTest;
import org.testng.annotations.Test;

public class RegInvalidMail extends BaseTest {
    @Test
    public void aVByRegMail() {
        RegPageInvalidMail regPageInvalidMail = new RegPageInvalidMail();
        regPageInvalidMail.navigateLoginPage("Войти");
        regPageInvalidMail.navigateSpan();
        regPageInvalidMail.inPutName();
        regPageInvalidMail.inPutMail();
        regPageInvalidMail.inPutPassword();
        regPageInvalidMail.clickCheckBox();
        regPageInvalidMail.clickReg();
    }
}
