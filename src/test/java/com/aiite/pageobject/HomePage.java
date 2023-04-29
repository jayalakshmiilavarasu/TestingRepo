package com.aiite.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText = "Mobiles")
	private WebElement mobile;
	
	@FindBy(tagName = "tr")
	private List<WebElement> tablerow;
	
//	private By mobile = By.linkText("Mobiles");

	public WebElement getMobile() {
		return mobile;
	}
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
