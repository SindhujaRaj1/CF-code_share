package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class Forgot_Password extends Browser{
public Forgot_Password(){
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='Forgot your Password?']")
private WebElement Fg_pass;
@FindBy(name="emailId")
private WebElement Fg_email;
@FindBy(xpath="//button[text()='Submit']")
private WebElement Fg_submit;

@FindBy(xpath="//input[@id='identifierId' and @type='email']")
private WebElement G_uname;
@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
private WebElement G_next;


@FindBy(xpath="//input[@type='password']")
private WebElement G_pass;
@FindBy(xpath="//ul[@jsname='k77Iif']//li[7]")
private WebElement G_Gmail;

@FindBy(xpath="//table[@role='grid']//tbody//tr[1]")
private WebElement G_Mail;
@FindBy(xpath="//a[text()='Reset my password']")
private WebElement G_set_pass;
@FindBy(name="password")
private WebElement F_pass;
@FindBy(name="passwordConfirmation")
private WebElement F_Con_pass;
@FindBy(xpath="//button[text()='Submit']")
private WebElement F_submit;
@FindBy(xpath="//button[text()='Signin']")
private WebElement F_signin;

public WebElement getF_signin() {
	return F_signin;
}
public void setF_signin(WebElement f_signin) {
	F_signin = f_signin;
}
public WebElement getF_pass() {
	return F_pass;
}
public void setF_pass(String f_pass) {
	F_pass.sendKeys(f_pass);
}
public WebElement getF_Con_pass() {
	return F_Con_pass;
}
public void setF_Con_pass(String f_Con_pass) {
	F_Con_pass.sendKeys(f_Con_pass);
}
public WebElement getF_submit() {
	return F_submit;
}
public void setF_submit(WebElement f_submit) {
	F_submit = f_submit;
}
public WebElement getG_uname() {
	return G_uname;
}
public void setG_uname(String g_uname) {
	G_uname.sendKeys(g_uname);
}
public WebElement getG_next() {
	return G_next;
}
public void setG_next(WebElement g_next) {
	G_next = g_next;
}
public WebElement getG_pass() {
	return G_pass;
}
public void setG_pass(String g_pass) {
	G_pass.sendKeys(g_pass);
}
public WebElement getG_Gmail() {
	return G_Gmail;
}
public void setG_Gmail(WebElement g_Gmail) {
	G_Gmail = g_Gmail;
}
public WebElement getG_Mail() {
	return G_Mail;
}
public void setG_Mail(WebElement g_Mail) {
	G_Mail = g_Mail;
}
public WebElement getG_set_pass() {
	return G_set_pass;
}
public void setG_set_pass(WebElement g_set_pass) {
	G_set_pass = g_set_pass;
}
public WebElement getFg_email() {
	return Fg_email;
}
public void setFg_email(String fg_email) {
	Fg_email.sendKeys(fg_email);
}
public WebElement getFg_submit() {
	return Fg_submit;
}
public void setFg_submit(WebElement fg_submit) {
	Fg_submit = fg_submit;
}

public WebElement getFg_pass() {
	return Fg_pass;
}
public void setFg_pass(WebElement fg_pass) {
	Fg_pass = fg_pass;
}
}
