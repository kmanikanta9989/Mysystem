package com.sample.testng;
import org.testng.annotations.*;


public class SampleTestNG3
{
	@BeforeMethod
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
	@AfterMethod
	public void logout()
	{
		System.out.println("logout method");
	}

}
