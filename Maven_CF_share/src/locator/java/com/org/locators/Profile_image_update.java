package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class Profile_image_update extends Browser{
	public Profile_image_update(){
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
	@FindBy(id="inputGroupFile01")
	private WebElement image;
	@FindBy(xpath="//button[text()='Update']")
	private WebElement update;

	public WebElement getUpdate() {
		return update;
	}
	public void setUpdate(WebElement update) {
		this.update = update;
	}
	public WebElement getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image.sendKeys(image);
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
	public WebElement getSignin() {
		return signin;
	}
	public void setSignin(WebElement signin) {
		this.signin = signin;
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
	public WebElement getEdit() {
		return edit;
	}
	public void setEdit(WebElement edit) {
		this.edit = edit;
	}

}
