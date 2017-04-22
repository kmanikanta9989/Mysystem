package com.sample.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class SampleTestNG 
{
	@Test
	public void verifyPageTitle()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sys\\Desktop\\Selenium\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actulTitle = driver.getTitle();
		String expectTitle = "Google";
		Assert.assertEquals(actulTitle, expectTitle);
		
		
	}

}
