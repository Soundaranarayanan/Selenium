package com.test.basics;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import static org.testng.Assert.assertEquals;
import org.testng.asserts.SoftAssert;
 
public class Practice {
	public WebDriver dvr ;
  @Test
  public void verifyTitle() {
	  dvr.findElement(By.xpath("//a[@class='dropdown-toggle']/i")).click();
	  dvr.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a")).click();
	  String actual =  dvr.findElement(By.xpath("//div[@id='content']/h1")).getText();
	    String expected = "Register Account1";
//	  Assert.assertEquals(actual, expected);
	  
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(actual,expected,"Incorrect Page Title");
	 
	  dvr.findElement(By.xpath("//a[text() = 'Qafox.com']")).click();
	  String actualtitle ="Your Store";
	  String expectedTitle = dvr.getTitle();
	  Assert.assertEquals(actualtitle, expectedTitle);
	 
	 soft.assertAll();
  }
  @BeforeTest
  public void setup() {
	  dvr = new ChromeDriver();
	  dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dvr.manage().window().maximize();
	  dvr.get("https://tutorialsninja.com/demo/");
  }

  @AfterTest
  public void teardown() {
	  dvr.quit();
  }

}
