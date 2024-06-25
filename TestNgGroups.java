package com.testSuites;

import org.testng.annotations.Test;

public class TestNgGroups {
	
	//groups - used to group the different test methods that belong to the same functionality.
	//dependsOnGroups - its depends on single group or multiple groups.
	@Test(groups = {"tata"})
	public void Apple()
	{
		System.out.println("Tata Consultancy Services");
	}
	@Test ()
	public void Dog()
	{
		
	}
	@Test(groups = {"hcl"})
	public void Sun()
	{
		System.out.println("HCL");
	}
	@Test(groups= {"tata"})
	public void Beta()
	{
		System.out.println("Tata Communication");
	}
	@Test(dependsOnGroups = {"tata","hcl"})
	public void Xray()
	{
		System.out.println("TATAHCL");
	}

}
