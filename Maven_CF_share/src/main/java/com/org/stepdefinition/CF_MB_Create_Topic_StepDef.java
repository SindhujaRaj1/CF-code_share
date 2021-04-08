package com.org.stepdefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.browser.Browser;
import com.org.locators.MB_Create_Topic;

import cucumber.api.java.en.When;

public class CF_MB_Create_Topic_StepDef extends Browser {
	MB_Create_Topic CTopic;
	@When("^Click create topic in moodboard$")
	public void click_create_topic_in_moodboard() throws Throwable {
		CTopic=new MB_Create_Topic();
		jclick(CTopic.getC_Topic());
			}
	

	@When("^Enter topic as \"([^\"]*)\" with description \"([^\"]*)\"$")
	public void enter_topic_as_with_description(String topic, String Descrip) throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		CTopic.setTopic(topic);
	    CTopic.setDescription(Descrip);
	    jclick(CTopic.getNext());
	    
	}

	@When("^click next and attach image and design file$")
	public void click_next_and_attach_image_and_design_file() throws Throwable {
	    CTopic.setBanner("C:/Users/HP/Desktop/Shirts/TMB_4f.jpeg");
	    CTopic.setImage("C:/Users/HP/Desktop/Shirts/TMB_4f.jpeg");
	    CTopic.setImage("C:/Users/HP/Desktop/Shirts/TMB_4b.jpeg");
	    CTopic.setD_file("C:/Users/HP/Desktop/Design_format/obj/LowPolyWolf.obj");
	    jclick(CTopic.getNext2());
	}

	@When("^Click next and invite people \"([^\"]*)\" \"([^\"]*)\" then click done$")
	public void click_next_and_invite_people_then_click_done(String name1, String name2) throws Throwable {
	jclick(CTopic.getInv_people());
	Act_send(name1);
	Thread.sleep(3000);
	Act_send(name2);
	Thread.sleep(3000);
	jclick(CTopic.getJustclk());
	jclick(CTopic.getDone());
	
	}


}
