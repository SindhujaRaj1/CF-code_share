package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class RM_CreateRole extends Browser{
public RM_CreateRole(){
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='Sign In']")
private WebElement sigin;
@FindBy(xpath="//button[text()='Roles']")
private WebElement roles;
@FindBy(xpath="//button[text()='Add']")
private WebElement r_add1;
@FindBy(xpath="//div[@class='role-container modal-body']//div//div//input[@placeholder='Role Name']")
private WebElement r_name; 
@FindBy(xpath="//div[@class='col-sm-4 pt-3 pb-2']//div//label//span[text()='Mood Board']")
private WebElement mb_module;
@FindBy(xpath="//div[@class='col-sm-4 pt-3 pb-2']//div//label//span[text()='Catalogue Manangement']")
private WebElement ct_module;

@FindBy(xpath="//div[@class='modal-footer']//button[text()='Add']")
private WebElement r_add2;

public WebElement getR_add2() {
	return r_add2;
}
public void setR_add2(WebElement r_add2) {
	this.r_add2 = r_add2;
}

public WebElement getMb_module() {
	return mb_module;
}
public void setMb_module(WebElement mb_module) {
	this.mb_module = mb_module;
}
public WebElement getCt_module() {
	return ct_module;
}
public void setCt_module(WebElement ct_module) {
	this.ct_module = ct_module;
}
public WebElement getR_name() {
	return r_name;
}
public void setR_name(String r_name) {
	this.r_name.sendKeys(r_name);
}
public WebElement getR_add1() {
	return r_add1;
}
public void setR_add1(WebElement r_add1) {
	this.r_add1 = r_add1;
}
public WebElement getRoles() {
	return roles;
}
public void setRoles(WebElement roles) {
	this.roles = roles;
}
public WebElement getSigin() {
	return sigin;
}
public void setSigin(WebElement sigin) {
	this.sigin = sigin;
}


}
