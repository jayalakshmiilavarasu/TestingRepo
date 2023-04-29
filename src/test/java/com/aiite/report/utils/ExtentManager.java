package com.aiite.report.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	
	public static String filePath = System.getProperty("user.dir")+ "/Report/JunitExtentReport.html";
	
	public static ExtentSparkReporter spark = null;
	
	public static ExtentReports extent = null;
	
	public static ExtentTest test = null;
	
	public static ExtentReports getExtentReportInstance() {
		
		if(extent == null) {
			extent = createExtentReports();
		}
		
		return extent;
	}
	
	public static ExtentReports createExtentReports() {
		
		spark = new ExtentSparkReporter(filePath);
		spark.config().setDocumentTitle("Junit");
		spark.config().setReportName("Junit Exent Report");
		spark.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Instute Name", "AIITE Technologies");
		extent.setSystemInfo("Batch Name", "Feb Project 2");
		extent.setSystemInfo("Trainer Name", "Dinesh Kumar");
		extent.setSystemInfo("Timing", "9:00 AM IST");
		
		return extent;
		
	}
	
	public static ExtentTest createTest(String testName) {
		
		test = extent.createTest(testName);
		return test;	
	}
	
	public static void flushReport() {
		extent.flush();
	}
	
	
}
