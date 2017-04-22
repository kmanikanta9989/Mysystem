package com.sample.testng;

import org.testng.annotations.Test;

public class GroupTests 
{
  @Test (groups = {"sanity"})
  public void A() 
  {
	  System.out.println("class A");
  }
  @Test (groups = {"regression"})
  public void B() 
  {
	  System.out.println("class B");
  }
  @Test (groups = {"sanity"})
  public void C() 
  {
	  System.out.println("class C");
  }
  @Test (groups = {"regression"})
  public void D() 
  {
	  System.out.println("class D");
  }
  @Test (groups = {"sanity","regression"})
  public void E()
  {
	  System.out.println("class E");
  }
}
