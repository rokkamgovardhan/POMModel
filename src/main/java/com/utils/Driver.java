package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	
	public WebDriver getDriver() {
		return driver.get();
	}


	public void setDriver(ThreadLocal<WebDriver> driver) {
		this.driver = driver;
	}


	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resoucrces\\chromedriver.exe");
		driver.set(new ChromeDriver());
	}
	
}
