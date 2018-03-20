package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class all the locators and methods of this page 

public class LoginPage {

	WebDriver driver;
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.name("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public void typeUsername()
	{
		driver.findElement(username).sendKeys("opensourcecms");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("opensourcecms");
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
}
