package com.sample.testng;

import org.testng.annotations.*;
import org.testng.Assert;

public class SampleTestNG2 
{
   @BeforeClass
   public void login()
   {
	   System.out.println("login method");
   }
   @Test (enabled = true)
   public void methodB()
   {
	   System.out.println("Second method");
	   Assert.assertEquals("abc", "xyz");
   }
   @Test (dependsOnMethods = {"methodB"},alwaysRun= true)
   public void methodC()
   {
	   System.out.println("Third method");
   }
   @Test (dependsOnMethods = {"methodC"})
   public void methodD()
   {
	   System.out.println("fourth method");
   } 
   @AfterClass
   public void logout()
   {
	   System.out.println("logout method");
   }
}
