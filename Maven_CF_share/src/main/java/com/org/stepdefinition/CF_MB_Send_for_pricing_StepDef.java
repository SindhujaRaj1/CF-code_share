package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.org.browser.Browser;
import com.org.locators.MB_Send_for_Pricing;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_MB_Send_for_pricing_StepDef extends Browser {
 MB_Send_for_Pricing SP;
@When("^login as design head  with following credential \"([^\"]*)\" and \"([^\"]*)\"$")
public void login_as_design_head_with_following_credential_and(String dh_name, String dh_pass) throws Throwable {
    SP=new MB_Send_for_Pricing();
    SP.setDH_Uname(dh_name);
    SP.setDH_Pass(dh_pass);
    Click(SP.getButt());
    
    
}

@When("^Click in app notification and approve it$")
public void click_in_app_notification_and_approve_it() throws Throwable {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Click(SP.getNotfication_bell());
    Click(SP.getNotfication_click());
    Click(SP.getApprove_but());
    Click(SP.getYes_publish());
    
  
}

@Then("^send to merchandiser \"([^\"]*)\"$")
public void send_to_merchandiser(String arg1) throws Throwable {
	  Click(SP.getMerch_click());
	  scroll(SP.getMerchandiser());
	    Click(SP.getMerchandiser());
	    Click(SP.getPublish());
}

}
