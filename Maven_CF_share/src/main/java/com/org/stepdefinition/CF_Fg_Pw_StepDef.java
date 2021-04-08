package com.org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.browser.Browser;
import com.org.locators.Forgot_Password;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_Fg_Pw_StepDef extends Browser{
	Forgot_Password fp;
	@When("^Click on Forgot password$")
	public void click_on_Forgot_password() throws Throwable {
	   fp=new Forgot_Password();
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   Click(fp.getFg_pass());
	}

	@When("^Enter the Email address \"([^\"]*)\" and click send$")
	public void enter_the_Email_address_and_click_send(String email) throws Throwable {
	    fp.setFg_email(email);
	    Click(fp.getFg_submit());
	}

	@When("^Navigate to respective mail account \"([^\"]*)\" and \"([^\"]*)\"$")
	public void navigate_to_respective_mail_account_and(String email, String pass) throws Throwable {
	
		driver.navigate().to("https://accounts.google.com/login/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		fp.setG_uname(email);
		Click(fp.getG_next());
		
		
		for(int i=1;i<2;i++){
			try{
	
	WebDriverWait wait=new WebDriverWait(driver,50);
	wait.until(ExpectedConditions.visibilityOf(fp.getG_pass()));
	fp.setG_pass(pass);
	Click(fp.getG_next());
		}
			catch(Exception e){
				e.printStackTrace();
			}}
	List<WebElement> frame=	driver.findElements(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/div[2]/iframe[1]"));
		 System.out.println(frame.size());
		for(int i=0;i<frame.size();i++){
			driver.switchTo().frame(i);
			Click(fp.getG_Gmail());
		}
		window(1);
		for(int i=0;i<=1;i++){
			try{
		Click(fp.getG_Mail());}
			catch(Exception e)
			{e.printStackTrace();
			}}
			}

	@Then("^Click set password link received in mail$")
	public void click_set_password_link_received_in_mail() throws Throwable {
	   Click(fp.getG_set_pass());
	}

	@Then("^Enter password \"([^\"]*)\" and click submit$")
	public void enter_password_and_click_submit(String pass) throws Throwable {
		window(2);
	    fp.setF_pass(pass);
	    fp.setF_Con_pass(pass);
	    Click(fp.getF_submit());
	}

	@Then("^Click on SignIn$")
	public void click_on_SignIn() throws Throwable {
	    Click(fp.getF_signin());
	}

}
