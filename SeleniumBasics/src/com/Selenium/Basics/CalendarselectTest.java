package com.Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarselectTest {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/r.php");
		    driver.findElement(By.name("firstname")).sendKeys("bharath");
		    driver.findElement(By.name("lastname")).sendKeys("G M");
		    driver.findElement(By.name("reg_email__")).sendKeys("9663808105");
		    driver.findElement(By.name("reg_passwd__")).sendKeys("9663808105");
		    Thread.sleep(3000);
		    Select select = new Select(driver.findElement(By.id("day")));
		    select.selectByValue("31");
		    Select Select = new Select(driver.findElement(By.id("month")));
		    Select.selectByVisibleText("Jul");
		    Select Select1 = new Select(driver.findElement(By.id("year")));
		    Select1.selectByValue("2019");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@value= '2']")).click();
		}}
	
		
		
		
		
