package com.testSuites;


public class TestNgAnnotation {
	
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@org.testng.annotations.Test
	public void Test()
	{
		System.out.println("Test");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}



}
