package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver StartBrowser(String Browsername, String url)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		
		if(Browsername.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		else if(Browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(Browsername.equals("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
