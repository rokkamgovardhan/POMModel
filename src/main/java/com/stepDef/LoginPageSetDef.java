package com.stepDef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.objectRepository.Variables;
import com.utils.Driver;

import bsh.Variable;

public class LoginPageSetDef extends BasePage{
	
	WebElement userName,password1,login ;
	
	@FindBy(css="input#txtUsername")
	WebElement userName1;
	public LoginPageSetDef(Driver driver) {
		super(driver);
		PageFactory.initElements(driver.getDriver(), this);
		driver.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		userName = driver.getDriver().findElement(Variables.usernamr_txt_login);
		password1 = driver.getDriver().findElement(Variables.password_txt_password);
		login = driver.getDriver().findElement(Variables.submit_btn_login);
		
	}

	public HomePageStepDef Login(String name,String password) {
		
		type(userName1,name);
		type(password1,password);
		login.click();
		return new HomePageStepDef(driver);
	}
	
	 
	
	
}
