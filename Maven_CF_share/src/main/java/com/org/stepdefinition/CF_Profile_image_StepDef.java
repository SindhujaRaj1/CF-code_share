package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.Profile_image_update;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_Profile_image_StepDef extends Browser{
	Profile_image_update PIU;

	@When("^Login  as \"([^\"]*)\" \"([^\"]*)\" and Click Profile and edit profile$")
	public void login_as_and_Click_Profile_and_edit_profile(String uname, String pass) throws Throwable {
		PIU=new Profile_image_update();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    PIU.setUname(uname);
	    PIU.setPass(pass);
	    Click(PIU.getSignin());
	    Click(PIU.getMenu());
	    Click(PIU.getProfile());
	    Click(PIU.getEdit());
	}
	@Then("^Upload image and click update$")
	public void upload_image_and_click_update() throws Throwable {
		//Click(PIU.getImage());
		String img="C://Users//HP//Desktop//Image//Red_velvet.jpg";
		PIU.setImage(img);
		Click(PIU.getUpdate());
	}


}
