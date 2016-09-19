package com.cucumber.StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = "src/test/java/com/cucumber/features",
		glue = "com.cucumber.StepDefinitions",
		tags = { "@dummy" },
		dryRun = false,
		strict = true,
		monochrome=true,
		plugin = { "pretty",
				"html:target/cucumber_dummy.html"
				}
		)
public class DummyTest {

}
