package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;

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
    public void enterEmailAddress() {
        loginPage.getDriver().findElement(loginPage.getEMAIL_INPUT_FIELD()).sendKeys("srodriguezdev.l@gmail.com");
    }

    @Step
    public void enterPasswordField() {
        loginPage.getDriver().findElement(loginPage.getTXT_FIELD_PASSWORD()).sendKeys("123asdfA");
    }

    @Step
    public void confirmPasswordField() {
        loginPage.getDriver().findElement(loginPage.getTXT_FIELD_CONFIRM_PASSWORD()).sendKeys("123asdfA");
    }

    @Step
    public void canSeeHomePage() {
        loginPage.getDriver().findElement(loginPage.getTXT_SPAN_HOME_PAGE());
    }
}
