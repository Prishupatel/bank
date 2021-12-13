package com.bank.cucumber.steps;

import com.bank.pages.BankManagerLoginPage;
import cucumber.api.java.en.Then;

public class BankManagerLoginSteps {
    @Then("^I click on add customer tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @Then("^I click on open account tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountTab();

    }
}
