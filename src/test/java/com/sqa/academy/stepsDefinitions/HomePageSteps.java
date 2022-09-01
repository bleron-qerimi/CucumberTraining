package com.sqa.academy.stepsDefinitions;


import com.sqa.academy.pages.HomePage;
import com.sqa.academy.utils.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

import static com.sqa.academy.stepsDefinitions.Hooks.driver;

public class HomePageSteps {

    HomePage homePage = new HomePage(driver);

    @Given("the user in on the home page")
    public void user_is_in_Home_Page() {
        driver.get(ConfigurationReader.get("url"));
        Assert.assertTrue(homePage.logInButtonHomePage.isDisplayed());
        System.out.println();
    }

    @And("on the nav bar clicks the LogIn button")
    public void clicks_signIn_button_in_homePage() {
        homePage.logInButtonHomePage.click();
    }

}
