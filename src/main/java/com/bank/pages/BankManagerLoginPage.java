package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement addCustomerTab;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement openAccountTab;

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement customersTab;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeBtLink;

    public void clickOnAddCustomerTab(){

        clickOnElement(addCustomerTab);
        log.info("clicking on : " + addCustomerTab.toString());

    }
    public void clickOnOpenAccountTab(){
        clickOnElement(openAccountTab);
        log.info("clicking on : " + openAccountTab.toString());

    }
    public void clickOnCustomerTab(){
        clickOnElement(customersTab);
        log.info("clicking on : " + customersTab.toString());

    }
    public void clickOnHomeBt(){
        clickOnElement(homeBtLink);
        log.info("clicking on : " + homeBtLink.toString());

    }


}
