package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class Registration extends Browser{
	
public Registration(){
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='Register']")
private WebElement Reg_but;
@FindBy(name="userName")
private WebElement Reg_uname;
@FindBy(name="emailId")
private WebElement Reg_email;
@FindBy(xpath="//button[@type='submit']")
private WebElement Reg_submit;

@FindBy(xpath="//input[@id='identifierId' and @type='email']")
private WebElement G_uname;
@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
private WebElement G_next;


@FindBy(xpath="//input[@type='password']")
private WebElement G_pass;
@FindBy(xpath="//ul[@jsname='k77Iif']//li[7]")
private WebElement R_Gmail;

@FindBy(xpath="//table[@role='grid']//tbody//tr[1]")
private WebElement R_Mail;
@FindBy(xpath="//a[(text()='Set my password')]")
private WebElement set_password;
@FindBy(name="password")
private WebElement new_pass;
@FindBy(name="passwordConfirmation")
private WebElement conf_pass;
@FindBy(xpath="//button[text()='Submit']")
private WebElement Newp_sub;


public WebElement getNewp_sub() {
	return Newp_sub;
}
public void setNewp_sub(WebElement newp_sub) {
	Newp_sub = newp_sub;
}
public WebElement getNew_pass() {
	return new_pass;
}
public void setNew_pass(String new_pass) {
	this.new_pass.sendKeys(new_pass);
}
public WebElement getConf_pass() {
	return conf_pass;
}
public void setConf_pass(String conf_pass) {
	this.conf_pass.sendKeys(conf_pass);
}
public WebElement getSet_password() {
	return set_password;
}
public void setSet_password(WebElement set_password) {
	this.set_password = set_password;
}
public WebElement getR_Mail() {
	return R_Mail;
}
public void setR_Mail(WebElement r_Mail) {
	R_Mail = r_Mail;
}
public WebElement getR_Gmail() {
	return R_Gmail;
}
public void setR_Gmail(WebElement r_Gmail) {
	R_Gmail = r_Gmail;
}

public WebElement getG_pass() {
	return G_pass;
}
public void setG_pass(String g_pass) {
	G_pass.sendKeys(g_pass);
}
public WebElement getG_next() {
	return G_next;
}
public void setG_next(WebElement g_next) {
	G_next = g_next;
}
public WebElement getG_uname() {
	return G_uname;
}
public void setG_uname(String g_uname) {
	G_uname.sendKeys(g_uname);
}

//public WebElement getG_acc() {
//	return g_acc;
//}
//public void setG_acc(WebElement g_acc) {
//	this.g_acc = g_acc;
//}
public WebElement getReg_submit() {
	return Reg_submit;
}
public void setReg_submit(WebElement reg_submit) {
	Reg_submit = reg_submit;
}
public WebElement getReg_email() {
	return Reg_email;
}
public void setReg_email(String reg_email) {
	Reg_email.sendKeys(reg_email);
}
public WebElement getReg_uname() {
	return Reg_uname;
}
public void setReg_uname(String reg_uname) {
	Reg_uname.sendKeys(reg_uname);
}
public WebElement getReg_but() {
	return Reg_but;
}
public void setReg_but(WebElement reg_but) {
	Reg_but = reg_but;
}
}
