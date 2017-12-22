package com.cucumberreporting.masterthoughtreporting.StepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllStepDefinition{

	
	@Given("^Module1 environment setup$")
	public void module1_environment_setup() {
	    System.out.println("Step--  module1_environment_setup");
	}
	
	@Given("^M1U1TC1 User navigates to home screen$")
	public void M1U1TC1_User_navigates_to_home_screen() {
	    System.out.println("Step--  M1U1TC1_User_navigates_to_home_screen");
	}
	
	@When("^M1U1TC1 User initiates login with following credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void M1U1TC1_User_initiates_login_with_following_credentials_and(String userName, String password) {
	    System.out.println("Step--  M1U1TC1_User_initiates_login_with_following_credentials_and");
	}
	
	@Then("^M1U1TC1 Login validation should be successful$")
	public void M1U1TC1_Login_validation_should_be_successful() {
	    System.out.println("Step--  M1U1TC1_Login_validation_should_be_successful");
	}
	
	@Given("^M1U1TC2 Dummy step$")
	public void M1U1TC2_Dummy_step() {
	    System.out.println("Step--  M1U1TC2_Dummy_step");
	}
	
	@Given("^M1U1TC3 Dummy step$")
	public void M1U1TC3_Dummy_step() {
	    System.out.println("Step--  M1U1TC3_Dummy_step");
	}

	@Given("^M1U2TC1 Dummy step$")
	public void M1U2TC1_Dummy_step() {
	    System.out.println("Step--  M1U2TC1_Dummy_step");
	}

	@Given("^M1U2TC2 Dummy step$")
	public void M1U2TC2_Dummy_step() {
	    System.out.println("Step--  M1U2TC2_Dummy_step");
	}

	@Given("^M2U1TC1 Dummy step$")
	public void M2U1TC1_Dummy_step() {
	    System.out.println("Step--  M2U1TC1_Dummy_step");
	    Assert.fail();
	}
	
	@Given("^M2U1TC2 Dummy step$")
	public void M2U1TC2_Dummy_step() {
	    System.out.println("Step--  M2U1TC2_Dummy_step");
	}
	
	@Given("^M2U2TC1 Dummy step$")
	public void M2U2TC1_Dummy_step() {
	    System.out.println("Step--  M2U2TC1_Dummy_step");
	}
	
	@Given("^M2U2TC2 Dummy step$")
	public void M2U2TC2_Dummy_step() {
	    System.out.println("Step--  M2U2TC2_Dummy_step");
	}
	
	@Given("^M3U1TC1 Dummy step$")
	public void M3U1TC1_Dummy_step() {
	    System.out.println("Step--  M3U1TC1_Dummy_step");
	}
	
	@Given("^M3U1TC2 Dummy step$")
	public void M3U1TC2_Dummy_step() {
	    System.out.println("Step--  M3U1TC2_Dummy_step");
	    Assert.fail();
	}

	@Given("^M3U2TC1 Dummy step$")
	public void M3U2TC1_Dummy_step() {
	    System.out.println("Step--  M3U2TC1_Dummy_step");
	}
	
	@Given("^M3U2TC2 Dummy step$")
	public void M3U2TC2_Dummy_step() {
	    System.out.println("Step--  M3U2TC2_Dummy_step");
	}
	
	@Given("^M3U2TC3 Dummy step$")
	public void M3U2TC3_Dummy_step() {
	    System.out.println("Step--  M3U2TC3_Dummy_step");
	    Assert.fail();
	}
	
	
	
	
	
	
}
