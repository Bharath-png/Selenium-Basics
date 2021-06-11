package com.Selenium.Basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Sharath\\eclipse-workspace\\SeleniumBasics\\src\\com\\Selenium\\Basics\\Config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("url");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.id(prop.getProperty("userName_id"))).sendKeys(prop.getProperty("UserName"));
		driver.findElement(By.id(prop.getProperty("Password_id"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.name(prop.getProperty("Signin_name"))).click();
		}
		
		
		
		

	}
}
