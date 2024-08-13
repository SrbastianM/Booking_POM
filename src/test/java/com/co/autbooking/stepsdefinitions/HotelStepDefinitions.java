package com.co.autbooking.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Credentials;
import net.thucydides.core.annotations.Steps;
import steps.HotelStep;


public class HotelStepDefinitions {
    @Steps
    HotelStep hotelStep;


    @Given("the user is logged and see home page")
    public void theUserIsLoggedAndSeeHomePage() {
        hotelStep.canSeeHomePage();
    }

    @When("the user select destination place")
    public void theUserSelectDestinationPlace() {
       hotelStep.canSeeTheInputNamedDestinationPlace();
    }

    @And("the user selects {string} as option to travel")
    public void theUserSelectsAsOptionToTravel(String destinationPlace) {
        hotelStep.selectInputDestination(destinationPlace);
    }

    @Then("the user select the search button")
    public void theUserSelectTheSearchButton() {
        hotelStep.selectSearchButton();
    }

    @When("the user see the search results")
    public void theUserSeeTheSearchResults() {
        hotelStep.seeSearchResult();
    }

    @And("the user drag to 800000 or more budget per night")
    public void theUserDragToOrMoreBudgetPerNight() {
        hotelStep.dragAndDropPrice();
    }

    @And("the user select 3 or more as property rating")
    public void theUserSelectOrMoreAsPropertyRating() {
        hotelStep.checkHotelStars();
    }

    @And("the user select Price lowest first as option")
    public void theUserSelectPriceLowestFirstAsOption() {
        hotelStep.selectLowerPriceOption();
    }


    @Then("the user select the first option and save all the hotel information")
    public void theUserSelectTheFirstOptionAndSaveAllTheHotelInformation() {
        hotelStep.extractLowerPriceInformation();
    }
}
