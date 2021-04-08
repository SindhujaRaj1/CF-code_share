package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class MB_Sort extends Browser {
	public MB_Sort(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="userName")
	public WebElement Uname;
	
	@FindBy(name="password")
	public WebElement pass;
	@FindBy(xpath="//button[text()='Sign In']")
	public WebElement loginbut;
	@FindBy(xpath="//ul//li[13]")
	public WebElement moodboard;
	@FindBy(id="exampleForm.ControlSelect1")
	public WebElement sort;
	
	public WebElement getSort() {
		return sort;
	}
	public void setSort(WebElement sort) {
		this.sort = sort;
	}
	public WebElement getMoodboard() {
		return moodboard;
	}
	public void setMoodboard(WebElement moodboard) {
		this.moodboard = moodboard;
	}
	public WebElement getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname.sendKeys(uname);
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass.sendKeys(pass);
	}
	public WebElement getLoginbut() {
		return loginbut;
	}
	public void setLoginbut(WebElement loginbut) {
		this.loginbut = loginbut;
	}
	

}
