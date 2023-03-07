package avby;

import avby.pageObject.RegPageInvalidMail;
import framework.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegInvalidMail extends BaseTest {
    @Test
    public void aVByRegMail() {
        RegPageInvalidMail regPageInvalidMail = new RegPageInvalidMail();
        regPageInvalidMail.navigateLoginPage("Войти");
        regPageInvalidMail.navigateSpan();
        regPageInvalidMail.inPutName();
        regPageInvalidMail.inPutMail();
        regPageInvalidMail.inPutPassword();
        regPageInvalidMail.clickCheckBox();
        regPageInvalidMail.clickReg();
    }
}
