package avby.pageObject;

import framework.BasePage;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ReviewPage extends BasePage {
    private static final Label PAGE_LOCATOR = new Label(By.xpath("//h1[@class='journal-heading__title' and text()='Обзоры']"));
    private static final By pageLocator = By.xpath("//h1[@class='journal-heading__title' and text()='%s']");
    private static final String NAV_JOURNAL_PAGE = "//span[@class='nav__link-text' and text()='%s']";
    private static final String NAV_REVIEW_PAGE = "//a[@class='joirnal__navlink' and text()='%s']";
    private static final Label NAV_REVIEW_AUTO = new Label(By.xpath("//article[@class='journal-item journal-item--main']"));

    public ReviewPage() {
        super(pageLocator, "'Review' Page");
    }

    @Step("Проверка загрузившейся страницы.")
    public void isPageOpened(){
        Assert.assertTrue(PAGE_LOCATOR.isDisplayed(), "ERROR: Страница 'Review page' не была загружена!!!");
    }
    @Step("Переход на страницу Журнал.")
    public static void navigateJournalPage(String journalPage){
        Label navJournalPage = new Label(By.xpath(String.format(NAV_JOURNAL_PAGE, journalPage)));
        navJournalPage.clickAndWait();
    }
    @Step("Переход на страницу Обзоры.")
    public void navigateReviewPage(String reviewPage) {
        Label navReviewPage = new Label(By.xpath(String.format(NAV_REVIEW_PAGE, reviewPage)));
        navReviewPage.clickAndWait();
    }
    @Step("Переход на страницу Обзоры авто.")
    public void navigateReviewAutoPage() {
        NAV_REVIEW_AUTO.clickAndWait();
    }


}
