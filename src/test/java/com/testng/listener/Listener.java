package com.testng.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("======> The test has started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("The test step has failed");
		Reporter.log("<a href=\"https://es.khanacademy.org\" target=/\"_blank/\"> Link to the error! </a>");
		Reporter.log("<img src=\"/home/jesus/workspace/TestNGProject/test-output/failed.png\">");
		
		System.out.println("======> The test has failed, Take a picture: " + result.getTestClass());
		System.out.println("======> The test has failed, in the method: " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
	}

}
