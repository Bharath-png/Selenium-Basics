package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class Datadriventest {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Sharath\\eclipse-workspace\\SeleniumBasics\\src\\com\\testdata\\halfebaytestdata.xlsx");
		
		String Username = reader.getCellData("Regtestdata", "Username", 2);
		System.out.println(Username);
		
		String password = reader.getCellData("Regtestdata", "password", 2);
		System.out.println(password);
		
			
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys(Username);
	driver.findElement(By.id("password")).sendKeys(password);
	
	
		
		

	}

}
