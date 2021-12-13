package com.bank.cucumber.steps;

import com.bank.pages.OpenAccountPage;
import cucumber.api.java.en.And;

public class OpenAccountPageSteps {
    @And("^I select customer name \"([^\"]*)\"$")
    public void iSelectCustomerName(String name) {
      new OpenAccountPage().selectCustomerName(name);
    }

    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String curr){
      new OpenAccountPage().selectCurrency(curr);
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }
}
