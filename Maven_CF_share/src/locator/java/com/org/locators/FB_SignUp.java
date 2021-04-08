package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class FB_SignUp extends Browser{
	public FB_SignUp(){
PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//button[text()='Register']")
	private WebElement Reg_but;
	@FindBy(xpath="//div[@class='login-with']//a[1]")
	private WebElement Reg_Fb;
	@FindBy(xpath="//div[@id='email_container']//div//input")
	private WebElement R_FB_email;
	@FindBy(xpath="//div[@id='loginform']//div[@class='clearfix form_row']//div//input[@id='pass']")
	private WebElement R_FB_pass;
	@FindBy(xpath="//input[@name='login']")
	private WebElement R_FB_login;
	@FindBy(xpath="//button[@name='__CONFIRM__']")
	private WebElement R_FB_conf;
	
	public WebElement getR_FB_conf() {
		return R_FB_conf;
	}
	public void setR_FB_conf(WebElement r_FB_conf) {
		R_FB_conf = r_FB_conf;
	}
	public WebElement getR_FB_login() {
		return R_FB_login;
	}
	public void setR_FB_login(WebElement r_FB_login) {
		R_FB_login = r_FB_login;
	}
	public WebElement getR_FB_email() {
		return R_FB_email;
	}
	public void setR_FB_email(String r_FB_email) {
		R_FB_email.sendKeys(r_FB_email);
	}
	public WebElement getR_FB_pass() {
		return R_FB_pass;
	}
	public void setR_FB_pass(String r_FB_pass) {
		R_FB_pass.sendKeys(r_FB_pass);
	}
	public WebElement getReg_but() {
		return Reg_but;
	}
	public void setReg_but(WebElement reg_but) {
		Reg_but = reg_but;
	}
	public WebElement getReg_Fb() {
		return Reg_Fb;
	}
	public void setReg_Fb(WebElement reg_Fb) {
		Reg_Fb = reg_Fb;
	}
	
}