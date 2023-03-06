package avby;

import avby.pageObject.RegPageInvalidPassword;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegInvalidPassword {
    @Test
    public void avByRegPassword() {
        RegPageInvalidPassword loginPageInvalidMail = new RegPageInvalidPassword();
        RegPageInvalidPassword.navigateLoginPage("Войти");
        RegPageInvalidPassword.navigateSpan();
        RegPageInvalidPassword.inPutName();
        RegPageInvalidPassword.inPutMail();
        RegPageInvalidPassword.inPutPassword();
        RegPageInvalidPassword.clickCheckBox();
        RegPageInvalidPassword.clickReg();
    }
}
