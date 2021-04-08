package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.browser.Browser;
import com.org.locators.FB_SignUp_Wout_Email;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_FB_SignUp_WOE_StepDef extends Browser{
	FB_SignUp_Wout_Email fb_w_E;
	@When("^SignUP with Facebook not linked with email \"([^\"]*)\" and \"([^\"]*)\"$")
	public void signup_with_Facebook_not_linked_with_email_and(String num, String pass) throws Throwable {
	    fb_w_E=new FB_SignUp_Wout_Email();
	   Click(fb_w_E.getReg_but());
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   Click(fb_w_E.getReg_Fb());
	   window(1);
	   fb_w_E.setR_FB_email(num);
	   fb_w_E.setR_FB_pass(pass);
	   Click(fb_w_E.getR_FB_login());
	}

	@When("^Please register you email address \"([^\"]*)\"$")
	public void please_register_you_email_address(String email) throws Throwable {

		Thread.sleep(3000);
		window(0);
		Click(fb_w_E.getR_signin());
		Thread.sleep(1000);
		Click(fb_w_E.getReg_but());
		Thread.sleep(2000);
		fb_w_E.setR_email(email);
		Click(fb_w_E.getR_submit());
	    	}

	@Then("^Facebook signUp successfull$")
	public void facebook_signUp_successfull() throws Throwable {
	    System.out.println("Facebook signup without email id link done successfully");
	}



}
