package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class UM_SBox_Sort extends Browser{
	public UM_SBox_Sort(){
		PageFactory.initElements(driver, this);
		
	}
	   @FindBy(xpath="//button[text()='Sign In']")
		private WebElement sigin;
		@FindBy(xpath="//button[text()='Users']")
		private WebElement users;
		@FindBy(xpath="//div[@class='search']//div//input")
		private WebElement search;
		@FindBy(xpath="//table//thead//tr[1]//th[1]//div//span[@class='up']//*[name()='svg']")
		private WebElement up_sort;
		
		
		public WebElement getUp_sort() {
			return up_sort;
		}
		public void setUp_sort(WebElement up_sort) {
			this.up_sort = up_sort;
		}
		public WebElement getSearch() {
			return search;
		}
		public void setSearch(String search) {
			this.search.sendKeys(search);
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
		

}
