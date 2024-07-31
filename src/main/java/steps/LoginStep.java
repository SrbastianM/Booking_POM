package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.LoginPage;

import java.time.Duration;

public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser() {
        loginPage.open();
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
    public void enterPasswordField(String password) {
        loginPage.getDriver().findElement(loginPage.getTXT_FIELD_PASSWORD()).sendKeys(password);
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN_SIGN_IN()).click();
        loginPage.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Step
    public void canSeeHomePage() {
        loginPage.getDriver().findElement(loginPage.getTXT_SPAN_HOME_PAGE());
    }
}
