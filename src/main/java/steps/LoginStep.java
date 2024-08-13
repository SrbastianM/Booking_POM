package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginStep {
    LoginPage loginPage = new LoginPage();
    Logger logger = Logger.getLogger(getClass().getName());
    WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), Duration.ofSeconds(5));

    @Step
    public void openBrowser() {
        loginPage.open();
        loginPage.getDriver().manage().window().maximize();
    }

    @Step
    public void clickSignIn() {
        loginPage.getDriver().findElement(loginPage.getBTN_SIGN_IN()).click();
    }

    @Step
    public void enterEmailAddress(String email) {
        loginPage.getDriver().findElement(loginPage.getEMAIL_INPUT_FIELD()).sendKeys(email);
        loginPage.getDriver().findElement(loginPage.getBTN_CONTINUE()).click();
    }

    @Step
    public void enterPasswordField(String password)  {
        loginPage.getDriver().findElement(loginPage.getTXT_FIELD_PASSWORD()).sendKeys(password);
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN_SIGN_IN()).click();
    }


    @Step
    public void canSeeHomePage() {
       wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getTXT_SPAN_HOME_PAGE()));
    }
}
