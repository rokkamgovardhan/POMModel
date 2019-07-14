package com.tests;

import org.testng.annotations.AfterMethod;

import com.utils.Driver;

public class BaseTest {
	Driver d;
	
	public void intializeDriver() {
		d= new Driver();
		d.createDriver();
	}
	
	@AfterMethod(alwaysRun=true)
	public void driverQuit() {
		d.getDriver().quit();
	}

}
