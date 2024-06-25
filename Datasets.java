package com.testSuites;

import org.testng.annotations.DataProvider;

public class Datasets {
	
	@DataProvider(name="loginData")
	public Object[][] rawData()
	{
		
		  /*Object[][] logindata = new Object[2][2]; 
		  logindata[0][0] = "aravinthprasath3"; 
		  logindata[0][1] = "Acs@123";
		  logindata[1][0] = "aravinthprasath4"; 
		  logindata[1][1] = "Acs@321";*/
		 
	
		 return new Object[][]
		 { 
			{"aravinthprasath3","Acs@123"},
			{"aravinthprasath4","Acs@321"} 
			
		 };
			 
	}
	
}
