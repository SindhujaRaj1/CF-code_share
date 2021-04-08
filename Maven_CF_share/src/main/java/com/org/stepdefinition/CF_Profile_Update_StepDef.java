package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.org.browser.Browser;
import com.org.locators.Profile_Update;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_Profile_Update_StepDef extends Browser{
	Profile_Update PU;
	@When("^Login  as \"([^\"]*)\" \"([^\"]*)\" and Click Profile and edit$")
	public void login_as_and_Click_Profile_and_edit(String uname, String pass) throws Throwable{
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    PU=new Profile_Update();
	    PU.setUname(uname);
	    PU.setPass(pass);
	    Click(PU.getSignin());
	    Click(PU.getMenu());
		   Click(PU.getProfile());
		   Click(PU.getEdit());
	}

	@When("^Enter Fname \"([^\"]*)\" Lname \"([^\"]*)\" mobile \"([^\"]*)\"$")
	public void enter_Fname_Lname_mobile(String f_name, String l_name, String mobile) throws Throwable {
	  
	 
	   Click(PU.getF_name());
	   Clear();

	   PU.setF_name(f_name);
	   Click(PU.getL_name());
       Clear();
	   PU.setL_name(l_name);
	   Click(PU.getMobile());
	   Clear();
	   PU.setMobile(mobile);
	   }

	@When("^Gender DoB \"([^\"]*)\" mail \"([^\"]*)\"$")
	public void gender_DoB_mail(String date, String email) throws Throwable {
		Click(PU.getDOB());
		Clear();
		PU.setDOB(date);
		Click(PU.getEmail());
		Clear();
		PU.setEmail(email);
		
	    
	}

	@Then("^Click update$")
	public void click_update() throws Throwable {
	    Click(PU.getUpdate());
	}


}
