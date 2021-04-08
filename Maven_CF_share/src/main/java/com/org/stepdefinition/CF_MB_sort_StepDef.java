package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.MB_Sort;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_MB_sort_StepDef extends Browser{
	MB_Sort MB_S;
	@When("^Login as \"([^\"]*)\" \"([^\"]*)\" and click moodboard left menu$")
	public void login_as_and_click_moodboard_left_menu(String uname, String pass) throws Throwable {
	    MB_S=new MB_Sort();
	    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    MB_S.setUname(uname);
	    MB_S.setPass(pass);
	    Click(MB_S.loginbut);
	    Click(MB_S.getMoodboard());
	}

	@When("^sort by \"([^\"]*)\" then by \"([^\"]*)\" and finally by \"([^\"]*)\"$")
	public void sort_by_then_by_and_finally_by(String Recent, String Alphabet, String Popular) throws Throwable {
	    Click(MB_S.getMoodboard());
	    dropdown(MB_S.getSort(),Alphabet);
	    Thread.sleep(8000);
	    dropdown(MB_S.getSort(),Recent);
	    Thread.sleep(8000);
	    dropdown(MB_S.getSort(),Popular);
	    Thread.sleep(8000);
	}

	@Then("^sorting done and driver closed$")
	public void sorting_done_and_driver_closed() throws Throwable {
	    System.out.println("Sorted successfully");
	    driver.close();
	}


}
