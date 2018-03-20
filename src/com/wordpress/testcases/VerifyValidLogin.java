package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPageNew;

import utility.BrowserFactory;

public class VerifyValidLogin {
	
	
	@Test
	public void checkvaliduser()
	{
		WebDriver driver = BrowserFactory.StartBrowser("firefox","https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		LoginPageNew login = PageFactory.initElements(driver, LoginPageNew.class);
		login.loginWordPress("opensourcecms", "opensourcecms");
	}

}
