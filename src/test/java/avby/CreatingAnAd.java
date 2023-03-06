package avby;

import avby.pageObject.AdPage;
import avby.pageObject.LoginPage;
import framework.BaseTest;
import org.testng.annotations.Test;


public class CreatingAnAd extends BaseTest {
    @Test
    public void postingAnAd() {
        LoginPage.navigateLoginPage("Войти");
        LoginPage.navigateSpan();
        LoginPage.inPutMail();
        LoginPage.inPutPassword();
        LoginPage.clickEnter();
        LoginPage.clickCookieBanner();
        AdPage.submitAnAd();
        AdPage.clickTiresAndWheels("Шины и диски");
        AdPage.clickWheels("Диски");
        AdPage.quantity();
        AdPage.chooseQuantity();
        AdPage.typeOfWheels();
        AdPage.chooseTypeOfWheels();
        AdPage.conditionWheels("с пробегом");
        AdPage.discWidth();
        AdPage.chooseDiscWidth();
        AdPage.discDiameter();
        AdPage.chooseDiscDiameter();
        AdPage.pCD();
        AdPage.choosePCD();
        AdPage.eT();
        AdPage.chooseET();
        AdPage.clickDIA();
        AdPage.chooseDIA();
        AdPage.clickONWARD();
        AdPage.clickChoosePhoto();
        AdPage.clickONWARDS();
        AdPage.inputDescription();
        AdPage.inputPrice();
        AdPage.inputName();
        AdPage.inputPhone();
        AdPage.checkBox();
        AdPage.clickPublish();
    }
}
