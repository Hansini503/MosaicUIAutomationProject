package com.mosaic.test;

import com.mosaic.pages.adminModule.AdminMenuPage;
import com.mosaic.pages.adminModule.AdminOfferPage;
import com.mosaic.util.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminOfferTest extends TestBase {
    @BeforeClass
    public void loginAdminUser() throws InterruptedException {
        userLogin();
    }

    @Test
    public void verifyCreateSignUpOfferWithValideData() throws InterruptedException {
        AdminMenuPage adminMenuPage = PageFactory.initElements(driver, AdminMenuPage.class);
        adminMenuPage.clickMenu();
        adminMenuPage.clickbtnOffer();
        adminMenuPage.getTextBtnOffer();
        AdminOfferPage adminOfferPage = PageFactory.initElements(driver, AdminOfferPage.class);
        adminOfferPage.clickCreatebtnOffer();
        adminOfferPage.clickDropDownBtnStoreLocation();
        adminOfferPage.clickCheckBoxAllStoreLocation();
        Thread.sleep(2000);
        adminOfferPage.clickPromoCode();
        Thread.sleep(2000);
        //adminOfferPage.enterOfferName("AutomationSignUpOffer01");
        adminOfferPage.getUniqueOfferName();
        adminOfferPage.enterStartDate();
        adminOfferPage.enterEndDate();
        adminOfferPage.getUniquePromoCode();
        adminOfferPage.selectnewoffertypegroup("Discount");
        adminOfferPage.selectnewoffertype("SignUp");
        Thread.sleep(2000);
        Assert.assertEquals(adminOfferPage.getOfferExpireDays(), "30");
        adminOfferPage.clickPercentageDiscount();
        adminOfferPage.enterDiscountAmount();
        adminOfferPage.enterMinimumOrderAmount();
        adminOfferPage.saveOffer();

    }

    @Test
    public void verifyCreateBirthdayWithValidData() throws InterruptedException {
        AdminMenuPage adminMenuPage = PageFactory.initElements(driver, AdminMenuPage.class);
        adminMenuPage.clickMenu();
        adminMenuPage.clickbtnOffer();
        adminMenuPage.getTextBtnOffer();
        AdminOfferPage adminOfferPage = PageFactory.initElements(driver, AdminOfferPage.class);
        adminOfferPage.clickCreatebtnOffer();
        adminOfferPage.clickDropDownBtnStoreLocation();
        adminOfferPage.clickCheckBoxAllStoreLocation();
        Thread.sleep(2000);
        adminOfferPage.clickPromoCode();
        Thread.sleep(2000);
        //adminOfferPage.enterOfferName("AutomationBirthdayOffer03");
        adminOfferPage.getUniqueOfferName();
        adminOfferPage.enterStartDate();
        adminOfferPage.enterEndDate();
       // adminOfferPage.enterPromoCode();
        adminOfferPage.getUniquePromoCode();
        adminOfferPage.selectnewoffertypegroup("Discount");
        adminOfferPage.selectnewoffertype("BirthDay");
        Thread.sleep(2000);
        adminOfferPage.clickPercentageDiscount();
        adminOfferPage.enterDiscountAmountBDY_ORDER();
        adminOfferPage.enterMinimumOrderAmountBDY_ORDER();
        adminOfferPage.saveOffer();
    }
}
