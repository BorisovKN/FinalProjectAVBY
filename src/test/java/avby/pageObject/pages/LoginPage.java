package avby.pageObject.pages;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.InPut;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BasePage {
    private static final Label PAGE_LOCATOR = new Label(By.xpath("//div[@class='author__title' and text()='%s']"));
    private static final By pageLocator = By.xpath("//div[@class='author__title' and text()='%s']");
    private static final String NAV_LOGIN_PAGE = "//span[@class='nav__link-text' and text()='%s']";
    private static final Button NAV_MAIL = new Button(By.xpath("//div[@class='tablist']//button[@class='tab' and text()='почте или логину']"));
    private static final InPut INPUT_MAIL = new InPut(By.xpath("//input[@class='form-control form-control--large' and @id='authLogin']"));
    private static final InPut INPUT_PASSWORD = new InPut(By.xpath("//input[@class='form-control form-control--large' and @id='loginPassword']"));
    private static final Button ENTER = new Button(By.xpath("//span[@class='button__text' and text()='Войти']"));
    private static final Button COOKIE_BANNER = new Button(By.xpath("//div[@class='cookie-banner__action']//span[@class='button__text']"));
    public LoginPage() {
        super(pageLocator, "'Login' Page");
    }

    @Step("Проверка загрузившейся страницы.")
    public void isPageOpened(){
        Assert.assertTrue(PAGE_LOCATOR.isDisplayed(), "ERROR: Страница 'Login page' не была загружена!!!");
    }
    @Step("Переход на страницу Вход.")
    public void navigateLoginPage(String loginPage){
        Label navLoginPage = new Label(By.xpath(String.format(NAV_LOGIN_PAGE, loginPage)));
        navLoginPage.clickAndWait();
    }
    @Step("Переход на страницу Вход по логину или почте.")
    public void navigateSpan(){
        NAV_MAIL.clickAndWait();
    }
    @Step("Ввод email.")
    public void inPutMail(){
        INPUT_MAIL.sendKeys("hdeer9598@gmail.com");
    }
    @Step("Ввод пароля.")
    public void inPutPassword(){
        INPUT_PASSWORD.sendKeys("Borisov88");
    }
    @Step("Вход.")
    public void clickEnter(){
        ENTER.clickAndWait();
    }
    @Step("Закрытие банера.")
    public  void clickCookieBanner(){
        COOKIE_BANNER.clickAndWait();
    }
}
