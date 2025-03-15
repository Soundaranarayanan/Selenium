package sele.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
	public static void main(String[]args){
//		ChromeDriver driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOfAllElementLocatedBy());
	    
		ChromeDriver dvr = new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dvr.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement datepick = dvr.findElement(By.id("datepicker"));
		datepick.sendKeys("02/22/2023"+Keys.ENTER);
		dvr.quit();
	    
	}
}
