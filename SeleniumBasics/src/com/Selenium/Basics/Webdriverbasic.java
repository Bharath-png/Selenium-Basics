package com.Selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasic {

	public static void main(String[] args) {
		//step:1 connecting to chrome software
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//step:2 open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//step:3 entering the url
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
		
		
		

	}

}
