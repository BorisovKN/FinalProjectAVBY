package avby;

import avby.pageObject.LoginPage;
import avby.pageObject.SearchPage;
import org.testng.annotations.Test;


public class CarSearch {
    @Test
    public void carSearch() {
        LoginPage.navigateLoginPage("Войти");
        LoginPage.navigateSpan();
        LoginPage.inPutMail();
        LoginPage.inPutPassword();
        LoginPage.clickEnter();
        LoginPage.clickCookieBanner();
        SearchPage.navigateMark("Renault");
        SearchPage.navigateMarkModel("Модeль");
        SearchPage.navigateMarkModeAuto("Scenic");
        SearchPage.clickTypeOfGear("механика");
        SearchPage.clickGenerationAuto("Поколение");
        SearchPage.clickGenerationAutoClick("IV, 2016…");
        SearchPage.clickManufactureYear("Год от");
        SearchPage.clickManufactureYearAuto("2018");
        SearchPage.clickTypeOfEngine();
        SearchPage.clickSelectTypeOfEngine("дизель");
        SearchPage.clickShow("Показать");
    }
}
