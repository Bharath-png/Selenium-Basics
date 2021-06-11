package com.r;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBtest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void fbtitletest1() {
		String title = driver.getTitle();
		System.out.println("title of the page is: "+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	@Test
	public void fbtitletest2() {
		String title = driver.getTitle();
		System.out.println("title of the page is: "+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	@Test
	public void fbtitletest3() {
		String title = driver.getTitle();
		System.out.println("title of the page is: "+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
