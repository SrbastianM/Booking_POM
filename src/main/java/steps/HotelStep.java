package steps;

import extractor.Extractor;
import io.cucumber.java.AfterAll;
import models.Hotel;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HotelPage;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

public class HotelStep {
    HotelPage hotelPage = new HotelPage();
    WebDriverWait wait = new WebDriverWait(hotelPage.getDriver(), Duration.ofSeconds(10));
    Logger logger = Logger.getLogger(getClass().getName());

    @Step
    public void canSeeHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(hotelPage.getTITLE_HOME_PAGE()));
    }

    @Step
    public void selectInputDestination(String destinationPlace) {
        hotelPage.getDriver().findElement(hotelPage.getSELECT_INPUT_DESTINATION()).clear();
        hotelPage.getDriver().findElement(hotelPage.getSELECT_INPUT_DESTINATION()).sendKeys(destinationPlace);
    }

    @Step
    public void canSeeTheInputNamedDestinationPlace() {
        WebElement destinationPlace = wait.until(ExpectedConditions.visibilityOfElementLocated(hotelPage.getSELECT_INPUT_DESTINATION()));
        assert destinationPlace.isDisplayed();
    }

   @Step
   public void selectSearchButton() {
        WebElement buttonIsDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(hotelPage.getSELECT_BUTTON_SEARCH()));
        assert buttonIsDisplayed.isDisplayed();
        buttonIsDisplayed.click();
   }

   @Step
   public void seeSearchResult() {
        WebElement textDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(hotelPage.getTITLE_SEARCH_RESULT()));
        assert textDisplayed.isDisplayed();
   }

    @Step
    public void checkHotelStars() {
        By[] starsChecker = {
               hotelPage.getTHREE_STARS_CHECK(),
                hotelPage.getFOUR_STARS_CHECK(),
                hotelPage.getFIVE_STARS_CHECK()
        };

        for (By locator : starsChecker) {
            WebElement starChecker = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            assert starChecker.isDisplayed();

            if (starChecker.isDisplayed()) {
                starChecker.click();
            }
        }
    }

    @Step
    public void dragAndDropPrice() {
        WebElement fromElement = hotelPage.getDriver().findElement(hotelPage.getFROM_ELEMENT());
        WebElement toElement = hotelPage.getDriver().findElement(hotelPage.getTO_ELEMENT());

        if (!fromElement.isDisplayed()) {
            scrollToView(fromElement);
        }

        Actions builder = new Actions(hotelPage.getDriver());

        int xOffset = toElement.getLocation().getX() - fromElement.getLocation().getX();
        int yOffset = toElement.getLocation().getY() - fromElement.getLocation().getY();

        builder.clickAndHold(fromElement)
                .moveByOffset(xOffset, yOffset)
                .release()
                .perform();
    }
    private void scrollToView(WebElement element) {
        ((JavascriptExecutor) hotelPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Step
    public void selectLowerPriceOption() {
        WebElement dropdownList = wait.until(ExpectedConditions.visibilityOfElementLocated((hotelPage.getSELECT_LOWER_PRICE())));
        dropdownList.click();
        WebElement selectLowerPriceOption = wait.until(ExpectedConditions.visibilityOfElementLocated(hotelPage.getOPTION_LOWER_PRICE()));
        selectLowerPriceOption.click();
    }

    @Step
    public void extractLowerPriceInformation() {
        Extractor extractor = new Extractor();
        List<Hotel> hotels = extractor.hotelExtractor();
        for (Hotel hotel: hotels) {
            System.out.println(hotel);
        }
    }

    @AfterAll
    public void tearDown() {
        hotelPage.getDriver().quit();
    }
}
