package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.RM_CreateRole;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_RM_CreateRole_StepDef extends Browser{
	RM_CreateRole rm;
	@When("^Click Roles and try to add Role \"([^\"]*)\"$")
	public void click_Roles_and_try_to_add_Role(String Rname) throws Throwable {
	  rm=new RM_CreateRole();
		Click(rm.getSigin());
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Click(rm.getRoles());
		Click(rm.getR_add1());
		 rm.setR_name(Rname);
	}

	@When("^Select modules and click add$")
	public void select_modules_and_click_add() throws Throwable {
	   Click(rm.getCt_module());
	   Click(rm.getMb_module());
	   Click(rm.getR_add2());
	}

	@Then("^New Role Created successfully$")
	public void new_Role_Created_successfully() throws Throwable {
	    
	}


}
