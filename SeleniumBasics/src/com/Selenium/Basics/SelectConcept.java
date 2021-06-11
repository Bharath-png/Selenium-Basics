package com.Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		/*driver.findElement(By.id("fname")).sendKeys("BHARATH GM");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		driver.findElement(By.name("gender")).sendKeys("male");
		driver.findElement(By.className("Performance")).click();
		Select select = new Select (driver.findElement(By.id("testingDropdown")));
		select.selectByVisibleText("Manual Testing");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/
		
		
		
		WebElement textbox =driver.findElement(By.id("fname"));
		Highlighter(driver, textbox);
		textbox.sendKeys("bharathgm");
		

	}

	private static void Highlighter(WebDriver driver, WebElement textbox) {
		// TODO Auto-generated method stub
		
	}

}
