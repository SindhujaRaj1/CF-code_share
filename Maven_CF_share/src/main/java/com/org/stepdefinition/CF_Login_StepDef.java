package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.Login;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_Login_StepDef extends Browser{
	Browser b;
	Login lg;
	@When("^Login as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_as_and(String Uname, String Pass) throws Throwable {
	   lg=new Login();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   lg.setL_Uname(Uname);
	   lg.setL_Pass(Pass);
	}

	@When("^Click SignIn$")
	public void click_Login() throws Throwable {
	Click(lg.getL_butt());
	}

	@Then("^Customer Priyanka Logged in successfully$")
	public void customer_Priyanka_Logged_in_successfully() throws Throwable {
	   System.out.println("Customer Logged in successfully");
	}


}
