package com.org.stepdefinition;

import com.org.browser.Browser;
import com.org.locators.MB_Mywork_RecentUpload;

import cucumber.api.java.en.When;

public class CF_MB_Mywork_RecentUpload_StepDef extends Browser{
	MB_Mywork_RecentUpload obj;
	@When("^Click recently uploaded topic,then navigate back$")
	public void click_recently_uploaded_topic_then_navigate_back() throws Throwable {
	   obj=new MB_Mywork_RecentUpload();
	   Click(obj.getRecent());
	   Click(obj.getBack());
	   Thread.sleep(5000);
	}

	@When("^Click My work style ,then navigate back$")
	public void click_My_work_style_then_navigate_back() throws Throwable {
		 Click(obj.getMywork());
		   Click(obj.getBack());
	}


}
