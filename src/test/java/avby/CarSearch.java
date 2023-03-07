package avby;

import avby.pageObject.LoginPage;
import avby.pageObject.SearchPage;
import org.testng.annotations.Test;


public class CarSearch {
    @Test
    public void carSearch() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigateLoginPage("Войти");
        loginPage.navigateSpan();
        loginPage.inPutMail();
        loginPage.inPutPassword();
        loginPage.clickEnter();
        loginPage.clickCookieBanner();
        SearchPage searchPage = new SearchPage();
        searchPage.navigateMark("Renault");
        searchPage.navigateMarkModel("Модeль");
        searchPage.navigateMarkModeAuto("Scenic");
        searchPage.clickTypeOfGear("механика");
        searchPage.clickGenerationAuto("Поколение");
        searchPage.clickGenerationAutoClick("IV, 2016…");
        searchPage.clickManufactureYear("Год от");
        searchPage.clickManufactureYearAuto("2018");
        searchPage.clickTypeOfEngine();
        searchPage.clickSelectTypeOfEngine("дизель");
        searchPage.clickShow("Показать");
    }
}
