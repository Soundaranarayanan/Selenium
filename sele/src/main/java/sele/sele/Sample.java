package sele.sele;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.relianceretail.com/reliance-market.html");
System.out.println("title:"+driver.getTitle());
        //WebElement element1_2=driver.findElement(By.cssSelector("ul[class=\"brand-list\"] li:nth-of-type(5) a"));
        //WebElement element1_3=driver.findElement(By.cssSelector("//ul[@class=\"brand-list\"]//a[ends-with(text(), 'JioMart')]\r\n"));
       
     
		/*
		 * WebElement element2=driver.findElement(By.cssSelector(
		 * "a[href=\"http://www.jiomart.com\"]")); element2.click();
		 * 
		 * WebElement
		 * element3=driver.findElement(By.className("class=\"artdeco-icon lazy-loaded\""
		 * )); element3.clear();
		 * 
		 * WebElement element4=driver.findElement(By.id("btn_pin_code_delivery"));
		 * element4.clear();
		 */
    
}
}
