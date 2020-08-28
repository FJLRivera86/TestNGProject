package com.testng.baseExecution;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Actions {
	
	@BeforeSuite
	public void executeBeforeSuite() {
		System.out.println("/******** Actions executed before the test suite. E.G. Clear Cookies********/");
	}
	
	@AfterSuite
	public void executeAfterSuite() {
		System.out.println("/******** Actions executed after the test suite. E.G. Run SQL queries to delete data ********/");
	}

}
