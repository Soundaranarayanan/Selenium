package com.test.basics;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testAssertions {
	
  @Test
  public void f() {
	  String str1 = new String("TestNG");
	  String str2 = new String("TestNG");
	  String str3 = null;
	  String str4 = "TestNG"; 
	  String str5 = "TestNG";
	  String str6 = new String("Not_TestNG");
	 
	  int val1 = 5;
	  int val2 = 6;
	  Assert.assertEquals(str1, str2);
	  System.out.println("Equals Assertion is successful");
	  
	  Assert.assertNotEquals(str1, str6);
	  System.out.println("NotEquals Assertion is successful");
	  
	  Assert.assertTrue(val1 < val2);
	  System.out.println("true Assertion is successful");
	  
	  Assert.assertFalse(val1 > val2);
	  System.out.println("False Assertion is successful");
	  
	  Assert.assertNotNull(str1);
	  System.out.println("Not Null Assertion is successful");
	  
	  Assert.assertNull(str3);
	  
	  Assert.assertSame(str4, str5);
	  System.out.println("same Assertion is successful");
	  
	  Assert.assertNotSame(str1, str3);
	  System.out.println("Not Same Assertion is successful");
	  
	  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {

  }

  
  
}
