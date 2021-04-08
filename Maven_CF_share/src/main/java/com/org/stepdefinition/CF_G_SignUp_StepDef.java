package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.browser.Browser;
import com.org.locators.G_SignUP;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_G_SignUp_StepDef extends Browser{
	G_SignUP G_S;
	@When("^SignUP with google \"([^\"]*)\" and \"([^\"]*)\"$")
	public void signup_with_google_and(String email, String pass) throws Throwable {
		G_S=new G_SignUP();
	   Click(G_S.getReg_but());
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   Click(G_S.getR_google());
	   window(1);
	   G_S.setR_g_address(email);
	   Click(G_S.getR_g_next());
	  
	   for(int i=1;i<2;i++){
			try{
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(G_S.getR_g_pass()));
	 G_S.setR_g_pass(pass);
	   Click(G_S.getR_g_next());}
			catch(Exception e){
				e.printStackTrace();
				}
			}
		
	
	   }

	@Then("^Successfully registered with google$")
	public void successfully_registered_with_google() throws Throwable {
	    
	}



}
