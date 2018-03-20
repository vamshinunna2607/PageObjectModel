package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	WebDriver driver;
	
	 public LoginPageNew(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	
	@FindBy(id="user_login") WebElement username;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='user_pass']") WebElement password;
	
	@FindBy(how = How.NAME, using = "wp-submit") WebElement submitButton;
	
	
	public void loginWordPress(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		submitButton.click();
	}
	
}
