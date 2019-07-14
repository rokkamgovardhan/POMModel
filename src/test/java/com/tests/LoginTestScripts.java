package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stepDef.HomePageStepDef;
import com.stepDef.LoginPageSetDef;

public class LoginTestScripts extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() {
		intializeDriver();
	}
	
	@Test
	public void Login() {
		LoginPageSetDef login = new LoginPageSetDef(d);
		HomePageStepDef home = login.Login("Admin", "admin123");
				
	}

}
