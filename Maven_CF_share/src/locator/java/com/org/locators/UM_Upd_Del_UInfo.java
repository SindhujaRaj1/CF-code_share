package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class UM_Upd_Del_UInfo extends Browser{
 public UM_Upd_Del_UInfo(){
	 PageFactory.initElements(driver, this);
 }
    @FindBy(xpath="//button[text()='Sign In']")
	private WebElement sigin;
	@FindBy(xpath="//button[text()='Users']")
	private WebElement users;
	@FindBy(xpath="//table//tbody//tr[1]//td[4]//*[name()='svg' and position()=1]")
	private WebElement edit;
	@FindBy(xpath="//table//tbody//tr[1]//td[2]//div//input")
	private WebElement email;
	@FindBy(xpath="//table//tbody//tr[1]//td[3]//select[@id='roleId']")
	private WebElement role;
	@FindBy(xpath="//table//tbody//tr[1]//td[4]//*[name()='svg' and position()=2]")
	private WebElement delete;
	  @FindBy(xpath="//div[@class='modal-footer']//button[2]")
		private WebElement CDel;
	
	public WebElement getCDel() {
		return CDel;
	}
	public void setCDel(WebElement cDel) {
		CDel = cDel;
	}
	public WebElement getDelete() {
		return delete;
	}
	public void setDelete(WebElement delete) {
		this.delete = delete;
	}
	@FindBy(xpath="//table//tbody//tr[1]//td[4]//button[@type='submit']")
	private WebElement update;
	public WebElement getUpdate() {
		return update;
	}
	public void setUpdate(WebElement update) {
		this.update = update;
	}
	public WebElement getRole() {
		return role;
	}
	public void setRole(WebElement role) {
		this.role = role;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public WebElement getSigin() {
		return sigin;
	}
	public void setSigin(WebElement sigin) {
		this.sigin = sigin;
	}
	public WebElement getUsers() {
		return users;
	}
	public void setUsers(WebElement users) {
		this.users = users;
	}
	public WebElement getEdit() {
		return edit;
	}
	public void setEdit(WebElement edit) {
		this.edit = edit;
	}
	
}
