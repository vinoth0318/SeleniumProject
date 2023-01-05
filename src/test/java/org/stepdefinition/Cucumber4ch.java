package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.RedbusPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber4ch extends BaseClass {

	RedbusPojo l ;
	
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of redbus")
	public void to_launch_the_url_of_redbus() {
	    launchUrl("https://www.redbus.in/");
	}

	@When("To click the login logo")
	public void to_click_the_login_logo() {
	    l = new RedbusPojo();
	    clickBtn(l.getClkLoginlogo());
	}

	@When("To click the signin option")
	public void to_click_the_signin_option() {
		 l = new RedbusPojo();
		 clickBtn(l.getClkSignin());
	}

	@When("To enter the mobileno")
	public void to_enter_the_mobileno() throws InterruptedException {
		 l = new RedbusPojo();
		 Thread.sleep(3000);
		 passText("9088776655", l.getEnterMobileno());
	}

	@When("To click the signin option")
	public void to_click_the_signin_option1() {
		 l = new RedbusPojo();
		 clickBtn(l.getClkSignin());
	}

	@When("To click the facebook option")
	public void to_click_the_facebook_option() {
		 l = new RedbusPojo();
		 clickBtn(l.getConnectFacebook());
	}

	@When("To pass the email in {string} email field")
	public void to_pass_the_email_in_email_field(String email) {
		 l = new RedbusPojo();
		 passText(email, l.getEmail());
	}

	@When("To pass the password in {string} password field")
	public void to_pass_the_password_in_password_field(String password) {
		 l = new RedbusPojo();
		 passText(password, l.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		 l = new RedbusPojo();
		 clickBtn(l.getLogin());
	}

	@Then("To close to the browser")
	public void to_close_to_the_browser() {
	    
	}


}
