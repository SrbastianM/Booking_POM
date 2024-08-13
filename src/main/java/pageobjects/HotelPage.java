package pageobjects;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/index.html?aid=2311236&label=es-co-booking-desktop-vjGZbEFOhRc3a9njxeT3IwS652829002024%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-65526620%3Alp20202%3Ali%3Adec%3Adm&ws=&gclid=EAIaIQobChMI2Meyyq_yhwMV2JxaBR0hOBCJEAAYASAAEgKIuvD_BwE&lang=en-us&soz=1&lang_changed=1")
public class HotelPage extends PageObject {
    //   Home Page Selector
    By TITLE_HOME_PAGE = By.xpath("//span[contains(@class,'ea8d0b18c5 f6d5c72092 c9472f97ad')]");
    By DROPDOWN_CALENDAR = By.xpath("//input[contains(@placeholder,'Where are you going?')]");
    By SELECTOR_PEOPLE = By.xpath("//input[contains(@placeholder,'Where are you going?')]");
    By SELECT_DROPDOWN_OPTION = By.xpath("//div[@class='ad3c4dc079 e2f45f66c9'][contains(.,'Cartagena de Indias')]");

    // Select Destination Place
    By SELECT_INPUT_DESTINATION = By.xpath("//input[contains(@placeholder,'Where are you going?')]");
    By SELECT_BUTTON_SEARCH = By.xpath("//button[@type='submit'][contains(.,'Search')]");

    // See Search Result Page
    By TITLE_SEARCH_RESULT = By.xpath("//h1[@aria-live='assertive']");
    // Hotel Stars
    By THREE_STARS_CHECK = By.xpath("(//div[contains(.,'3 stars')])[15]");
    By FOUR_STARS_CHECK = By.xpath("(//div[contains(.,'4 stars')])[15]");
    By FIVE_STARS_CHECK = By.xpath("(//div[contains(.,'5 stars')])[15]");

    // Drag and Drop -> NO ESTA FUNCIONANDO :))))))
    By FROM_ELEMENT = By.xpath("(//div[contains(@class,'d19f1471e1')])[1]");
    By TO_ELEMENT = By.xpath("(//div[contains(@role,'none')])[3]");


    // Select lower price option
    By SELECT_LOWER_PRICE = By.xpath("//div[@class='adc8292e09 ea1e323a59 fbe4119cc7']//div//span[@class='cdebd92b49']//button[@type='button']");
    By OPTION_LOWER_PRICE = By.xpath("//div[@class='c324bdcee4 ec7ca45eb7 ab9d1f83a2'][contains(.,'Price (lowest first)')]");


    // Hotel lower Price option
    By HOTEL_ELEMENT_PRIMARY_CON = By.xpath("//div[@data-testid='property-card']");
    By HOTEL_TITLE = By.xpath(".//div[@data-testid='title']");
    By HOTEL_IMAGE = By.xpath(".//img");
    By HOTEL_PRICE = By.xpath(".//span[@data-testid='price-and-discounted-price']");


    public By getHOTEL_ELEMENT_PRIMARY_CON() {
        return HOTEL_ELEMENT_PRIMARY_CON;
    }

    public void setHOTEL_ELEMENT_PRIMARY_CON(By HOTEL_ELEMENT_PRIMARY_CON) {
        this.HOTEL_ELEMENT_PRIMARY_CON = HOTEL_ELEMENT_PRIMARY_CON;
    }

    public By getHOTEL_TITLE() {
        return HOTEL_TITLE;
    }

    public void setHOTEL_TITLE(By HOTEL_TITLE) {
        this.HOTEL_TITLE = HOTEL_TITLE;
    }

    public By getHOTEL_IMAGE() {
        return HOTEL_IMAGE;
    }

    public void setHOTEL_IMAGE(By HOTEL_IMAGE) {
        this.HOTEL_IMAGE = HOTEL_IMAGE;
    }

    public By getHOTEL_PRICE() {
        return HOTEL_PRICE;
    }

    public void setHOTEL_PRICE(By HOTEL_PRICE) {
        this.HOTEL_PRICE = HOTEL_PRICE;
    }



    public By getOPTION_LOWER_PRICE() {
        return OPTION_LOWER_PRICE;
    }

