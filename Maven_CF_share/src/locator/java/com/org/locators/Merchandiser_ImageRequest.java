package com.org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.browser.Browser;

public class Merchandiser_ImageRequest extends Browser{
	public Merchandiser_ImageRequest(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="userName")
	private WebElement m_Uname;
	@FindBy(name="password")
	private WebElement m_Pass;
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement m_butt;
	@FindBy(xpath="//*[@id='dropdown-notification']")
	private WebElement notfication_bell;
	@FindBy(xpath="//ul//li//button[text()='Publish Requests']")
	private WebElement publish_request;

	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div[2]/div[1]/div/div/div[2]/p")
	private WebElement notfication_click;
	@FindBy(xpath="//div[@class='row' and position()='2']//div[@class='publish-req-col col-xl-3 col-lg-4 col-md-6' and position()='2']//div//div//div//button")
	private WebElement moushov;
	@FindBy(xpath="//div[@class='form-group' and position()='3']//div[1]")
	private WebElement gender;
	@FindBy(xpath="//div[@class='form-group' and position()='4']//div[1]//div//select")
	private WebElement brand;
	@FindBy(xpath="//div[@class='form-group' and position()='5']//input")
	private WebElement price;
	@FindBy(xpath="//div//button[text()='Next']")
	private WebElement next;
	@FindBy(xpath="//form[@class='form-new-style']//div//div//div//div//span[2]")
	private WebElement default_f;
	@FindBy(xpath="//div[@class='rc-virtual-list-holder-inner']//div//div//span[position()='2' and text()='Poran']")
	private WebElement default_f_sel;
	@FindBy(xpath="//div[@class='cloth_container']//ul//li//small[text()='zipper']")
	private WebElement C_fabric1;
	@FindBy(xpath="//div[@class='cloth_container']//ul//li//small[text()='a34567']")
	private WebElement C_fabric2;
	@FindBy(xpath="//div[@class='cloth_container']//ul//li//small[text()='Blue Printed']")
	private WebElement C_fabric3;
	@FindBy(xpath="//form[@class='form-new-style']//div[3]//button[text()='Previous']")
	private WebElement previous;
	@FindBy(xpath="//form[@class='form-new-style']//div[3]//button[text()='Request Images']")
	private WebElement req_img;
	@FindBy(xpath="//div[@class='invite-people']//div//div[@class='ant-select-selector']//span[position()='2']")
	private WebElement desig_list;
	@FindBy(xpath="//div[@class='rc-virtual-list-holder-inner']//div//span[text()='Varun_krish' and position()='2']")
	private WebElement designer;
	@FindBy(xpath="//div[@class='nav-btn']//button[text()='Send']")
	private WebElement Send;
	
	public WebElement getDesig_list() {
		return desig_list;
	}
	public void setDesig_list(WebElement desig_list) {
		this.desig_list = desig_list;
	}
	public WebElement getDesigner() {
		return designer;
	}
	public void setDesigner(WebElement designer) {
		this.designer = designer;
	}
	public WebElement getSend() {
		return Send;
	}
	public void setSend(WebElement send) {
		Send = send;
	}
	public WebElement getPrevious() {
		return previous;
	}
	public void setPrevious(WebElement previous) {
		this.previous = previous;
	}
	public WebElement getReq_img() {
		return req_img;
	}
	public void setReq_img(WebElement req_img) {
		this.req_img = req_img;
	}
	public WebElement getC_fabric1() {
		return C_fabric1;
	}
	public void setC_fabric1(WebElement c_fabric1) {
		C_fabric1 = c_fabric1;
	}
	public WebElement getC_fabric2() {
		return C_fabric2;
	}
	public void setC_fabric2(WebElement c_fabric2) {
		C_fabric2 = c_fabric2;
	}
	public WebElement getC_fabric3() {
		return C_fabric3;
	}
	public void setC_fabric3(WebElement c_fabric3) {
		C_fabric3 = c_fabric3;
	}
	public WebElement getDefault_f() {
		return default_f;
	}
	public void setDefault_f(WebElement default_f) {
		this.default_f = default_f;
	}
	public WebElement getDefault_f_sel() {
		return default_f_sel;
	}
	public void setDefault_f_sel(WebElement default_f_sel) {
		this.default_f_sel = default_f_sel;
	}
	public WebElement getNext() {
		return next;
	}
	public void setNext(WebElement next) {
		this.next = next;
	}
	public WebElement getPublish_request() {
		return publish_request;
	}
	public void setPublish_request(WebElement publish_request) {
		this.publish_request = publish_request;
	}
	
	public WebElement getGender() {
		return gender;
	}
	public void setGender(WebElement gender) {
		this.gender = gender;
	}
	public WebElement getBrand() {
		return brand;
	}
	public void setBrand(WebElement brand) {
		this.brand = brand;
	}
	public WebElement getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price.sendKeys(price);
	}
	public WebElement getMoushov() {
		return moushov;
	}
	public void setMoushov(WebElement moushov) {
		this.moushov = moushov;
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
	public WebElement getM_Uname() {
		return m_Uname;
	}
	public void setM_Uname(String m_Uname) {
		this.m_Uname.sendKeys(m_Uname);
	}
	public WebElement getM_Pass() {
		return m_Pass;
	}
	public void setM_Pass(String m_Pass) {
		this.m_Pass.sendKeys(m_Pass);
	}
	public WebElement getM_butt() {
		return m_butt;
	}
	public void setM_butt(WebElement m_butt) {
		this.m_butt = m_butt;
	}
	

}
