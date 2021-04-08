package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class RM_Edit_Del_Role extends Browser{
	public RM_Edit_Del_Role(){
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement sigin;
	@FindBy(xpath="//button[text()='Roles']")
	private WebElement roles;
	@FindBy(xpath="//div[@class='bottom-button modal-btn']//button[text()='Edit']")
	private WebElement r_edit;
	@FindBy(xpath="//input[@id='exampleForm.ControlInput1']")
	private WebElement e_rname;
	@FindBy(xpath="//textarea[@id='exampleForm.ControlInput1']")
	private WebElement e_rdescrp;
	@FindBy(xpath="//span[text()='Mood Board']")
	private WebElement e_role;
	@FindBy(xpath="//button[text()='Update']")
	private WebElement update;
	@FindBy(xpath="//div[@class='bottom-button modal-btn']//button[text()='Delete']")
	private WebElement r_delet;
	
	@FindBy(xpath="//div[@class='modal-content']//div[2]//button[text()='Delete']")
	private WebElement r_cdelet;
	
	public WebElement getR_cdelet() {
		return r_cdelet;
	}
	public void setR_cdelet(WebElement r_cdelet) {
		this.r_cdelet = r_cdelet;
	}
	public WebElement getR_delet() {
		return r_delet;
	}
	public void setR_delet(WebElement r_delet) {
		this.r_delet = r_delet;
	}
	public WebElement getE_rdescrp() {
		return e_rdescrp;
	}
	public void setE_rdescrp(String e_rdescrp) {
		this.e_rdescrp.sendKeys(e_rdescrp);
	}
	public WebElement getE_role() {
		return e_role;
	}
	public void setE_role(WebElement e_role) {
		this.e_role = e_role;
	}
	public WebElement getUpdate() {
		return update;
	}
	public void setUpdate(WebElement update) {
		this.update = update;
	}
	public WebElement getR_edit() {
		return r_edit;
	}
	public void setR_edit(WebElement r_edit) {
		this.r_edit = r_edit;
	}
	public WebElement getE_rname() {
		return e_rname;
	}
	public void setE_rname(String e_rname) {
		this.e_rname.sendKeys(e_rname);
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
