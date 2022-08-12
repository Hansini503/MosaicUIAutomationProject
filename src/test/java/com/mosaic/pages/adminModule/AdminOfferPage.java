package com.mosaic.pages.adminModule;

import com.mosaic.util.DomainConstants;
import com.mosaic.util.Elements;
import com.mosaic.util.TestBase;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminOfferPage extends TestBase {
    @FindBy(xpath = Elements.btnCreateOffer)
    private WebElement btnCreateOffer;
    @FindBy(xpath = Elements.btnDropDownStoreLocation)
    private WebElement btnDropDownStoreLocation;
    @FindBy(xpath = Elements.checkBoxAllStore)
    private WebElement checkBoxAllStore;

    @FindBy(xpath = Elements.lblStoreLocation)
    private WebElement lblStoreLocation;
    @FindBy(xpath = Elements.txtOfferName)
    private WebElement txtOfferName;
    @FindBy(xpath = Elements.txtPromoCode)
    private WebElement txtPromoCode;

    @FindBy(xpath = Elements.txtStartDate)
    private WebElement txtStartDate;

    @FindBy(xpath = Elements.txtEndDate)
    private WebElement txtEndDate;

    @FindBy(xpath = Elements.btnDropDownOfferTypeGroup)
    private WebElement btnDropDownOfferTypeGroup;

    @FindBy(xpath = Elements.lblSelectDiscountOffer)
    private WebElement lblSelectDiscountOffer;

    @FindBy(xpath = Elements.btnDropDownOfferType)
    private WebElement btnDropDownOfferType;

    @FindBy(xpath = Elements.lblSelectSignUpOffer)
    private WebElement lblSelectSignUpOffer;

    @FindBy(xpath = Elements.lblSelectBirthDayOffer)
    private WebElement lblSelectBirthDayOffer;

    @FindBy(xpath = Elements.txtOfferExpiredate)
    private WebElement txtOfferExpiredate;

    @FindBy(xpath = Elements.radioBtnDiscount)
    private WebElement radioBtnDiscount;

    @FindBy(xpath = Elements.radioButtonFixedAmount)
    private WebElement radioButtonFixedAmount;

    @FindBy(xpath = Elements.txtDiscountAmountSignUp)
    private WebElement txtDiscountAmountSignUp;

    @FindBy(xpath = Elements.txtMinimumOrderAmountSignUp)
    private WebElement txtMinimumOrderAmountSignUp;

    @FindBy(xpath = Elements.btnSaveOffer)
    private WebElement btnSaveOffer;

    @FindBy(xpath = Elements.lblSelectDateTimeOffer)
    private WebElement lblSelectDateTimeOffer;

    @FindBy(xpath = Elements.txtDiscountAmount)
    private WebElement txtDiscountAmount;

    @FindBy(xpath = Elements.txtMinimumOrderAmount)
    private WebElement txtMinimumOrderAmount;
    public void clickCreatebtnOffer(){
        waitUntilVisibilityOfElement(By.xpath(Elements.btnCreateOffer));
        clickOnElement(btnCreateOffer);
    }
    public void clickDropDownBtnStoreLocation(){
        waitUntilVisibilityOfElement(By.xpath(Elements.btnDropDownStoreLocation));
        clickOnElement(btnDropDownStoreLocation);
    }

    public void clickCheckBoxAllStoreLocation(){
        waitUntilVisibilityOfElement(By.xpath(Elements.checkBoxAllStore));
        clickOnElement(checkBoxAllStore);
    }
    public void moveToElement(){
        waitUntilVisibilityOfElement(By.xpath(Elements.checkBoxAllStore));
        clickOnElement(checkBoxAllStore);
    }

    public void clickPromoCode() {

        moveAndClick(txtPromoCode);
    }
    public void enterOfferName(String offerName) throws InterruptedException {
        moveAndClick(txtOfferName);
       // Thread.sleep(1000);
        txtOfferName.sendKeys(offerName);

    }
    public void enterStartDate(){
        clearAndType(txtStartDate, getTodaydate());
    }

    public void enterEndDate(){
        clearAndType(txtEndDate,"12/12/2022");
    }
    public void enterPromoCode() {
       // moveAndClick(txtPromoCode);
        clearAndType(txtPromoCode, DomainConstants.promoCode);
    }

    public void selectDiscountOfferType(){
        clickOnElement(btnDropDownOfferTypeGroup);
        clickOnElement(lblSelectDiscountOffer);

    }
    public void selectOfferType(){
        clickOnElement(btnDropDownOfferType);
        clickOnElement(lblSelectSignUpOffer);
    }

    public void selectBirthdayType(){
        clickOnElement(btnDropDownOfferType);
        clickOnElement(lblSelectBirthDayOffer);
    }
    public String getOfferExpireDays() throws InterruptedException {
        scrollDown();
        String expDays = getAttributeValue(txtOfferExpiredate);
        return expDays;
    }
    public void clickPercentageDiscount(){
        clickOnElement(radioBtnDiscount);
    }

    public void clickDollarDiscount(){
        clickOnElement(radioButtonFixedAmount);
    }

    public void enterDiscountAmount(){
        clearAndType(txtDiscountAmount,"10");
    }


    public void enterMinimumOrderAmount(){
        clearAndType(txtMinimumOrderAmount,"20");
    }

    public void enterDiscountAmountBDY_ORDER(){
        clearAndType(txtDiscountAmount,"10");
    }

    public void enterMinimumOrderAmountBDY_ORDER(){
        clearAndType(txtMinimumOrderAmount,"20");
    }
    public void saveOffer(){
        clickOnElement(btnSaveOffer);
    }


    public void selectnewoffertypegroup(String offerTypeGroup){
        clickOnElement(btnDropDownOfferTypeGroup);
        if(offerTypeGroup == "Discount"){
            clickOnElement(lblSelectDiscountOffer);
        }if(offerTypeGroup == "DateTime"){
            clickOnElement(lblSelectDateTimeOffer);
        }

 }

    public void selectnewoffertype(String offerType){
        clickOnElement(btnDropDownOfferType);
        if(offerType == "SignUp"){
            clickOnElement(lblSelectSignUpOffer);
        }if(offerType == "BirthDay"){
            clickOnElement(lblSelectBirthDayOffer);
        }

    }

    public void getUniqueOfferName(){
        clearAndType(txtOfferName,setUniqueOfferName());
    }

    public void getUniquePromoCode(){

        clearAndType(txtPromoCode,setUniquePromoCode());

    }



}


