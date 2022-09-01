package com.sqa.academy.stepsDefinitions;

import com.sqa.academy.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setUp(){
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tareDown(){
        driver.quit();
        driver=null;
        Driver.close();
    }
}