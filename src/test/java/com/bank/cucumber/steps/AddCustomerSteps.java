package com.bank.cucumber.steps;

import com.bank.pages.AddCustomerPage;
import cucumber.api.java.en.And;

public class AddCustomerSteps {
    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String name)  {
       new AddCustomerPage().enterFirstName(name);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String last)  {
        new AddCustomerPage().enterLastName(last);
    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String code)  {
        new AddCustomerPage().enterPostCode(code);
    }

    @And("^I click on add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerBt();
    }
}
