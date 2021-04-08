package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class Inv_Reg extends Browser{
public Inv_Reg(){
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
public WebElement getReg_but() {
	return Reg_but;
}
public void setReg_but(WebElement reg_but) {
	Reg_but = reg_but;
}
public WebElement getReg_uname() {
	return Reg_uname;
}
public void setReg_uname(String reg_uname) {
	Reg_uname.sendKeys(reg_uname);
}
public WebElement getReg_email() {
	return Reg_email;
}
public void setReg_email(String reg_email) {
	Reg_email.sendKeys(reg_email);
}
public WebElement getReg_submit() {
	return Reg_submit;
}
public void setReg_submit(WebElement reg_submit) {
	Reg_submit = reg_submit;
}

}
