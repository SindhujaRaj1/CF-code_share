package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class MB_Create_Topic extends Browser {
	public MB_Create_Topic(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div//button[text()='Create a Topic']")
	private WebElement C_Topic;
	@FindBy(name="topic")
	private WebElement topic;
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement description;
	@FindBy(xpath="//form//button[text()='Next']")
	private WebElement next;
	@FindBy(xpath="//div[@class='attachments']//div[2]//span//div//div//span[@tabindex='0']//input")
	private WebElement banner;
	@FindBy(xpath="//div[@class='attachments']//div[4]//span//div//div//span[@tabindex='0']//input")
	private WebElement image;
	@FindBy(xpath="//div[@class='attachments']//div[6]//span//div//div//span[@tabindex='0']//input")
	private WebElement d_file;
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[7]//button[text()='Next']")
	private WebElement next2;
	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div/div[3]/div/div[1]/div")
	private WebElement inv_people;
	
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[@class='nav-btn']")
	private WebElement justclk;
	
	@FindBy(xpath="//div[@class='active carousel-item']//div//div[@class='nav-btn']//button")
	private WebElement Done;
	public WebElement getJustclk() {
		return justclk;
	}
	public void setJustclk(WebElement justclk) {
		this.justclk = justclk;
	}
	public WebElement getDone() {
		return Done;
	}
	public void setDone(WebElement done) {
		Done = done;
	}
	public WebElement getInv_people() {
		return inv_people;
	}
	public void setInv_people(String inv_people) {
		this.inv_people.sendKeys(inv_people);
	}
	public WebElement getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner.sendKeys(banner);
	}
	public WebElement getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image.sendKeys(image);
	}
	public WebElement getD_file() {
		return d_file;
	}
	public void setD_file(String d_file) {
		this.d_file.sendKeys(d_file);
	}
	public WebElement getNext2() {
		return next2;
	}
	public void setNext2(WebElement next2) {
		this.next2 = next2;
	}
	public WebElement getC_Topic() {
		return C_Topic;
	}
	public void setC_Topic(WebElement c_Topic) {
		C_Topic = c_Topic;
	}
	public WebElement getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic.sendKeys(topic);
	}
	public WebElement getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description.sendKeys(description);
	}
	public WebElement getNext() {
		return next;
	}
	public void setNext(WebElement next) {
		this.next = next;
	}
	
}
