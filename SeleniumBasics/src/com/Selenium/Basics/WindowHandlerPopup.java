package com.Selenium.Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerPopup {

	public static void main(String[] args, Object Parentid) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		/*Set<String> handler = driver.getWindowHandles();
		Iterator iterators = handler.iterator();
		while (iterators.hasNext()) {
			String childid = (String) iterators.next();
			if(!Parentid.equals(childid)) {
		}*/
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentwindowid = it.next();
		System.out.println("parent window id:"+ parentwindowid);
		
		String childwindowid = it.next();
		System.out.println("child window id:"+ childwindowid);
		
		driver.switchTo().window(childwindowid);
		
		Thread.sleep(3000);
		System.out.println("child window pop up title"+driver.getTitle());
		driver.findElement(By.name("emailid")).sendKeys("bharathgm2018automation@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		Thread.sleep(4000);
		System.out.println("parent window pop up title"+driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
		
		
		
		
	}

}
