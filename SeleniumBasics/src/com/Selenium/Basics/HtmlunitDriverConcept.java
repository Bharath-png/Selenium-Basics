package com.Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlunitDriverConcept {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		/*WebDriver driver = new ChromeDriver(options);*/
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("bharathgm@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9663808105");
		System.out.println("before login, titlename is:======"+driver.getTitle());
		System.out.println("after login, titlename is:======"+driver.getTitle());
		
		
		

	}

}
