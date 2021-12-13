package com.bank.cucumber.steps;

import com.bank.pages.AccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AccountPageSteps {
    @And("^I click on deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String str)  {
        new AccountPage().enterAmountToDeposit(str);

    }

    @And("^I click to deposit money$")
    public void iClickToDepositMoney() {
        new AccountPage().clickDepositFeature();
    }

    @And("^I can see deposit successful$")
    public void iCanSeeDepositSuccessful() {
        new AccountPage().getTextDepositSuccessfulMessage();
    }

    @Then("^I click on withdraw tab$")
    public void iClickOnWithdrawTab() {
        new AccountPage().clickOnWithdrawalTab();
    }

    @And("^I enter amount for withdraw \"([^\"]*)\"$")
    public void iEnterAmountForWithdraw(String amt)  {
        new AccountPage().enterAmountToWithdraw(amt);
    }

    @And("^I click on withdraw for cash$")
    public void iClickOnWithdrawForCash() throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().clickOnWithdrawFeature();
    }

    @And("^I can see transaction$")
    public void iCanSeeTransaction() {

        new AccountPage().getTextTransaction();
    }

    @And("^I enter amount to be withdrawn \"([^\"]*)\"$")
    public void iEnterAmountToBeWithdrawn(String amout)  {
        new AccountPage().enteramountForCash(amout);

    }
}
