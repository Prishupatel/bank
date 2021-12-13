package com.bank.cucumber.steps;

import com.bank.pages.CustomerLoginPage;
import cucumber.api.java.en.And;

public class CustomerLoginPageSteps {
    @And("^I click on Logout  button$")
    public void iClickOnLogoutButton() {
        new CustomerLoginPage().clickOnLogout();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickLoginButton();
    }

    @And("^I select my name \"([^\"]*)\"$")
    public void iSelectMyName(String name) {
        new CustomerLoginPage().selectYourName(name);
    }
}
