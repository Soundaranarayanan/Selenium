package sele.selenium;


import java.time.Duration;

import java.util.NoSuchElementException;

import java.util.function.Function;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization1 {
		public static void main(String[] args) throws InterruptedException {
//			WebDriver drive = new ChromeDriver();
//			WebDriverWait wait = new WebDriverWait(drive,Duration.ofSeconds(5));
//
//			drive.get("https://www.selenium.dev/selenium/web/dynamic.html");
//			drive.manage().window().maximize();
//			WebElement reveal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#reveal")));
//			reveal.click();
//			WebElement revealtext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#revealed")));
//			revealtext.sendKeys("Soundar"+Keys.ENTER);
//			System.out.println("Text of reveal text box : "+revealtext.getDomProperty("value"));
//			drive.close();
			
			WebDriver dvr = new ChromeDriver();

			dvr.manage().window().maximize();

			dvr.get("https://www.rediff.com/");

			dvr.findElement(By.xpath("//div[@class=\"toplinks\"]//a[2]")).click();

			Wait<WebDriver> wait = new FluentWait<WebDriver>(dvr)

					.withTimeout(Duration.ofSeconds(15))

					.pollingEvery(Duration.ofSeconds(1))

					.ignoring(NoSuchElementException.class);

			WebElement BSE = wait.until(new Function<WebDriver , WebElement>(){

				public WebElement apply(WebDriver dvr) {

					return dvr.findElement(By.cssSelector(".hmbseindicestable>ul:nth-child(2)>li:nth-child(2)"));

				}

				

			});

			String msg = BSE.getText();

			System.out.println(msg);

			dvr.close();
			
			
	}

}