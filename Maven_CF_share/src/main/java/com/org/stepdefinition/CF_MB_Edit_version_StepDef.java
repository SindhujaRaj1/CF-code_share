package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.MB_EditVersion;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_MB_Edit_version_StepDef extends Browser{
	MB_EditVersion EV;
	@When("^Click style, edit description as \"([^\"]*)\" and edit this topic$")
	public void click_style_edit_description_as_and_edit_this_topic(String des) throws Throwable {
		EV=new MB_EditVersion();
		jclick(EV.getEtopic());
		jclick(EV.getThree_dot());
		jclick(EV.getEdit());
		jclick(EV.getEdescription());
		Clear();
		Act_send(des);
		Click(EV.getEnext());
		jclick(EV.getImg_remove());
		jclick(EV.getDesign_remove());
		EV.setEimage("C:/Users/HP/Desktop/Shirts/M_b1.jpg");
		EV.setEimage("C:/Users/HP/Desktop/Shirts/M_s1.jpg");
		EV.setEd_file("C:/Users/HP/Desktop/Design_format/obj/LowPolyWolf.obj");
		Click(EV.getEnext2());
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
	    
	}

	@Then("^Add new people to the topic$")
	public void add_new_people_to_the_topic() throws Throwable {
	    Click(EV.geteDone());
	}
}
