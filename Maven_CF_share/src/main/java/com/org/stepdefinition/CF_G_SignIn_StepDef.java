package com.org.stepdefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.browser.Browser;
import com.org.locators.G_SignIn;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_G_SignIn_StepDef extends Browser {
	G_SignIn G_SI;
	@When("^SignIn with Google \"([^\"]*)\" and \"([^\"]*)\"$")
	public void signin_with_Google_and(String email, String pass) throws Throwable {
	   G_SI=new G_SignIn();
	  Click(G_SI.getG_sIn());;
	   window(1);
	   G_SI.setR_g_address(email);
	   Click(G_SI.getR_g_next());
	  
	   for(int i=1;i<2;i++){
			try{
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(G_SI.getR_g_pass()));
	 G_SI.setR_g_pass(pass);
	   Click(G_SI.getR_g_next());}
			catch(Exception e){
				e.printStackTrace();
				}
			}
	}

	@Then("^Successfully signIn with google$")
	public void successfully_signIn_with_google() throws Throwable {
	    
	}


}
