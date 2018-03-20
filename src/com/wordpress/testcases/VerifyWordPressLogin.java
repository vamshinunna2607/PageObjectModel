/**
 * 
 */
package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

/**
 * @author vamshi
 *
 */
public class VerifyWordPressLogin {
	
	@Test
	public void verifyValidLogin()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		LoginPage login = new LoginPage(driver);
		login.typeUsername();
		login.typePassword();
		login.clickLoginButton();
		driver.quit();
	}

}
