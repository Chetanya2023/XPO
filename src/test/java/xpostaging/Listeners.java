package xpostaging;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import Abstractcomponent.Ereports;


public class Listeners implements ITestListener {

	ExtentReports repo = new ExtentReports();
	
	public void onTestStart(ITestResult result) {
		repo.createTest("ppp");
		
		
	}
}
