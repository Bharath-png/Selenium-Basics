package com.test;

import org.testng.annotations.Test;

public class TestNGde {
	@Test()
	public void logintest() {
		System.out.println("logintest");
		/*int i= 9/0;*/
	}
   @Test(dependsOnMethods="logintest")
	public void homepage() {
	   System.out.println("homepage");
   }
	@Test(dependsOnMethods="logintest")
	public void searchpage() {
		System.out.println("searchpage");
		
	}
	
	
	
	
	
	
	
	
}
