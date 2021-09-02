package com.google.test.definition;

import com.google.test.steps.OpenGoogleStep;
import com.google.test.steps.SearchStep;
import com.google.test.steps.VerifyStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleDefinition {

    @Steps
    OpenGoogleStep openGoogle;
    @Steps
    SearchStep search;
    @Steps
    VerifyStep verify;

    @Given("the User wants to search something in the google page")
    public void the_user_wants_to_search_something_in_the_google_page() {
        openGoogle.page();
    }
    @When("he searches for {string}")
    public void he_searches_for_a_word(String word) {
        search.aWord(word);
    }


    @Then("the results are displayed")
    public void the_results_are_displayed() {
        verify.theElementIsDisplayed();
    }
}
