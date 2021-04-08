package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.FB_SignUp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_FB_SignUp_StepDef extends Browser {
	FB_SignUp fb_m;
	@When("^SignUP with Facebook \"([^\"]*)\" and \"([^\"]*)\"$")
	public void signup_with_Facebook_and(String email, String pass) throws Throwable {
	    fb_m=new FB_SignUp();
	    Click(fb_m.getReg_but());
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    Click(fb_m.getReg_Fb());
	    window(1);
	    fb_m.setR_FB_email(email);
	    fb_m.setR_FB_pass(pass);
	    Click(fb_m.getR_FB_login());
	    Click(fb_m.getR_FB_conf());
	}
	

	@Then("^Successfully registered$")
	public void successfully_registered() throws Throwable {
	    System.out.println("Successfully signUp");
	}


}
