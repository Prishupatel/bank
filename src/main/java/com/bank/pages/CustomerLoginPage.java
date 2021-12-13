package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourName;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement loginBtn;

    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameLabel;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOut;

    public void selectYourName(String yName) {
        selectByVisibleTextFromDropDown(yourName, yName);
        log.info("select your name: " + yourName.toString());
    }

    public void clickLoginButton() {
        clickOnElement(loginBtn);
        log.info("clicking on : " + loginBtn.toString());
    }

    public void clickOnLogout() {
        clickOnElement(logOut);
        log.info("clicking on : " + logOut.toString());
    }
}
