package com.co.autbooking.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("^the user navigate to url$")
    public void theUserNavigateToUrl() {
        loginStep.openBrowser();
    }

    @When("^the user put the credentials$")
    public void theUserPutTheCredentials() {
        loginStep.enterEmailAddress();
        loginStep.confirmPasswordField();
    }

    @Then("^the user can see the home page$")
    public void theUserCanSeeTheHomePage() {
        loginStep.canSeeHomePage();
    }
}
