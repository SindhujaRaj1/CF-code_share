package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class G_SignIn extends Browser{
	public G_SignIn(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='login-with']//a[2]")
	private WebElement g_sIn;
	@FindBy(xpath="//input[@type='email']")
	private WebElement R_g_address;
	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	private WebElement R_g_next;
	@FindBy(xpath="//input[@type='password']")
	private WebElement R_g_pass;
	public WebElement getG_sIn() {
		return g_sIn;
	}
	public void setG_sIn(WebElement g_sIn) {
		this.g_sIn = g_sIn;
	}
	public WebElement getR_g_address() {
		return R_g_address;
	}
	public void setR_g_address(String r_g_address) {
		R_g_address.sendKeys(r_g_address);
	}
	public WebElement getR_g_next() {
		return R_g_next;
	}
	public void setR_g_next(WebElement r_g_next) {
		R_g_next = r_g_next;
	}
	public WebElement getR_g_pass() {
		return R_g_pass;
	}
	public void setR_g_pass(String r_g_pass) {
		R_g_pass.sendKeys(r_g_pass);
	}


}
