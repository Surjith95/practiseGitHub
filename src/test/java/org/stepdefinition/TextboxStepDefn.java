package org.stepdefinition;

import java.io.IOException;

import org.basepackage.BaseClass;
import org.pagedefn.Textboxpageexecution;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TextboxStepDefn {

	@Given("Launch the url")
	public void launch_the_url() {
		BaseClass.launchBrowser();
		BaseClass.launchurl(BaseClass.getProperty("url"));
	}

	@When("Enter Full Name, Email and Current Address")
	public void enter_Full_Name_Email_and_Current_Address() {
		Textboxpageexecution.enterFullName();
		Textboxpageexecution.enterEmail();
		Textboxpageexecution.currentAdd();
	}

	@Then("click submit button")
	public void click_submit_button() {
		Textboxpageexecution.clickSubmitButton();
	}

}
