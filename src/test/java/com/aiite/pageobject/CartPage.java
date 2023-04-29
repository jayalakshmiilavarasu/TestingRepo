package com.aiite.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	
	@FindBy (xpath = "(//*[@class='a-list-item']/descendant::span)[43]")
	private WebElement selectedMobile;

	public WebElement getSelectedMobile() {
		return selectedMobile;
	}
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
