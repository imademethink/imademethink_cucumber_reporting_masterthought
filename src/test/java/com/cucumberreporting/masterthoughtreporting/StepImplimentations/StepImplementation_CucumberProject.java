package com.cucumberreporting.masterthoughtreporting.StepImplimentations;

import org.junit.Assert;

public class StepImplementation_CucumberProject {

	public StepImplementation_CucumberProject() {}
	
	public void web_application_is_in_running_state() {
		System.out.println("Log::  web_application_is_in_running_state");
	}

	public void web_browser_is_launched() {
		System.out.println("Log::  web_browser_is_launched");
	}

	public void home_page_is_launched() {
		System.out.println("Log::  home_page_is_launched");
	}

	public void click_on_login() {
		System.out.println("Log::  click_on_login");
	}

	public void following_fields_should_be_shown_username_and_password() {
		System.out.println("Log::  following_fields_should_be_shown_username_and_password");
	}

	public void valid_user_name_and_password_is_used() {
		System.out.println("Log::  valid_user_name_and_password_is_used");
	}

	public void login_should_be_successful() {
		System.out.println("Log::  login_should_be_successful");
	}

	public void register_option_should_not_be_visible() {
		System.out.println("Log::  register_option_should_not_be_visible");
	}

	public void user_is_already_logged_in() {
		System.out.println("Log::  user_is_already_logged_in");
	}

	public void when_user_edits_address() {
		System.out.println("Log::  when_user_edits_address");
	}

	public void editing_address_should_be_possible() {
		System.out.println("Log::  editing_address_should_be_possible");
	}

	public void user_clicks_on_logout_button() {
		System.out.println("Log::  user_clicks_on_logout_button");
	}

	public void user_log_out_should_be_successful() {
		System.out.println("Log::  user_log_out_should_be_successful");
	}

	public void cookies_should_not_be_deleted() {
		Assert.fail("Log::  ********** cookies_getting_deleted_due_to_some_isses");
	}

	public void user_launches_following_browser(String browserName) {
		System.out.println("Log::  user_launches_following_browser " + browserName);
	}

	public void user_verifies_home_page_title() {
		System.out.println("Log::  user_verifies_home_page_title");
	}

	public void home_page_title_validation_should_be_successful() {
		System.out.println("Log::  home_page_title_validation_should_be_successful");		
	}

	
}


// 		System.out.println("Log::  ");
