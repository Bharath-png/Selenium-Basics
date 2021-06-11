package com.Selenium.Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(4000);
		alert.accept();//accept the alert popup
		alert.dismiss();//cancel the alert
	
		/*driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();//accept the alert popup
		alert.dismiss();//cancel the alert
		*/
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();//accept the alert popup
		alert.dismiss();//cancel the alert
		*/
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
