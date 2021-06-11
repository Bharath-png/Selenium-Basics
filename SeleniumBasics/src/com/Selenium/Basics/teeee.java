package com.Selenium.Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class teeee {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//li[@data-cy= 'roundTrip']")).click();
	    	driver.findElement(By.xpath("//div[@data-cy= 'flightTraveller']")).click();
			driver.findElement(By.xpath("//li[@data-cy= 'adults-2']")).click();
			driver.findElement(By.xpath("//li[@data-cy= 'children-1']")).click();
			driver.findElement(By.xpath("//li[@data-cy= 'infants-1']")).click();
			driver.findElement(By.xpath("//li[@data-cy= 'travelClass-2']")).click();
			Thread.sleep(2000);

	}}
