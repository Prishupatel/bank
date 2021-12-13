package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLogin;

    @FindBy(xpath ="//button[contains(text(),'Customer Login')]" )
    WebElement customerLogin;

    public  void clickOnManagerLoginLink(){
        clickOnElement(managerLogin);
        log.info("clicking on : " + managerLogin.toString());
    }
    public void clickOnCustomerLoginLink(){
        clickOnElement(customerLogin);
        log.info("clicking on : " + customerLogin.toString());
    }

}
