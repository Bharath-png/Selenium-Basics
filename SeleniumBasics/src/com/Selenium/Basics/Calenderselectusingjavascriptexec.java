package com.Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderselectusingjavascriptexec {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		
	WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
	
	String dateval = "3-05-2021";
	
		selectDateByJS(driver, date, dateval);
		
	}
		
		public static void selectDateByJS(WebDriver driver, WebElement element, String dateval){{{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
			
		}}

}}
