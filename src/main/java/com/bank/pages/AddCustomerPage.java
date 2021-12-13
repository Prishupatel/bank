package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @FindBy(xpath = "//form[@name='myForm']//button[contains(text(),'Add Customer')]")
    WebElement addCustomerBt;

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("enter first name: " + firstNameField.toString());

    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        log.info("enter last name : " + lastNameField.toString());
    }

    public void enterPostCode(String postcode) {
        sendTextToElement(postCodeField, postcode);
        log.info("enter postal code : " + postCodeField.toString());

    }

    public void clickOnAddCustomerBt() {

        clickOnElement(addCustomerBt);
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Customer added successfully "));
        alert.accept();
        log.info("clicking on : " + addCustomerBt.toString());
    }

}
