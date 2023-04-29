package com.aiite.execution;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aiite.pageobject.CartPage;
import com.aiite.pageobject.HomePage;
import com.aiite.pageobject.MobilePage;
import com.aiite.report.utils.ExtentManager;
import com.aiite.utils.BaseClassUtils;
import com.aventstack.extentreports.Status;



public class MobileOrder extends BaseClassUtils{
	
	
	@BeforeClass
	public static void beforeclass() {
		ExtentManager.getExtentReportInstance();
	}
	
	@Before
	public void before(){
		initDriver();
		getUrl("https://www.amazon.in/");
		
	}
	
	@Test
	public void mobileOrder() {
		ExtentManager.createTest("Mobile Order");
		try {
			HomePage homePage = new HomePage(driver);
			MobilePage mobilePage = new MobilePage(driver);
			clickButton(homePage.getMobile());
			clickButton(mobilePage.getOnepluseNordMobileSelect());
			handelMultipleWindow(1);
			clickButton(mobilePage.getAddcart());
			Thread.sleep(5000);
			clickButton(mobilePage.getGoToCart());
			CartPage cart = new CartPage(driver);
			Assert.assertEquals(cart.getSelectedMobile(), "OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)");
			ExtentManager.test.log(Status.PASS, "Mobile is added to Cart");
		} catch (Exception e) {
			ExtentManager.test.log(Status.FAIL, e.fillInStackTrace());
		}

		
	}

//	public static void main(String[] args) {
//		MobileOrder mobileOrder = new MobileOrder();
//		mobileOrder.initDriver();
//		mobileOrder.getUrl("https://www.amazon.in/");
//		HomePage homePage = new HomePage(mobileOrder.driver);
//		MobilePage mobilePage = new MobilePage(mobileOrder.driver);
//		mobileOrder.clickButton(homePage.getMobile());
//		
//		mobileOrder.clickButton(mobilePage.getOnepluseNordMobileSelect());
//		mobileOrder.handelMultipleWindow(1);
//		mobileOrder.clickButton(mobilePage.getAddcart());
//		
//	}
	
	@AfterClass
	public static void afterClass() {
		ExtentManager.flushReport();
	}
	
}
