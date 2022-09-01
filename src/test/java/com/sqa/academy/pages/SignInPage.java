package com.sqa.academy.pages;

import com.sqa.academy.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
   public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    public WebElement loginButtonSignInPage;

    public void logInWithCorrectCredentials(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButtonSignInPage.click();
    }




}
