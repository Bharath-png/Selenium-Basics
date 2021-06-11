package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excel.utility.Xls_Reader;

@Test
public class Makemytriptest {
	
	WebDriver driver;
	
	@BeforeMethod 
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
	}
	
		public void mytriptest() throws InterruptedException {
		WebElement round= driver.findElement(By.xpath("//li[@data-cy= 'roundTrip']"));
		round.click();
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).sendKeys("Bengaluru International Airport");
		
		driver.findElement(By.xpath("//p[@class= 'font12 greyText appendBottom3']")).click();
		
        driver.findElement(By.xpath("//*[@id=\"toCity\"]")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//p[@class= 'font12 greyText appendBottom3']")).click();
        
        driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
        
        driver.findElement(By.xpath("//div[@class= 'DayPicker-Day'] [contains(@aria-label, 'Tue May 11 2021')]")).click();
        
        /*driver.findElement(By.xpath("//div[@class=\"hsBackDrop\"]")).click();*/
        
        
        
        driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).click();
        
        driver.findElement(By.xpath("//div[@class='DayPicker-Day'] [contains(@aria-label, 'Wed Jun 02 2021')]")).click();
        
		driver.findElement(By.xpath("//div[@data-cy= 'flightTraveller']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy= 'adults-2']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy= 'children-1']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy= 'infants-1']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy= 'travelClass-2']")).click();
		
		driver.findElement(By.xpath("//button[@data-cy= 'travellerApplyBtn']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Search')]")).click();
		List<WebElement>list=driver.findElements(By.xpath("//label[@class='splitViewListing  ']"));
		System.out.println("total number of flights are:  " +list.size());
			
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
}
}