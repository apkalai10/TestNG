package com.testSuites;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestNgAttributes {
	
	//description - which is used to describe the information about the test method
	//timeOut - which is used set the time period for the test method to complete its execution within specified timeline.
	
	@Test(description = "Sql",timeOut = 600)
	public void DataMining()
	{
		
	}
	
	//enabled - it accepts argument as a boolean value, if false - skip the test method. default value is true
	@Test(enabled = false)
	public void Angular()
	{
		
	}
	//invocationCount - which is used to execute a  test method given number of time. act like a loop.
	//invocationTimeOut - max no of milliseconds and invocationCount should take
	@Test(invocationCount = 3,invocationTimeOut = 600)
	public void Csharp()
	{
		
	}
	//expectedExceptions - which is used the exception and compare the specified exception and thrown exception
	//expectedExceptionMessageRegExp - which is used to compare exception message.
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class}, expectedExceptionsMessageRegExp = ".* not .*")
	public void Bootstrap() throws IOException
	{
		throw new NullPointerException("data not valid");
	}

}
