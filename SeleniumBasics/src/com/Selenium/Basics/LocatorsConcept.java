package com.Selenium.Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();*/
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		/*driver.findElement(By.id("fname")).sendKeys("BHARATH GM");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		driver.findElement(By.name("gender")).sendKeys("male");
		driver.findElement(By.className("Performance")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/
		WebElement doubleClick = driver.findElement(By.id("dblClkBtn"));
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleClick).build().perform();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		alert.dismiss();
		
		
	
		
		
		
	
		
	}

}
