package com.org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.browser.Browser;
import com.org.locators.Registration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_Reg_StepDef extends Browser {
	static Browser b;
 Registration reg;
	
	@Given("^Launch browser and navigate to url$")
	public void launch_browser_and_navigate_to_url() throws Throwable {
	   browser("Chrome", "https://qa.projects-cf.cloudnowtech.com/#/signIn");
	}

	@When("^Register new Customer \"([^\"]*)\" and \"([^\"]*)\"$")
	public void register_new_valid_Customer_and(String Uname, String Email) throws Throwable {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reg=new Registration();
			  Click(reg.getReg_but());
			  reg.setReg_uname(Uname);
			  reg.setReg_email(Email);
			  Click(reg.getReg_submit());
			  Thread.sleep(2000);
		
	
	}

	@When("^Set password using the link received in Email \"([^\"]*)\" and \"([^\"]*)\"$")
	public void set_password_using_the_link_received_in_Email_and(String arg1, String arg2) throws Throwable  {
		driver.navigate().to("https://accounts.google.com/login/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		Click(reg.getG_acc());
		reg.setG_uname(arg1);
		Click(reg.getG_next());
		
		
		for(int i=1;i<2;i++){
			try{
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(reg.getG_pass()));
	reg.setG_pass(arg2);
	Click(reg.getG_next());
		}
			catch(Exception e){
				e.printStackTrace();
			}}
	List<WebElement> frame=	driver.findElements(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[3]/div[2]/iframe[1]"));
		 System.out.println(frame.size());
		for(int i=0;i<frame.size();i++){
			driver.switchTo().frame(i);
			Click(reg.getR_Gmail());
		}
		window(1);
		Click(reg.getR_Mail());
		Click(reg.getSet_password());
		window(2);
		reg.setNew_pass("Rakshi@123");
		reg.setConf_pass("Rakshi@123");
		Click(reg.getNewp_sub());
	}
	

	@Then("^Customer Registered successful$")
	public void customer_Registered_successful() throws Throwable {
	    System.out.println("Customer Registered and set password Successfully");
	}


}
