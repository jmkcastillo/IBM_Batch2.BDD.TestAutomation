package com.qa.testrunners;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\P102GJPH1\\eclipse-workspace\\IBM_Batch2.BDD.TestAutomation\\src\\test\\java\\com\\qa\\feature\\GoogleFeature.feature",
		glue="com.qa.stepdef",
		dryRun=false,
		monochrome=true,
		
		 plugin= {"pretty","json:target/MyReports/report.json",
	                "json:target/cucumber.json",
	        "junit:target/MyReports/report.xml"},
	        publish=true
	        )
	public class TestRunner extends AbstractTestNGCucumberTests {
	    @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
		
}



