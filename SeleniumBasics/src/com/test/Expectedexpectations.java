package com.test;

import org.testng.annotations.Test;

public class Expectedexpectations {

	@Test(expectedExceptions=NumberFormatException.class)
	public void test() {
		String x = "100A";
		Integer.parseInt(x);
		
	}
	
	
	
	
}
