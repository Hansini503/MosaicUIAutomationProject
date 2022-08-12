package com.mosaic.util;

public class Elements {
    //Admin Login Page
    public static final String btnSignIn = "//*[@id=\"__next\"]/header/div/div[2]/button";
    public static final String txtUserEmail = "//*[@id=\"mui-1\"]";
    public static final String txtPassword = "//*[@id=\"mui-2\"]";
    public static final String btnLogin = "/html/body/div[2]/div[3]/div[3]/form/div[2]/button";

    public static final String txtLoginMessage = "//*[@id=\"__next\"]/header/div/div[3]/div[1]/p";
    // Admin Menu Elements
    public static final String btnMenu ="//*[@id=\"__next\"]/header/div/div[1]/button/span[1]/img";

    public static final String btnOffers ="//*[@id=\"__next\"]/div/div[1]/div/div/ul/a[2]/div/div[2]/p";

    public static final String btnCreateOffer="//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/div[2]/button/span[2]";
    public static final String btnDropDownStoreLocation="//*[@id=\"mui-component-select-storeList\"]";
    public static final String checkBoxAllStore="//*[@id=\"menu-storeList\"]/div[3]/ul/li[1]/span[1]/input";

    public static final String lblStoreLocation ="//*[@id=\"menu-storeList\"]/div[3]";

    public static final String txtOfferName="//input[@name='name']";

    public static final String txtPromoCode="//input[@name='promoCode']";

    public static final String txtStartDate="//input[@name='startDate']";

    public static final String txtEndDate="//input[@name='endDate']";

    public static final String btnDropDownOfferTypeGroup = "//*[@id='mui-component-select-offerGroup']";

    public static final String lblSelectDiscountOffer = "//*[@id='menu-offerGroup']/div[3]/ul/li[1]";
    public static final String lblSelectDateTimeOffer = "//*[@id='menu-offerGroup']/div[3]/ul/li[2]";

    public static final String btnDropDownOfferType = "//*[@id='mui-component-select-offerType']";

    public static final String lblSelectSignUpOffer ="//*[@id='menu-offerType']/div[3]/ul/li[1]";

    public static final String lblSelectBirthDayOffer ="//*[@id='menu-offerType']/div[3]/ul/li[2]";

    public static final String txtOfferExpiredate ="//*[@value='30']";

    public static final String radioBtnDiscount ="//input[@value='PERCENTAGE']";
    public static final String radioButtonFixedAmount= "//input[@value='FIXED AMOUNT']";

    public static final String txtDiscountAmountSignUp ="//input[@name='inputParamList.2.value']";

    public static final String txtMinimumOrderAmountSignUp ="//input[@name='inputParamList.3.value']";

    public static final String txtDiscountAmount ="//input[@name='inputParamList.1.value']";
    public static final String txtMinimumOrderAmount ="//input[@name='inputParamList.2.value']";

    public static final String btnSaveOffer="//button[@type='submit']";


}
