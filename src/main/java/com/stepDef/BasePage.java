package com.stepDef;

import org.openqa.selenium.WebElement;

import com.utils.Driver;

public class BasePage {

	Driver driver;
	public BasePage(Driver driver) {
		this.driver = driver;
	}
	
	public void type(WebElement ele,String type) {
		ele.sendKeys(type);
	}
}
