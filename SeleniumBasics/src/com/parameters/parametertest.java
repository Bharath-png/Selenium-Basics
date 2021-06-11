package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {
	WebDriver driver;
	
	@Test
	@Parameters({ "url","Username","Password" })
	public void redifflogintest(String url, String Username, String Password) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("Username");
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Password");
		
		}}
