package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class MB_Mywork_RecentUpload extends Browser{
	public MB_Mywork_RecentUpload(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='col-lg-4']//div[@class='row']//div[position()='1' and @class='my-works col-lg-12']//div[position()='1' and @class='my-works-card card']")
 public WebElement mywork;
	@FindBy(xpath="//span[@class='back-arw']")
	public WebElement back;
	@FindBy(xpath="//div[@class='col-lg-4']//div[@class='row']//div[position()='2' and @class='my-works col-lg-12']//div[position()='1' and @class='my-works-card card']")
	public WebElement Recent;
	public WebElement getRecent() {
		return Recent;
	}
	public void setRecent(WebElement recent) {
		Recent = recent;
	}
	public WebElement getBack() {
		return back;
	}
	public void setBack(WebElement back) {
		this.back = back;
	}
	public WebElement getMywork() {
		return mywork;
	}
	public void setMywork(WebElement mywork) {
		this.mywork = mywork;
	}
	
}
