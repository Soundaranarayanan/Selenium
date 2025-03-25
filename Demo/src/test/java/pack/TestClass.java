package pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestClass {
	WebDriver dvr ;
	
  @Test(dataProvider = "testData" , dataProviderClass = Dataprovider.class)
  public void search(String keytxt) {
	  WebElement txtBox = dvr.findElement(By.id("sb_form_q"));
	  txtBox.sendKeys(keytxt);
	  System.out.println("The entered text : "+keytxt);
	  txtBox.sendKeys(Keys.ENTER);
	  System.out.println("searching te result");	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("test is started");
	  dvr= new ChromeDriver();
	  dvr.manage().window().maximize();
	  dvr.get("https://www.bing.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  dvr.quit();
	  System.out.println("Ending the test");
  }

}