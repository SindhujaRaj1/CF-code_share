package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class MB_Upload_NewVersion  extends Browser{
	public MB_Upload_NewVersion(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[3]/div/div/div[1]/div[2]/div[1]/div/div[2]")
	private WebElement ntopic;
	@FindBy(xpath="//button[@id='dropdown-more']")
	private WebElement three_dot;
	
	@FindBy(xpath="//div[@x-placement='bottom-end']//a[text()=' Upload Next Version']")
	private WebElement new_version;
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement ndescription;
	@FindBy(xpath="//form//button[text()='Next']")
	private WebElement n_next;
	@FindBy(xpath="//div[@class='attachments']//div[4]//span//div//div//span[@tabindex='0']//input")
	private WebElement nimage;
	@FindBy(xpath="//div[@class='attachments']//div[6]//span//div//div//span[@tabindex='0']//input")
	private WebElement nd_file;
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[7]//button[text()='Next']")
	private WebElement n_next2;
	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div/div[3]/div/div[1]/div")
	private WebElement ninv_people;
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[@class='nav-btn']")
	private WebElement njustclk;
	
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[@class='nav-btn']//button")
	private WebElement nDone;
	
	public WebElement getN_next() {
		return n_next;
	}
	public void setN_next(WebElement n_next) {
		this.n_next = n_next;
	}
	public WebElement getNimage() {
		return nimage;
	}
	public void setNimage(String nimage) {
		this.nimage.sendKeys(nimage);
	}
	public WebElement getNd_file() {
		return nd_file;
	}
	public void setNd_file(String nd_file) {
		this.nd_file.sendKeys(nd_file);
	}
	public WebElement getN_next2() {
		return n_next2;
	}
	public void setN_next2(WebElement n_next2) {
		this.n_next2 = n_next2;
	}
	public WebElement getNinv_people() {
		return ninv_people;
	}
	public void setNinv_people(String ninv_people) {
		this.ninv_people.sendKeys(ninv_people);
	}
	public WebElement getNjustclk() {
		return njustclk;
	}
	public void setNjustclk(WebElement njustclk) {
		this.njustclk = njustclk;
	}
	public WebElement getnDone() {
		return nDone;
	}
	public void setnDone(WebElement nDone) {
		this.nDone = nDone;
	}
	public WebElement getNdescription() {
		return ndescription;
	}
	public void setNdescription(String ndescription) {
		this.ndescription.sendKeys(ndescription);
	}
	public WebElement getThree_dot() {
		return three_dot;
	}
	public void setThree_dot(WebElement three_dot) {
		this.three_dot = three_dot;
	}
	public WebElement getNew_version() {
		return new_version;
	}
	public void setNew_version(WebElement new_version) {
		this.new_version = new_version;
	}
	public WebElement getNtopic() {
		return ntopic;
	}
	public void setNtopic(WebElement ntopic) {
		this.ntopic = ntopic;
	}

	
}
