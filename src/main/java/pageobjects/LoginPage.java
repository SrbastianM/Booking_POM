package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/index.html?lang=en-us&soz=1&lang_changed=1")
public class LoginPage extends PageObject {
    // If booking want a check the robot
    By BTN_PRESS_AND_HOLD = By.xpath("p[@class='toJYxZLwQupRvMm' and text()='Press and hold']");

    // Login ->
    By BTN_CONTINUE = By.xpath("//span[@class='TKez1AxowpXXm_eCa_Bz'][contains(.,'Continue with email')]");
    By BTN_SIGN_IN = By.xpath("(//span[@class='eed450ee2f'][contains(.,'Sign in')])[1]");
    By BTN_LOGIN_SIGN_IN = By.xpath("//button[@type='submit'][contains(.,'Sign in')]");
    By BTN_CREATE_ACCOUNT = By.xpath("//span[contains(.,'Create account')]");
    By EMAIL_INPUT_FIELD = By.xpath("//input[contains(@class,'LkmBPiMnXBfMgmQ98uiP')]");
    By TXT_FIELD_PASSWORD = By.xpath("//input[@placeholder='Enter your password']");
    By TXT_FIELD_CONFIRM_PASSWORD = By.xpath("//input[contains(@name,'confirmed_password')]");
    By TXT_SPAN_HOME_PAGE = By.xpath("//div[@class='d3c6350bdd eb02592978 ad0b39688b'][contains(.,'Offers')]");

    public By getBTN_PRESS_AND_HOLD() {
        return BTN_PRESS_AND_HOLD;
    }

    public void setBTN_PRESS_AND_HOLD(By BTN_PRESS_AND_HOLD) {
        this.BTN_PRESS_AND_HOLD = BTN_PRESS_AND_HOLD;
    }
    public By getEMAIL_INPUT_FIELD() {
        return EMAIL_INPUT_FIELD;
    }

    public void setEMAIL_INPUT_FIELD(By EMAIL_INPUT_FIELD) {
        this.EMAIL_INPUT_FIELD = EMAIL_INPUT_FIELD;
    }

    public By getBTN_SIGN_IN() {
        return BTN_SIGN_IN;
    }

    public void setBTN_SIGN_IN(By BTN_SIGN_IN) {
        this.BTN_SIGN_IN = BTN_SIGN_IN;
    }

    public By getTXT_FIELD_CONFIRM_PASSWORD() {
        return TXT_FIELD_CONFIRM_PASSWORD;
    }

    public void setTXT_FIELD_CONFIRM_PASSWORD(By TXT_FIELD_CONFIRM_PASSWORD) {
        this.TXT_FIELD_CONFIRM_PASSWORD = TXT_FIELD_CONFIRM_PASSWORD;
    }

    public By getTXT_FIELD_PASSWORD() {
        return TXT_FIELD_PASSWORD;
    }

    public void setTXT_FIELD_PASSWORD(By TXT_FIELD_PASSWORD) {
        this.TXT_FIELD_PASSWORD = TXT_FIELD_PASSWORD;
    }

    public By getTXT_SPAN_HOME_PAGE() {
        return TXT_SPAN_HOME_PAGE;
    }

    public void setTXT_SPAN_HOME_PAGE(By TXT_SPAN_HOME_PAGE) {
        this.TXT_SPAN_HOME_PAGE = TXT_SPAN_HOME_PAGE;
    }


    public By getBTN_CONTINUE() {
        return BTN_CONTINUE;
    }

    public void setBTN_CONTINUE(By BTN_CONTINUE) {
        this.BTN_CONTINUE = BTN_CONTINUE;
    }

    public By getBTN_CREATE_ACCOUNT() {
        return BTN_CREATE_ACCOUNT;
    }

    public void setBTN_CREATE_ACCOUNT(By BTN_CREATE_ACCOUNT) {
        this.BTN_CREATE_ACCOUNT = BTN_CREATE_ACCOUNT;
    }

    public By getBTN_LOGIN_SIGN_IN() {
        return BTN_LOGIN_SIGN_IN;
    }

    public void setBTN_LOGIN_SIGN_IN(By BTN_LOGIN_SIGN_IN) {
        this.BTN_LOGIN_SIGN_IN = BTN_LOGIN_SIGN_IN;
    }

}
