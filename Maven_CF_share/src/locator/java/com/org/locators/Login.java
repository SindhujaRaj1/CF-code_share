package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class Login extends Browser {
public Login(){
	PageFactory.initElements(driver, this);
}
@FindBy(name="userName")
private WebElement L_Uname;
@FindBy(name="password")
private WebElement L_Pass;
@FindBy(xpath="//button[text()='Sign In']")
private WebElement L_butt;

public WebElement getL_butt() {
	return L_butt;
}
public void setL_butt(WebElement l_butt) {
	L_butt = l_butt;
}
public WebElement getL_Uname() {
	return L_Uname;
}
public void setL_Uname(String l_Uname) {
	L_Uname.sendKeys(l_Uname);
}
public WebElement getL_Pass() {
	return L_Pass;
}
public void setL_Pass(String l_Pass) {
	L_Pass.sendKeys(l_Pass);
}

}
