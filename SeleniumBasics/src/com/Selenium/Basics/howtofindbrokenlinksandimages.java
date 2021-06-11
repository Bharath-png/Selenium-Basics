
package com.Selenium.Basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class howtofindbrokenlinksandimages {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("size of full links and images---->"+linklist.size());
		
		List<WebElement> activelinks= new ArrayList<WebElement>();
		
		//2. iterate linklist : exclude all the links/images - doesnt have any href attribute
		for(int i=0; i<linklist.size(); i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href") != null && (!linklist.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(linklist.get(i));	
			}
		}
		System.out.println("size of active links and images---->"+activelinks.size());
		
		//3. check the herf url, with httpconnection api:
		//200---ok
		//404---not found
		//500---internal eror
		//400---bad request
		for(int j=0; j<activelinks.size(); j++) {
			
		HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			
		connection.connect();
		String response = connection.getResponseMessage();//ok
		connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("herf")+"----->"+response);			
		}
	}	
		
	}


