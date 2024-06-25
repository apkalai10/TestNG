package com.testSuites;

import org.testng.annotations.Test;

public class TestNgDataprovider {

	//DataProvider is like a container that passes the data to our test method.
	//if we want to test a test case with multiple test data.
	//it will return a 2d array of an object.
	@Test(dataProvider = "loginData",dataProviderClass = Datasets.class)
	public void data(String username, String password)
	{
		System.out.println(username+" "+password);
	}
}
