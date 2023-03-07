package avby;

import avby.pageObject.LoginPage;
import avby.pageObject.ReviewPage;
import framework.BaseTest;
import org.testng.annotations.Test;

public class AutoReview extends BaseTest {
    @Test
    public void autoReview() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigateLoginPage("Войти");
        loginPage.navigateSpan();
        loginPage.inPutMail();
        loginPage.inPutPassword();
        loginPage.clickEnter();
        loginPage.clickCookieBanner();
        ReviewPage reviewPage = new ReviewPage();
        reviewPage.navigateJournalPage("Журнал");
        reviewPage.navigateReviewPage("Обзоры");
        reviewPage.navigateReviewAutoPage();
    }
}
