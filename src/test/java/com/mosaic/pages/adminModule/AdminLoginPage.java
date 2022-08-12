package com.mosaic.pages.adminModule;

import com.mosaic.util.Elements;
import com.mosaic.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends TestBase {

    //Define Elements
    @FindBy(xpath = Elements.btnSignIn)
    private WebElement btnSignIn;

    @FindBy(xpath = Elements.txtUserEmail)
    private WebElement txtUserEmail;

    @FindBy(xpath = Elements.txtPassword)
    private WebElement txtPassword;

    @FindBy(xpath = Elements.btnLogin)
    private WebElement btnLogin;
    @FindBy(xpath = Elements.txtLoginMessage)
    private WebElement txtLoginMessage;
    public void enterAdminUserName(){
        clearAndType(txtUserEmail,  properties.getProperty("merchantAdminUserName"));
    }
    public void enterAdminPassword(){
        clearAndType(txtPassword, properties.getProperty("merchantAdminpassword"));
    }
    public void clickSignIn(){
        waitUntilVisibilityOfElement(By.xpath(Elements.btnLogin));
        clickOnElement(btnSignIn);
    }

    public void clickLogin(){
        clickOnElement(btnLogin);
    }
    public String getLoginMessage(){
        waitUntilVisibilityOfElement(By.xpath(Elements.txtLoginMessage));
      return   getElementText(txtLoginMessage);
    }





}
