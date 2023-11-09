package Abstractcomponent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Ereports {

	public static ExtentReports repo = new ExtentReports();
	
	public ExtentReports Demo() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		 reporter.config().setReportName("New Test");
		 reporter.config().setDocumentTitle("Test");
		 repo.attachReporter(reporter);
		 return repo;
		 
		 
		 
		 
		 
		 
		 
}
}
