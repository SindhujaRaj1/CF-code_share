package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class MB_Send_for_Pricing extends Browser{
public MB_Send_for_Pricing(){
	PageFactory.initElements(driver, this);
}
@FindBy(name="userName")
private WebElement DH_Uname;
@FindBy(name="password")
private WebElement DH_Pass;
@FindBy(xpath="//button[text()='Sign In']")
private WebElement butt;
@FindBy(xpath="//*[@id='dropdown-notification']")
private WebElement notfication_bell;

@FindBy(xpath="//*[@id='root']/div/div/div[1]/div[2]/div[1]/div/div/div[2]/p")
private WebElement notfication_click;
@FindBy(xpath="//div[@class='topic-view-header']//div[2]//button[text()='Approve']")
private WebElement approve_but;
@FindBy(xpath="//div[@class='modal-content']//div[2]//div//button[text()='Yes']")
private WebElement yes_publish;
@FindBy(xpath="//div[@class='modal-content']//div[2]//div//button[text()='No,Just Approve']")
private WebElement justApprove;


@FindBy(xpath="//*[@id='rc_select_0']")
private WebElement merch_click;

@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[7]/div")
private WebElement merchandiser;
@FindBy(xpath="//div[@class='mt-3 modal-footer']//button[text()='Publish']")
private WebElement publish;
public WebElement getPublish() {
	return publish;
}
public void setPublish(WebElement publish) {
	this.publish = publish;
}
public WebElement getApprove_but() {
	return approve_but;
}
public void setApprove_but(WebElement approve_but) {
	this.approve_but = approve_but;
}
public WebElement getYes_publish() {
	return yes_publish;
}
public void setYes_publish(WebElement yes_publish) {
	this.yes_publish = yes_publish;
}
public WebElement getMerch_click() {
	return merch_click;
}
public void setMerch_click(WebElement merch_click) {
	this.merch_click = merch_click;
}
public WebElement getMerchandiser() {
	return merchandiser;
}
public void setMerchandiser(WebElement merchandiser) {
	this.merchandiser = merchandiser;
}
public WebElement getNotfication_bell() {
	return notfication_bell;
}
public void setNotfication_bell(WebElement notfication_bell) {
	this.notfication_bell = notfication_bell;
}
public WebElement getNotfication_click() {
	return notfication_click;
}
public void setNotfication_click(WebElement notfication_click) {
	this.notfication_click = notfication_click;
}
public WebElement getDH_Uname() {
	return DH_Uname;
}
public void setDH_Uname(String dH_Uname) {
	DH_Uname.sendKeys(dH_Uname);
}
public WebElement getDH_Pass() {
	return DH_Pass;
}
public void setDH_Pass(String dH_Pass) {
	DH_Pass.sendKeys(dH_Pass);
}
public WebElement getButt() {
	return butt;
}
public void setButt(WebElement butt) {
	this.butt = butt;
}


}
