package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.Inv_Reg;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_Inv_Reg_StepDef extends Browser {
	Inv_Reg ir;
	@When("^Enter\"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String uname, String email) throws Throwable {
	    ir=new Inv_Reg();
	    Click(ir.getReg_but());
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    ir.setReg_uname(uname);
	    ir.setReg_email(email);
	}

	@Then("^Click on Register$")
	public void click_on_Register() throws Throwable {
	    Click(ir.getReg_submit());
	}


}
