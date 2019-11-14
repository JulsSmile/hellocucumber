package com.epam;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources/features/",
        plugin = {"pretty", "json:target/cucumber.json"},
        glue = {"com.epam.test"}
)

public class RunCucumberTest{
}
