package com.cucumberreporting.masterthoughtreporting.stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features 			= {"src/test/resources" }, 
		monochrome = true,
        plugin 				= {
                       				"pretty",
                       				"html:target/cucumber",
                       				"json:target/cucumber/cucumber.json",
								},
		tags 				= {"@all"},
        glue 				= {"com.cucumberreporting.masterthoughtreporting.StepDefinitions"}
)

public class CucumberTestRunnerMasterthoughtReporting {

} 
