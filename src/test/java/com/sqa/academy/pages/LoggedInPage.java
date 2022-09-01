package com.sqa.academy.pages;

import com.sqa.academy.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedInPage {

    public LoggedInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "WelcomeContent")
    public WebElement welcomeTextElement;

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }
}
