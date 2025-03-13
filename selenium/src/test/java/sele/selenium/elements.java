package sele.selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.*;
public class elements { 
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
//		WebDriver dvr = new ChromeDriver();
//		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		dvr.manage().window().maximize();
//		dvr.get("https://www.naukri.com");
//		WebElement search_job = dvr.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[1]/a"));
//		String text = search_job.getText();
//		System.out.println("Text : "+text);
//		String attribute = search_job.getAttribute("href");
//		System.out.println("href attributes : "+attribute);
//		String color = search_job.getCssValue("color");
//		System.out.println("Css Color : "+color);
//		int x = search_job.getLocation().getX();
//		int y = search_job.getLocation().getY();
//		System.out.println("X :"+x+"\nY : "+y);
//		int width = search_job.getSize().getWidth();
//		int height = search_job.getSize().getHeight();
//		System.out.println("Size:Width : "+width+" Size:height : "+height);
//		dvr.quit();
//		WebDriver dvr = new ChromeDriver();
//		dvr.get("https://www.flipkart.com");
//		
//		WebElement one5=dvr.findElement(By.xpath("//*[@class='Pke_EE']"));
//		one5.sendKeys("safari bag"+Keys.ENTER);
//		dvr.quit();
//		WebDriver dvr1 = new ChromeDriver();
//		
		//dvr1.get("https://www.amazon.com");
//		  WebElement searchBox = dvr.findElement(By.name("q"));
//		  System.out.println("Search box displayed: " + searchBox.isDisplayed());
//	        System.out.println("Search box enabled: " + searchBox.isEnabled());
	 //   dvr.get("https://www.w3schools.com/html/html_forms.asp");
	 //   dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); // Reduce to 2 seconds

	      //  WebElement checkbox = dvr.findElement(By.name("vehicle1"));
//	        System.out.println("Checkbox displayed: " + checkbox.isDisplayed());
//	        System.out.println("Checkbox enabled: " + checkbox.isEnabled());
//	        System.out.println("Checkbox selected: " + checkbox.isSelected());
//	        checkbox.click();
//	        System.out.println("Checkbox selected: " + checkbox.isSelected());
//	        
//	        System.out.println("Page Title: " + dvr.getTitle());
//	        System.out.println("Current URL: " + dvr.getCurrentUrl());
//	        
	        
//	        WebElement searchBox = dvr.findElement(By.name("q"));
//
//	
//
//	        System.out.println("Search Box Placeholder: " + searchBox.getAttribute("title"));
//
//	        searchBox.sendKeys("Selenium WebDriver");
//
//	        System.out.println("Entered Text: " + searchBox.getAttribute("value"));
//
//	        System.out.println("Page Title: " + dvr.getTitle());
//       System.out.println("Current URL: " + dvr.getCurrentUrl());
//	        searchBox.clear();


	    	//.quit();
		
		
		
	
// 
//		WebElement searchBox = dvr.findElement(By.cssSelector("input.Pke_EE"));
//		System.out.println("Search box is displayed:"+searchBox.isDisplayed());
//		System.out.println("Search box is displayed:"+searchBox.isEnabled());
//		searchBox.sendKeys("mobile");
//		searchBox.sendKeys(Keys.ENTER);
//		
//		
//	
//		WebElement link = dvr.findElement(By.cssSelector("div.KzDlHZ"));
//		link.click();
		
	
	
//		        WebDriver driver = new ChromeDriver();
//		        driver.manage().window().maximize();
//		        driver.get("https://www.example.com");
//		        WebElement startElement = driver.findElement(By.xpath("//input[starts-with(@id, 'user')]"));
//		        startElement.sendKeys("StartsWith Test");
//	        WebElement endElement = driver.findElement(By.xpath("//input[contains(@id, 'name')]"));
//		        endElement.sendKeys("EndsWith Test");
//
//		        WebElement startCss = driver.findElement(By.cssSelector("input[id^='user']"));
//		        startCss.sendKeys("CSS StartsWith Test");
//
//		
//		        WebElement endCss = driver.findElement(By.cssSelector("input[id$='name']"));
//		        endCss.sendKeys("CSS EndsWith Test");
//
//		driver.quit();
//	
//	WebDriver dvr = new ChromeDriver();
//		dvr.get("https://www.whatsappweb.com");
//	    Robot robot = new Robot();
//	    Dimension scr_size = Toolkit.getDefaultToolkit().  getScreenSize();
//	    Rectangle  rect = new Rectangle(scr_size);
//	    BufferedImage img = robot.createScreenCapture(rect);
//	    
//	  
//	    File Dest = new File("screenshot2.png");
//	    ImageIO.write(img, "png", Dest);
//		
//		TakesScreenshot sch;
//		sch  = ((TakesScreenshot)dvr);
//		File src = sch.getScreenshotAs(OutputType.FILE);
//		File dest = new File("screenshot4.png");
//		FileHandler.copy(src, dest);
//		
//		
		
		
//
//	  WebElement checkbox = dvr.findElement(By.name("color"));
//	  WebElement opera = dvr.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
//	        System.out.println("Checkbox enabled: " + checkbox.isEnabled());
//        System.out.println("Checkbox selected: " + checkbox.isSelected());
//	        checkbox.click();
//	        System.out.println("Checkbox selected: " + checkbox.isSelected());
//	        System.out.println("Opera selected: " + opera.isSelected());
//		
//		WebDriver dvr = new ChromeDriver();
//		dvr.get("https://www.flipkart.com");
//		WebElement searchBox = dvr.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
//		
//		       
//	        searchBox.sendKeys("mobile");
//	        dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	        searchBox.clear();
		
		Properties prop = new Properties();
		FileInputStream fis =new FileInputStream("config.properties");
		prop.load(fis);
		String browser1;
		browser1 = prop.getProperty("browser");
		System.out.println(browser1);
		if(browser1.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		
		
		
		driver.get("https://www.yahoo.com");
		
		
		
		
		
		
		
	}
		
	}



