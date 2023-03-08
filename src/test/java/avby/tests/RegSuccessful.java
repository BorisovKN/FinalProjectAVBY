package avby.tests;

import avby.pageObject.pages.RegPage;
import framework.BaseTest;
import org.testng.annotations.Test;

public class RegSuccessful extends BaseTest {
    @Test
    public void reg() {
        RegPage regPage = new RegPage();
        regPage.navigateLoginPage("Войти");
        regPage.navigateSpan();
        regPage.inPutName();
        regPage.inPutMail();
        regPage.inPutPassword();
        regPage.clickCheckBox();
        regPage.clickReg();
    }
}
