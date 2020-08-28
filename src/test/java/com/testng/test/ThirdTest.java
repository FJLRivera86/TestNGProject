package com.testng.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ThirdTest {
	//Detect the Assert but allow the test to continue 
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("- Opening browser");
	}
	
	@Test (priority = 1, groups = "HappyPath")
	public void login() {
		System.out.println("- Hello");
		
		String expectedTitle = "pageName";
		String currentTitle = "pageName";
		
		softAssert.assertEquals(currentTitle, expectedTitle);
		//Assert.assertEquals(currentTitle, expectedTitle);
		
		softAssert.assertAll();
	}
	
	@Test (priority = 2, groups = "Alternative")
	public void actionsInside() {
		System.out.println("- Step 1");
		System.out.println("- Step 2");
		System.out.println("- Step 3");
		//Assert.assertTrue(false);
		softAssert.assertTrue(true);
		System.out.println("- Step 4");
		System.out.println("- Step 5");
		System.out.println("- Step 6");
		softAssert.assertAll();
	}
	
	@Test (priority = 3, groups = "Exceptional")
	public void logout() {
		System.out.println("- Bye");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("- Closing");
	}
	
}
