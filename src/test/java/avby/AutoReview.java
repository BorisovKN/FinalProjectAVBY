package avby;

import avby.pageObject.LoginPage;
import avby.pageObject.ReviewPage;
import framework.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoReview extends BaseTest {
    @Test
    public void autoReview() {
        LoginPage.navigateLoginPage("Войти");
        LoginPage.navigateSpan();
        LoginPage.inPutMail();
        LoginPage.inPutPassword();
        LoginPage.clickEnter();
        LoginPage.clickCookieBanner();
        ReviewPage.navigateJournalPage("Журнал");
        ReviewPage.navigateReviewPage("Обзоры");
        ReviewPage.navigateReviewAutoPage();
    }
}