    public void setOPTION_LOWER_PRICE(By OPTION_LOWER_PRICE) {
        this.OPTION_LOWER_PRICE = OPTION_LOWER_PRICE;
    }



    public By getSELECT_LOWER_PRICE() {
        return SELECT_LOWER_PRICE;
    }

    public void setSELECT_LOWER_PRICE(By SELECT_LOWER_PRICE) {
        this.SELECT_LOWER_PRICE = SELECT_LOWER_PRICE;
    }



    public By getFROM_ELEMENT() {
        return FROM_ELEMENT;
    }

    public void setFROM_ELEMENT(By FROM_ELEMENT) {
        this.FROM_ELEMENT = FROM_ELEMENT;
    }

    public By getTO_ELEMENT() {
        return TO_ELEMENT;
    }

    public void setTO_ELEMENT(By TO_ELEMENT) {
        this.TO_ELEMENT = TO_ELEMENT;
    }

    public By getTHREE_STARS_CHECK() {
        return THREE_STARS_CHECK;
    }

    public void setTHREE_STARS_CHECK(By THREE_STARS_CHECK) {
        this.THREE_STARS_CHECK = THREE_STARS_CHECK;
    }

    public By getFOUR_STARS_CHECK() {
        return FOUR_STARS_CHECK;
    }

    public void setFOUR_STARS_CHECK(By FOUR_STARS_CHECK) {
        this.FOUR_STARS_CHECK = FOUR_STARS_CHECK;
    }

    public By getFIVE_STARS_CHECK() {
        return FIVE_STARS_CHECK;
    }

    public void setFIVE_STARS_CHECK(By FIVE_STARS_CHECK) {
        this.FIVE_STARS_CHECK = FIVE_STARS_CHECK;
    }



    public By getTITLE_SEARCH_RESULT() {
        return TITLE_SEARCH_RESULT;
    }

    public void setTITLE_SEARCH_RESULT(By TITLE_SEARCH_RESULT) {
        this.TITLE_SEARCH_RESULT = TITLE_SEARCH_RESULT;
    }



    public By getSELECT_BUTTON_SEARCH() {
        return SELECT_BUTTON_SEARCH;
    }

    public void setSELECT_BUTTON_SEARCH(By SELECT_BUTTON_SEARCH) {
        this.SELECT_BUTTON_SEARCH = SELECT_BUTTON_SEARCH;
    }



    public By getSELECT_INPUT_DESTINATION() {
        return SELECT_INPUT_DESTINATION;
    }

    public void setSELECT_INPUT_DESTINATION(By SELECT_INPUT_DESTINATION) {
        this.SELECT_INPUT_DESTINATION = SELECT_INPUT_DESTINATION;
    }




    public By getTITLE_HOME_PAGE() {
        return TITLE_HOME_PAGE;
    }


    public void setTITLE_HOME_PAGE(By TITLE_HOME_PAGE) {
        this.TITLE_HOME_PAGE = TITLE_HOME_PAGE;
    }



    public By getBTN_CONTINUE_WITH_EMAIL() {
        return BTN_CONTINUE_WITH_EMAIL;
    }

    public void setBTN_CONTINUE_WITH_EMAIL(By BTN_CONTINUE_WITH_EMAIL) {
        this.BTN_CONTINUE_WITH_EMAIL = BTN_CONTINUE_WITH_EMAIL;
    }

    By BTN_CONTINUE_WITH_EMAIL = By.xpath("//span[contains(.,'Continuar con e-mail')]");


    public By getSELECT_DROPDOWN_OPTION() {
        return SELECT_DROPDOWN_OPTION;
    }

    public void setSELECT_DROPDOWN_OPTION(By SELECT_DROPDOWN_OPTION) {
        this.SELECT_DROPDOWN_OPTION = SELECT_DROPDOWN_OPTION;
    }


    public By getSELECTOR_PEOPLE() {
        return SELECTOR_PEOPLE;
    }

    public void setSELECTOR_PEOPLE(By SELECTOR_PEOPLE) {
        this.SELECTOR_PEOPLE = SELECTOR_PEOPLE;
    }

    public By getDROPDOWN_CALENDAR() {
        return DROPDOWN_CALENDAR;
    }

    public void setDROPDOWN_CALENDAR(By DROPDOWN_CALENDAR) {
        this.DROPDOWN_CALENDAR = DROPDOWN_CALENDAR;
    }

}