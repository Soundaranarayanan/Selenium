package com.test.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
 
public class assertDemo {
	public WebDriver dvr ;
  @Test
  public void verifyTitle() {
	  String expectedTitle = "Google";
	  String actualTitle= dvr.getTitle();
	  assertEquals(actualTitle, expectedTitle,"Title is not same");
  }
  @BeforeTest
  public void setup() {
	  dvr = new ChromeDriver();
	  dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dvr.manage().window().maximize();
	  dvr.get("https://google.co.in");
  }

  @AfterTest
  public void teardown() {
	  dvr.quit();
  }

}
