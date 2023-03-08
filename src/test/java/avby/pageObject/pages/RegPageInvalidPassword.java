package avby.pageObject.pages;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.InPut;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegPageInvalidPassword extends BasePage {
    private static final Label PAGE_LOCATOR = new Label(By.xpath("//div[@class='author__title' and text()='%s']"));
    private static final By pageLocator = By.xpath("//div[@class='auth__title' and text()='Вход']");
    private static final String NAV_LOGIN_PAGE = "//div[contains(@class,'drawer__slide--active')]//button[text()='%s']";
    private static final Button NAV_SPAN = new Button(By.xpath("//div[@class='drawer__slide drawer__slide--active']//button[@class='drawer__slide-toggle']//span"));
    private static final InPut INPUT_NAME = new InPut(By.xpath("//input[@class='form-control form-control--large' and @id='name']"));
    private static final InPut INPUT_MAIL = new InPut(By.xpath("//input[@class='form-control form-control--large' and @id='regEmail']"));
    private static final InPut INPUT_PASSWORD = new InPut(By.xpath("//input[@class='form-control form-control--large' and @id='regPassword']"));
    private static final Button CHECK_BOX = new Button(By.xpath("//div[@class='auth__option']//label[@class='checkbox' and @for='emailUserEulaAccepted']//span[text()='Я понимаю и согласен с']"));
    private static final Button REG = new Button(By.xpath("//div[@aria-labelledby='почте']//span[@class='button__text' and text()='Зарегистрироваться']"));


    public RegPageInvalidPassword() {
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
    public void navigateSpan(){
        NAV_SPAN.clickAndWait();
    }
    public void inPutName(){
        INPUT_NAME.sendKeys("Иван");
    }
    public void inPutMail(){
        INPUT_MAIL.sendKeys("hdeer9598@gmail.com");
    }
    public void inPutPassword(){
        INPUT_PASSWORD.sendKeys("гупцаыдвмидыв");
    }
    public void clickCheckBox(){
        CHECK_BOX.clickAndWait();
    }
    public void clickReg(){
        REG.clickAndWait();
    }
}
