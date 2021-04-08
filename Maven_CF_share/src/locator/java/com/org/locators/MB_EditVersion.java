package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class MB_EditVersion extends Browser{
	public MB_EditVersion(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[3]/div/div/div[1]/div[2]/div[1]/div/div[2]")
	private WebElement etopic;
	@FindBy(xpath="//button[@id='dropdown-more']")
	private WebElement three_dot;
	
	@FindBy(xpath="//div[@x-placement='bottom-end']//a[text()='Edit']")
	private WebElement edit;
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement edescription;
	@FindBy(xpath="//form//button[text()='Next']")
	private WebElement enext;
	@FindBy(xpath="//div[@class='attachments']//div[4]//span//div//div[2]//div//span//button")
	private WebElement Img_remove;
	@FindBy(xpath="//div[@class='attachments']//div[6]//span//div//div//div//span//button")
	private WebElement design_remove;
	
	@FindBy(xpath="//div[@class='attachments']//div[4]//span//div//div//span[@tabindex='0']//input")
	private WebElement eimage;
	@FindBy(xpath="//div[@class='attachments']//div[6]//span//div//div//span[@tabindex='0']//input")
	private WebElement ed_file;
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[7]//button[text()='Next']")
	private WebElement enext2;
	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div/div[3]/div/div[1]/div")
	private WebElement einv_people;
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[@class='nav-btn']")
	private WebElement ejustclk;
	
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[@class='nav-btn']//button")
	private WebElement eDone;
	
	
	
	public WebElement getImg_remove() {
		return Img_remove;
	}
	public void setImg_remove(WebElement img_remove) {
		Img_remove = img_remove;
	}
	public WebElement getDesign_remove() {
		return design_remove;
	}
	public void setDesign_remove(WebElement design_remove) {
		this.design_remove = design_remove;
	}
	public WebElement getEdescription() {
		return edescription;
	}
	public void setEdescription(WebElement edescription) {
		this.edescription = edescription;
	}
	public WebElement getEnext() {
		return enext;
	}
	public void setEnext(WebElement enext) {
		this.enext = enext;
	}

	public WebElement getEimage() {
		return eimage;
	}
	public void setEimage(String eimage) {
		this.eimage.sendKeys(eimage);
	}
	public WebElement getEd_file() {
		return ed_file;
	}
	public void setEd_file(String ed_file) {
		this.ed_file.sendKeys(ed_file);
	}
	public WebElement getEnext2() {
		return enext2;
	}
	public void setEnext2(WebElement enext2) {
		this.enext2 = enext2;
	}
	public WebElement getEinv_people() {
		return einv_people;
	}
	public void setEinv_people(WebElement einv_people) {
		this.einv_people = einv_people;
	}
	public WebElement getEjustclk() {
		return ejustclk;
	}
	public void setEjustclk(WebElement ejustclk) {
		this.ejustclk = ejustclk;
	}
	public WebElement geteDone() {
		return eDone;
	}
	public void seteDone(WebElement eDone) {
		this.eDone = eDone;
	}
	public WebElement getEdit() {
		return edit;
	}
	public void setEdit(WebElement edit) {
		this.edit = edit;
	}
	public WebElement getThree_dot() {
		return three_dot;
	}
	public void setThree_dot(WebElement three_dot) {
		this.three_dot = three_dot;
	}
	public WebElement getEtopic() {
		return etopic;
	}
	public void setEtopic(WebElement etopic) {
		this.etopic = etopic;
	}
	
	
	

}
