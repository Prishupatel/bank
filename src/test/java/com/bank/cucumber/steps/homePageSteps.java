package com.bank.cucumber.steps;

import com.bank.pages.HomePage;
import cucumber.api.java.en.When;

public class homePageSteps {
    @When("^I click on manager login link$")
    public void iClickOnManagerLoginLink() {
        new HomePage().clickOnManagerLoginLink();
    }

    @When("^I click on customer login link$")
    public void iClickOnCustomerLoginLink() {
        new HomePage().clickOnCustomerLoginLink();
    }
}
