package com.testSuites;

import org.testng.annotations.Test;

public class TestNgdeponMeth {
	
	//dependsOnMethods - if a method depends on other method we use it
	//alwaysRun - if we set true, the method will always execute even its depending method fail.
	
	@Test(enabled = false)
	public void A()
	{
		System.out.println("A");
	}
	@Test
	public void B()
	{
		System.out.println("B");
	}
	@Test
	public void C()
	{
		System.out.println("C");
	}
	@Test(dependsOnMethods = {"A","B"},alwaysRun = true)
	public void D()
	{
		System.out.println("D");
	}

}
