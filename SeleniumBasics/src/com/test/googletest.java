package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletest {
	
	WebDriver driver;

@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
}
	@Test(priority=3,groups="a")
	public void googletitletest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
		
	@Test(priority=1,groups="b")
	public void googlelogotest() {
		Boolean b = driver.findElement(By.xpath("//img[@title= 'Get Vaccinated. Wear a mask. Save Lives.']")).isDisplayed();
	}
	@Test(priority=2,groups="c") 
	public void maillinktest() {
		boolean b = driver.findElement(By.xpath("//a[@class = 'gb_g']")).isDisplayed();
	}
	@Test(priority=4,groups="a")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5,groups="b")
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority=6,groups="c")
	public void test3() {
		System.out.println("test3");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}