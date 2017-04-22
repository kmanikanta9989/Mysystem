package com.sample.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG4 
{
	@BeforeClass
	public void login()
	{
		System.out.println("login method");
	}
	@Test (priority=2,description = "search functionlatiy" , enabled = true)
	public void search()
	{
		System.out.println("search method");
	}
	@Test (priority=3,description = "Advanced search funcationlity" , enabled = true)
	public void advancedSearch()
	{
		System.out.println("Advnaced search method");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logout method");
	}
}
