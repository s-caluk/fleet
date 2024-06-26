package com.trycloud.pages;


import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;


    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
       // BrowserUtils.sleep(5);
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
