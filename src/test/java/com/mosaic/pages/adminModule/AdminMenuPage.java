package com.mosaic.pages.adminModule;

import com.mosaic.util.Elements;
import com.mosaic.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminMenuPage extends TestBase {
    //Define Elements
    @FindBy(xpath = Elements.btnMenu)
    private WebElement btnMenu;
    @FindBy(xpath = Elements.btnOffers)
    private WebElement btnOffers;

    @FindBy(xpath = Elements.btnCreateOffer)
    private WebElement btnCreateOffer;

    public void clickMenu(){
        waitUntilVisibilityOfElement(By.xpath(Elements.btnMenu));
        clickOnElement(btnMenu);
    }
    public void clickbtnOffer(){
        waitUntilVisibilityOfElement(By.xpath(Elements.btnOffers));
        clickOnElement(btnOffers);
    }
    public String getTextBtnOffer(){
        waitUntilVisibilityOfElement(By.xpath(Elements.btnCreateOffer));
      return   getElementText(btnCreateOffer);
    }

}
