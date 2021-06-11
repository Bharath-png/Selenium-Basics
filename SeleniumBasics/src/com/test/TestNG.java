package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	public void setup() {
		System.out.println("setup system property for chrome");
	}
	@BeforeTest 
	public void launchbrowser() {
		System.out.println("launch the browser");
	}
	@BeforeClass
	public void signinapp() {
		System.out.println("sig in app");
	}
	@BeforeMethod
	public void enterurl() {
		System.out.println("enter url");
	}
	
	
	@Test
	public void googletitletest() {
		System.out.println("google title test");
		
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");	
	}
	@AfterTest
	public void deletallcokies() {
		System.out.println("delet all cokies");
	}
	@AfterClass
	public void clsoethebrowser() {
		System.out.println("clsoe the browser");
	}
	
	
	
	

}
