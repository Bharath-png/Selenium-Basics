package com.Selenium.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtablehandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.manage().window().maximize();*/
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowcount = rows.size();
		System.out.println("total rows in web table: "+ rowcount);	
		
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int colcount = cols.size();
		System.out.println("total number of columns are: " +colcount);
		
		String beforexpath = "//*[@id='customers']/tbody/tr[";
		String afterxpath = "]/td[1]";	
		
		for(int i=2; i<=7; i++){
		String actualxpath = beforexpath+i+afterxpath;
		WebElement element = driver.findElement(By.xpath(actualxpath));
		System.out.println(element.getText());
		if(element.getText().equals("Island Trading")) {
			System.out.println("company name : "+ element.getText() + "is found" + "at position : "+ (i-1));
			break;
		}
		}	
		
		System.out.println("*******");
		//*[@id="customers"]/tbody/tr[2]/td[2]
		String afterxpathcontact = "]/td[2]";
		for(int i=2; i<=7; i++) {
			String actualxpath = beforexpath+i+afterxpathcontact;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());	
		}
		System.out.println("*******");
		//*[@id="customers"]/tbody/tr[2]/td[3]
		String afterxpathcountry = "]/td[3]";
		for(int i=2; i<=7; i++) {
			String actualxpath = beforexpath+i+afterxpathcountry;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}{
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		String colbeforexpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String colafterxpath = "]";
		
		System.out.println("column values are: ");
		for(int i=1; i<=colcount; i++) {
	    WebElement element = driver.findElement(By.xpath(colbeforexpath+i+colafterxpath));
	   /* String coltext = element.getText();*/
	    System.out.println(element.getText());
		}}}
	    
	}
		
	
		
		

