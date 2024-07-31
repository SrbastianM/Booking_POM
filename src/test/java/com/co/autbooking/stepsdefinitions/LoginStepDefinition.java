package com.co.autbooking.stepsdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Credentials;
import net.thucydides.core.annotations.Steps;
import org.jetbrains.annotations.NotNull;
import steps.LoginStep;

import java.util.List;
import java.util.Map;

public class LoginStepDefinition {

    @DataTableType
    public Credentials convert(Map<String, String> entry) {
        Credentials credentials = new Credentials();
        credentials.setEmail(entry.get("email"));
        credentials.setPassword(entry.get("password"));
        return credentials;
    }

    @Steps
    LoginStep loginStep;

    @Given("^the user navigate to url$")
    public void theUserNavigateToUrl() {
        loginStep.openBrowser();
        loginStep.clickSignIn();
    }

    @When("^the user put the credentials$")
    public void theUserPutTheCredentials(@NotNull List<Credentials>credentialsList) {
        loginStep.enterEmailAddress(credentialsList.get(0).getEmail());
        loginStep.enterPasswordField(credentialsList.get(0).getPassword());
    }

    @Then("^the user can see the home page$")
    public void theUserCanSeeTheHomePage() {
        loginStep.canSeeHomePage();
    }
}
