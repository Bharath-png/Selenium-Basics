package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class Exceloperations {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Sharath\\eclipse-workspace\\SeleniumBasics\\src\\com\\testdata\\halfebaytestdata.xlsx");
		
		reader.addSheet("bharathworktest");
		if(reader.isSheetExist("bharathworktest")) {
			reader.addSheet("bharathworktest");
		}
		int colcount = reader.getColumnCount("Regtestdata");
		System.out.println("total columns present in Regtestdata sheet:====" + colcount);
		System.out.println(reader.getCellRowNum("Regtestdata", "Username", "cellValue"));
		
		

	}

}
