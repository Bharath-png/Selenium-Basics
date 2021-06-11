package com.Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTestvisibility {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Boolean b1 = driver.findElement(By.name("proceed")).isDisplayed();
		System.out.println(b1);
		
		boolean b2 = driver.findElement(By.className("signinbtn")).isEnabled();
		System.out.println(b2);
		
		@SuppressWarnings("unused")
		boolean b3 = driver.findElement(By.id("remember")).isSelected();
		System.out.println(b2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
