package com.aiite.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassUtils {

	public static WebDriver driver;
	
	public void initDriver() {	
        System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
//	public void clickButton(By locater) {
//		driver.findElement(locater).click();
//	}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	public void getStringText(WebElement element) {
		element.getText();
	}
	
	public void handelMultipleWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<>();
		listwindow.addAll(windowHandles);
		String string = listwindow.get(index);
		driver.switchTo().window(string);
	}
	
	
}
