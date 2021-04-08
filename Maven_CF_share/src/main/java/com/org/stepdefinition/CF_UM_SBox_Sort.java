package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.org.browser.Browser;
import com.org.locators.UM_SBox_Sort;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_UM_SBox_Sort extends Browser{
	
UM_SBox_Sort ss;
	@When("^Enter \"([^\"]*)\" in search box as match data$")
	public void enter_in_search_box_as_match_data(String match) throws Throwable {
	    ss=new UM_SBox_Sort();
	    Click(ss.getSigin());
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    Click(ss.getUsers());
	    ss.setSearch(match);
	    Click(ss.getSearch());
	}

	@When("^Enter \"([^\"]*)\" in search box as mis-match$")
	public void enter_in_search_box_as_mis_match(String mis_m) throws Throwable {
		 Actions a=new Actions(driver);
		   
		    a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		    a.keyDown(Keys.CONTROL).sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).build().perform();
		  ss.setSearch(mis_m);
		    Click(ss.getSearch());
	}

	@Then("^Check sort$")
	public void check_sort() throws Throwable {
		 Actions a=new Actions(driver);
		   
		    a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		    a.keyDown(Keys.CONTROL).sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).build().perform();
	       Thread.sleep(5000);
	       Click(ss.getUp_sort());
	
	}
}
