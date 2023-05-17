package org.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sindhuja\\OneDrive\\Documents\\Projects\\Demo\\src\\test\\java\\Feature File\\DemoQA.feature",
				 glue= "org.stepdefinition",
				 monochrome = true,
				 plugin = {"html: Name/reports", "json: json/reports.json"})

public class RunnerClass {

}
