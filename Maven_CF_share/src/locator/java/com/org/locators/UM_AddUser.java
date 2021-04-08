package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class UM_AddUser extends Browser{
	public UM_AddUser(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement sigin;
	@FindBy(xpath="//button[text()='Users']")
	private WebElement users;
	@FindBy(xpath="//button[text()='Add']")
	private WebElement add;
	@FindBy(xpath="//div[@class='modal-body']//div//div//input[@name='userName']")
	private WebElement Uname;
	@FindBy(xpath="//div[@class='modal-body']//div[2]//div//input[@name='emailId']")
	private WebElement email;
	@FindBy(xpath="//div//select[@name='role']")
	private WebElement role;
	@FindBy(xpath="//div[@class='modal-footer']//button[text()='Add']")
	private WebElement addUser;
	
	public WebElement getAddUser() {
		return addUser;
	}
	public void setAddUser(WebElement addUser) {
		this.addUser = addUser;
	}
	public WebElement getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname.sendKeys(uname);
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public WebElement getRole() {
		return role;
	}
	public void setRole(WebElement role) {
		this.role = role;
	}
	public WebElement getAdd() {
		return add;
	}
	public void setAdd(WebElement add) {
		this.add = add;
	}
	public WebElement getUsers() {
		return users;
	}
	public void setUsers(WebElement users) {
		this.users = users;
	}
	public WebElement getSigin() {
		return sigin;
	}
	public void setSigin(WebElement sigin) {
		this.sigin = sigin;
	}

}
