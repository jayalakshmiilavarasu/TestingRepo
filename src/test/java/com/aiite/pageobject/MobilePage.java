package com.aiite.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
	
	@FindBy(linkText = "OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)")
	private WebElement onepluseNordMobileSelect;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addcart;
	
	
	public WebElement getGoToCart() {
		return goToCart;
	}

	@FindBy(id="nav-cart")
	private WebElement goToCart;

//	private By onepluseNordMobileSelect = By.linkText("OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)");
//	private By addcart = By.id("add-to-cart-button");
	
	public WebElement getOnepluseNordMobileSelect() {
		return onepluseNordMobileSelect;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	
	public MobilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
