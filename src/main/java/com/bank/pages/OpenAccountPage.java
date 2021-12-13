package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() { PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerName;

    @FindBy(id = "currency")
    WebElement currency;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcess;

    public void selectCustomerName(String cName){
        selectByVisibleTextFromDropDown(customerName,cName);
        log.info("selecting customer name : " + customerName.toString());

    }

    public void selectCurrency(String currncy){
        selectByVisibleTextFromDropDown(currency,currncy);
        log.info("selecting currency: " + currency.toString());
    }

    public void clickOnProcessButton(){
        clickOnElement(clickOnProcess);
        System.out.println(getTextFromAlert());
        acceptAlert();
        log.info("clicking on : " +clickOnProcess.toString());
    }
}
