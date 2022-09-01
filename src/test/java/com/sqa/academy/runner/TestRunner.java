package com.sqa.academy.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.sqa.academy.stepsDefinitions",
        dryRun = false,
        tags = "@Test_SDETA-139"
)

public class TestRunner extends AbstractTestNGCucumberTests {




}
