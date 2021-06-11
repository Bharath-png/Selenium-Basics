package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class testutil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try {
			reader =new Xls_Reader("C:\\Users\\Sharath\\eclipse-workspace\\SeleniumBasics\\src\\com\\testdata\\halfebaytestdata.xlsx");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int rowNum=2; rowNum<=reader.getRowCount("Regtestdata"); rowNum++) {
			String Username = reader.getCellData("Regtestdata", "Username", rowNum);
			String password = reader.getCellData("Regtestdata", "password", rowNum);
			
		Object ob[] = {Username, password};
		mydata.add(ob);	
			
		}
		return mydata;	
	}
}
