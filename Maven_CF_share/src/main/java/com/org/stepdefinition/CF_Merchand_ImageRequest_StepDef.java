package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.Merchandiser_ImageRequest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_Merchand_ImageRequest_StepDef extends Browser{
	Merchandiser_ImageRequest ImgReq;
	@When("^Login as merchandiser \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_as_merchandiser_and(String Muname, String Mpass) throws Throwable {
	  ImgReq= new Merchandiser_ImageRequest();
	  ImgReq.setM_Uname(Muname);
	  ImgReq.setM_Pass(Mpass);
	  Click(ImgReq.getM_butt());
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  
	}

	@When("^Click in app notification$")
	public void click_in_app_notification() throws Throwable {
//	   Click(ImgReq.getNotfication_bell());
//	   Click(ImgReq.getNotfication_click());
		//Publish request direct navigation
				Click(ImgReq.getPublish_request());
	   
	   mousehover(ImgReq.getMoushov());
		
	}

	@When("^Select gender as \"([^\"]*)\" and catagory as \"([^\"]*)\" and price \"([^\"]*)\" and click next$")
	public void select_gender_as_and_catagory_as_and_price_and_click_next(String gender, String brand, String price) throws Throwable {
	   Click(ImgReq.getGender());
	   dropdown(ImgReq.getBrand(),brand);
	   Click(ImgReq.getPrice());
	  ImgReq.setPrice(price);
	  Click(ImgReq.getNext());
	}

	@When("^Select default image and customization fabric and click image request button$")
	public void select_default_image_and_customization_fabric_and_click_image_request_button() throws Throwable {
	   Click(ImgReq.getDefault_f());
	   scroll(ImgReq.getDefault_f_sel());
	   Click(ImgReq.getDefault_f_sel());
	   scroll(ImgReq.getC_fabric1());
	  Click(ImgReq.getC_fabric1());
	   scroll(ImgReq.getC_fabric2());
	   Click(ImgReq.getC_fabric2());
	   scroll(ImgReq.getC_fabric3());
	   Click(ImgReq.getC_fabric3());
	   scroll(ImgReq.getC_fabric1());
	   Click(ImgReq.getC_fabric1());
	   Click(ImgReq.getPrevious());
	   Click(ImgReq.getNext());
	   Click(ImgReq.getReq_img());
	   
	}
	

	@Then("^send image request to designer \"([^\"]*)\"$")
	public void send_image_request_to_designer(String arg1) throws Throwable {
		Click(ImgReq.getDesig_list());
		Click(ImgReq.getDesigner());
		Click(ImgReq.getSend());
		
	    
	}
}
