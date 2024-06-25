package com.testSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgParallelExe {
    
	
	//parallel - is a process where multiple tests are executed simultaneously/parallel in diff thread count
	//parallel execution of test methods,classes,suites.
	//thread-count - allow to specify how many threads should be run for this execution
	@Test
	public void Amazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void Flipkart()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	
	
}
