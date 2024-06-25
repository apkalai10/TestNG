package com.testSuites;

import org.testng.annotations.Test;

public class TestNgPriority {
	
	//Priority usually testng will run the test cases in alphabetical order
	//but priority which is used to define the order of execution
	@Test(priority = -1)
	public void Apple()
	{
		
	}
	@Test (priority = 2)
	public void Dog()
	{
		
	}
	@Test(priority = 3)
	public void Sun()
	{
		
	}
	@Test(priority = 0)
	public void Beta()
	{
		
	}

}
