package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.MB_Send_Approval;

import cucumber.api.java.en.When;

public class CF_MB_Send_Approval_StepDef extends Browser{
	MB_Send_Approval SA;
	@When("^Select particular style and Click send for approval$")
	public void select_particular_style_and_Click_send_for_approval() throws Throwable {
	    SA=new MB_Send_Approval();
	    Click(SA.getStyle());
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Click(SA.getThree_dot());
	    Click(SA.getSend_Approval());
	}

	@When("^Send to  design head \"([^\"]*)\"$")
	public void send_to_design_head(String designer) throws Throwable {
	   Click(SA.getD_click());
	   Click(SA.getDesigner());
	   Click(SA.getSend_bt());
	   
	}


}
