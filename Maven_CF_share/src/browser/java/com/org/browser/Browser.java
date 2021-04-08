package com.org.browser;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static WebDriver driver;
public static String url;
	public static WebDriver browser(String brows,String url){
		if(brows.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(brows.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();
		}
		else if(brows.equalsIgnoreCase("ie")){
			WebDriverManager.iedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			System.out.println("Please Select correct browser");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
		
	}
	public static void Click(WebElement c){
	 c.click();
	}
	public static void window(int n){
		String h=null;
		Set<String> c=driver.getWindowHandles();
		Iterator<String> i=c.iterator();
		for(int j=0;j<=n;j++){
			h=i.next();
		}
		driver.switchTo().window(h);
	}
	public static void dropdown(WebElement e,String s){
		Select sc=new Select(e);
		sc.selectByVisibleText(s);
	}
	
	public static void Clear(){
		Actions a=new Actions(driver);
		   
	    a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    a.keyDown(Keys.CONTROL).sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).build().perform();
}
	public static void jclick(WebElement topic ){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement create=wait.until(ExpectedConditions.elementToBeClickable(topic));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", create);
	}
	
	public static void scroll(WebElement e){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", e);
	}
	public static void Act_send(String n){
		Actions a=new Actions(driver);
		
	    a.keyDown(Keys.SHIFT).sendKeys(n).keyUp(Keys.SHIFT).build().perform();
	  
	    a.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
	}
	public static void mousehover(WebElement e){
		Actions a= new Actions(driver);
		a.moveToElement(e).click().build().perform();
		
	}

	}
