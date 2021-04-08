package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class G_SignUP  extends Browser{
public G_SignUP()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='Register']")
private WebElement Reg_but;
@FindBy(xpath="//div[@class='login-with']//a[2]")
private WebElement R_google;
@FindBy(xpath="//input[@type='email']")
private WebElement R_g_address;
@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
private WebElement R_g_next;
@FindBy(xpath="//input[@type='password']")
private WebElement R_g_pass;


public WebElement getR_g_pass() {
	return R_g_pass;
}
public void setR_g_pass(String r_g_pass) {
	R_g_pass.sendKeys(r_g_pass);
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
public WebElement getR_google() {
	return R_google;
}
public void setR_google(WebElement r_google) {
	R_google = r_google;
}
public WebElement getReg_but() {
	return Reg_but;
}
public void setReg_but(WebElement reg_but) {
	Reg_but = reg_but;
}
}
