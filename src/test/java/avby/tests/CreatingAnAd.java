package avby.tests;

import avby.pageObject.pages.AdPage;
import avby.pageObject.pages.LoginPage;
import framework.BaseTest;
import org.testng.annotations.Test;


public class CreatingAnAd extends BaseTest {
    @Test
    public void postingAnAd() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigateLoginPage("Войти");
        loginPage.navigateSpan();
        loginPage.inPutMail();
        loginPage.inPutPassword();
        loginPage.clickEnter();
        loginPage.clickCookieBanner();
        AdPage adPage = new AdPage();
        adPage.submitAnAd();
        adPage.clickTiresAndWheels("Шины и диски");
        adPage.clickWheels("Диски");
        adPage.quantity();
        adPage.chooseQuantity();
        adPage.typeOfWheels();
        adPage.chooseTypeOfWheels();
        adPage.conditionWheels("с пробегом");
        adPage.discWidth();
        adPage.chooseDiscWidth();
        adPage.discDiameter();
        adPage.chooseDiscDiameter();
        adPage.pCD();
        adPage.choosePCD();
        adPage.eT();
        adPage.chooseET();
        adPage.clickDIA();
        adPage.chooseDIA();
        adPage.clickONWARD();
        adPage.clickChoosePhoto();
        adPage.clickONWARDS();
        adPage.inputDescription();
        adPage.inputPrice();
        adPage.inputName();
        adPage.inputPhone();
        adPage.checkBox();
        adPage.clickPublish();
    }
}
