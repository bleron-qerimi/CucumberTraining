package com.sqa.academy.stepsDefinitions;

import com.sqa.academy.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import static com.sqa.academy.stepsDefinitions.Hooks.driver;

public class LogInPageSteps {

    String username;
    SignInPage signInPage = new SignInPage(driver);

    @Given("the user should be displayed with a log in form")
    public void user_goes_to_signIn_page() {
        Assert.assertTrue(signInPage.loginButtonSignInPage.isDisplayed());
    }

    @And("if the user provides correct credentials {string} and  {string}")
    public void if_the_user_provides_correct_credentials(String username, String password) {
        signInPage.logInWithCorrectCredentials(username,password);
        this.username= username;
    }

}
