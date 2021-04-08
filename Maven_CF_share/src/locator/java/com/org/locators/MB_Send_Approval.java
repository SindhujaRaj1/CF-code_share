package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class MB_Send_Approval extends Browser {
public MB_Send_Approval(){
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id='root']/div/div/div[3]/div/div/div[1]/div[2]/div[1]/div/div[2]/div") 
private WebElement style;
@FindBy(xpath="//button[@id='dropdown-more']")
private WebElement three_dot;
@FindBy(xpath="//div[@x-placement='bottom-end']//a[text()='Send For Approval']")
private WebElement Send_Approval;
@FindBy(xpath="//div[@class='invite-people']//div//div//span//input")
private WebElement d_click;
@FindBy(xpath="//div[@class='rc-virtual-list-holder-inner']//div[4]")
private WebElement designer;
@FindBy(xpath="//div[@class='invite-people']//div[2]//button")
private WebElement send_bt;

public WebElement getD_click() {
	return d_click;
}
public void setD_click(WebElement d_click) {
	this.d_click = d_click;
}
public WebElement getDesigner() {
	return designer;
}
public void setDesigner(String designer) {
	this.designer.sendKeys(designer);
}
public WebElement getSend_bt() {
	return send_bt;
}
public void setSend_bt(WebElement send_bt) {
	this.send_bt = send_bt;
}
public WebElement getThree_dot() {
	return three_dot;
}
public void setThree_dot(WebElement three_dot) {
	this.three_dot = three_dot;
}
public WebElement getSend_Approval() {
	return Send_Approval;
}
public void setSend_Approval(WebElement send_Approval) {
	Send_Approval = send_Approval;
}
public WebElement getStyle() {
	return style;
}
public void setStyle(WebElement style) {
	this.style = style;
}


}
