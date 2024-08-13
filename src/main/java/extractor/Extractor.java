package extractor;

import models.Hotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HotelPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Extractor {
    HotelPage hotelPage = new HotelPage();
    WebDriverWait wait = new WebDriverWait(hotelPage.getDriver(), Duration.ofSeconds(10));

    public List<Hotel> hotelExtractor() {
        List<Hotel> hotels = new ArrayList<>();

        //Found the containers of the hotels
        List<WebElement> hotelElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(hotelPage.getHOTEL_ELEMENT_PRIMARY_CON()));

        for (WebElement hotelElement : hotelElements) {

            WebElement title = hotelElement.findElement(hotelPage.getHOTEL_TITLE());
            String hotelName = title.getText();

            WebElement image =  hotelElement.findElement(hotelPage.getHOTEL_IMAGE());
            String urlImage = image.getAttribute("src");

            WebElement price = hotelElement.findElement(hotelPage.getHOTEL_PRICE());
            String hotelPrice = price.getText();

            Hotel hotel = new Hotel(hotelName, hotelPrice, urlImage);
            hotels.add(hotel);
        }
        return hotels;
    }
}
