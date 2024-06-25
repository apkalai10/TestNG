package com.testSuites;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNgParameter {
	
	//parameters which is used to pass the values in the runtime.
	//parameters are present in the xml file. will read parameters frm the xml file.

	@Test
	@Parameters({"name1","name2"})
	public void Studdetails(String fname, String Mname)
	{
		System.out.println(fname+" "+Mname);
	}

}
