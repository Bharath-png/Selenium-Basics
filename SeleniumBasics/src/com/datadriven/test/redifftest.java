package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.testutil;

public class redifftest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	@DataProvider
	public Iterator<Object[]> gettestdata(){
		ArrayList<Object[]> testdata = testutil.getDataFromExcel();
		return testdata.iterator();	
	}
	
	@Test(dataProvider="gettestdata")
	public void redifflogintest(String Username, String password) {
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("login1")).sendKeys(Username);
			
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
}
