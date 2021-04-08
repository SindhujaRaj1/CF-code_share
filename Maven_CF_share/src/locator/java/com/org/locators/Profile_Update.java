package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class Profile_Update extends Browser{

	public Profile_Update(){
		PageFactory.initElements(driver, this);
	}
@FindBy(name="userName")
private WebElement Uname;
@FindBy(name="password")
private WebElement pass;
@FindBy(xpath="//button[text()='Sign In']")
private WebElement signin;
@FindBy(id="dropdown-user")
private WebElement menu;
@FindBy(xpath="//div[@x-placement='bottom-end']//a")
private WebElement profile;
@FindBy(xpath="//button[text()='Edit']")
private WebElement edit;
@FindBy(id="First Name")
private WebElement f_name;
@FindBy(id="Last Name")
private WebElement l_name;
@FindBy(id="Phone Number")
private WebElement mobile;
@FindBy(xpath="//button[text()='Update']")
private WebElement update;
@FindBy(name="dateofBirth")
private WebElement DOB;
@FindBy(name="emailId")
private WebElement email;
public WebElement getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB.sendKeys(dOB);
}
public WebElement getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email.sendKeys(email);
}
public WebElement getUpdate() {
	return update;
}
public void setUpdate(WebElement update) {
	this.update = update;
}
public WebElement getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name.sendKeys(f_name);
}
public WebElement getL_name() {
	return l_name;
}
public void setL_name(String l_name) {
	this.l_name.sendKeys(l_name);
}
public WebElement getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile.sendKeys(mobile);
}
public WebElement getEdit() {
	return edit;
}
public void setEdit(WebElement edit) {
	this.edit = edit;
}
public WebElement getMenu() {
	return menu;
}
public void setMenu(WebElement menu) {
	this.menu = menu;
}
public WebElement getProfile() {
	return profile;
}
public void setProfile(WebElement profile) {
	this.profile = profile;
}
public WebElement getSignin() {
	return signin;
}
public void setSignin(WebElement signin) {
	this.signin = signin;
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

}
