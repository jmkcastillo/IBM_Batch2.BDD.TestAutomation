
package com.qa.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\P102GJPH1\\eclipse-workspace\\IBM_Batch2.BDD.TestAutomation\\src\\test\\java\\com\\qa\\feature\\GoogleFeature.feature"},
        glue = {"com.qa.stepdef"},
        monochrome=true,
        plugin = {"json:target/cucumber.json"},
        publish=true
        
		)
public class TestRunners {
}
