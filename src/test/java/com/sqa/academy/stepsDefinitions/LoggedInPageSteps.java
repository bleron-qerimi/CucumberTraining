package com.sqa.academy.stepsDefinitions;

import com.sqa.academy.pages.LoggedInPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static com.sqa.academy.stepsDefinitions.Hooks.driver;

public class LoggedInPageSteps {

    LoggedInPage loggedInPage = new LoggedInPage(driver);
    //comment
    @Then("the user should be able to log in" )
    public void the_user_should_be_able_to_log_in() {
        Assert.assertEquals(loggedInPage.getWelcomeText(),"Welcome John!");
        // + username + "!");
    }

    public void message(){
        System.out.println("Hello world");
    }
}
