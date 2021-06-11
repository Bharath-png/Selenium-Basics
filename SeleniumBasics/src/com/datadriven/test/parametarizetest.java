package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class parametarizetest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
Xls_Reader reader = new Xls_Reader("C:\\Users\\Sharath\\eclipse-workspace\\SeleniumBasics\\src\\com\\testdata\\halfebaytestdata.xlsx");
	int	rowcount = reader.getRowCount("Regtestdata");
	
	reader.addColumn("Regtestdata", "status");
	for(int rownum = 2; rownum<=rowcount; rownum++) {
	System.out.println("======");
	String Username = reader.getCellData("Regtestdata", "Username", rownum);
	System.out.println(Username);
		
	String password = reader.getCellData("Regtestdata", "password", rownum);
	System.out.println(password);
	
    driver.findElement(By.id("login1")).clear();
	driver.findElement(By.id("login1")).sendKeys(Username);
		
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(password);
		
	reader.setCellData("Regtestdata", "status", rownum, "pass");
		
		
		
		
		}
	}

}
