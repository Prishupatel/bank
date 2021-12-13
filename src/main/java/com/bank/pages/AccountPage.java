package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement depositLink;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement depositBtn;

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositMsg;

    @FindBy(css = "input[placeholder='amount']")
    WebElement setAmount;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")  //input[@placeholder='amount']
    WebElement withdrawAmmount;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement withdraw;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement withdrawBtn;

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement withdrawText;

    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logOutBtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement errorMessage;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeBtLink;


    public void clickOnHomeBtn() {
        clickOnElement(homeBtLink);
        log.info("clicking on : " +  homeBtLink.toString());

    }

    public void clickOnDepositButton() {
        clickOnElement(depositLink);
        log.info("clicking on : " + depositLink.toString());
    }

    public void enterAmountToDeposit(String str) {
        sendTextToElement(setAmount,str);
        log.info(" entering amount : " + setAmount.toString());

    }

    public void clickDepositFeature() {
        clickOnElement(depositBtn);
        log.info("clicking on : " + depositBtn.toString());

    }

    public void enteramountForCash(String amt){
        sendTextToElement(withdrawAmmount, amt);
        log.info("entering amount for cash : " +withdrawAmmount.toString());
    }

    public String getTextDepositSuccessfulMessage() {

        String msg= getTextFromElement(depositMsg);
        log.info("verify msg : " + depositMsg.toString());
        return msg;
    }

    public void clickOnWithdrawalTab() {
        clickOnElement(withdraw);
        log.info("clicking on : " + withdraw.toString());
    }

    public void enterAmountToWithdraw(String amount) {
        sendTextToElement(setAmount, amount);
        log.info("Entering amount : " + setAmount.toString());

    }

    public void clickOnWithdrawFeature() {
        clickOnElement(withdrawBtn);
        log.info("clicking on : " + withdrawBtn.toString());

    }

    public String getTextTransaction() {

        String text = getTextFromElement(withdrawText);
        log.info("withdraw text : " + withdrawText.toString());
        return text;
    }
}
