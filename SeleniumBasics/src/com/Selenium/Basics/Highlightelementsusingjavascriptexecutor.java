package com.Selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlightelementsusingjavascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Bharath");
		driver.findElement(By.id("password")).sendKeys("9663808105");
		Thread.sleep(3000);
		WebElement signinbtn = driver.findElement(By.xpath("//input[contains(@value, 'Sign in')]"));
		flash(signinbtn, driver); 
		
		drawborder(signinbtn, driver);//to draw border
		
		generatealert(driver, "there is an issue with login button on login page");//handle alert class
		
		clickelementbyjs(signinbtn, driver);//click on any element by js
		
		refreshbrowserbyjs(driver); //to refresh browser
		
		System.out.println(gettitlebyjs(driver)); //to gettitle
			
		System.out.println(getpageinnertext(driver));// to get innertext
		
		scrollpagedown(driver); // to scrooldownpage
	}
public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundcolor");
		for (int i = 0; i < 10 ; i++) {
			changecolor("rgb(255,0,0)", element,driver);
			changecolor(bgcolor,element,driver);	
		}}
public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);}
			catch (InterruptedException e) {
		}}
public static void drawborder(WebElement element, WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].style.border='3px solid red'",element);
}	
public static void generatealert(WebDriver driver, String message) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("alert('"+message+"')");
}
public static void clickelementbyjs(WebElement element, WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].click();", element);
}
public static void refreshbrowserbyjs(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("history.go(0)");
}
public static String gettitlebyjs(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	String title = js.executeScript("return document.title;").toString();
	return title;			
}
public static String getpageinnertext(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	String pagetext = js.executeScript("return document.documentelement.innertext;").toString();
	return pagetext;
}
public static void scrollpagedown(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("window.scrollto(0,document.body.scrollheight)");
}
	
}
















