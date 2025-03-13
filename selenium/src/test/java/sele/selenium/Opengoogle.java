package sele.selenium;
//import java.util.Arrays;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
/*
import io.github.bonigarcia.wdm.*;
public class Opengoogle {
public static void main(String[]args) throws InterruptedException {
	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//driver.get("https://www.saucedemo.com");
	driver.navigate().to("https://www.saucedemo.com");
	WebElement usr = driver.findElement(By.name("user-name"));
	usr.sendKeys("standard_user"+Keys.ENTER);
	WebElement pass = driver.findElement(By.name("password"));
	
	pass.sendKeys("secret_sauce"+Keys.ENTER);
	WebElement login = driver.findElement(By.name("login-button"));
	
	pass.sendKeys(Keys.ENTER);
	WebElement addtocart =driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

	addtocart.sendKeys(Keys.ENTER);
	WebElement shop = driver.findElement(By.id("shopping_cart_container"));

	
	shop.click();
	Thread.sleep(3000);
driver.navigate().back();
	//String url = driver.getCurrentUrl();
//	String title=driver.getTitle();
	
	
//System.out.println("Title:"+title);
//System.out.println("URL="+url);
//driver.close();
	}
}*/



//
//public class Opengoogle {
//public static void main(String[]args) throws InterruptedException {
	

//	driver.get("https://www.google.co.in");
//	WebElement gmail = driver.findElement(By.linkText("Gmail"));
//	gmail.click();
//	
//	WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
//	email.sendKeys("2k21eee65@kiot.ac.in"+Keys.ENTER);
//	WebElement next = driver.findElement(By.linkText("Next"));
//	next.click();
//	WebElement pass = driver.findElement(By.name("Passwd"));
//	pass.sendKeys("KIOT1234"+Keys.ENTER);
//	WebElement next1 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]"));
//	next1.click();
//	driver.get("https://www.leafground.com/input.xhtml");
//	WebElement name = driver.findElement(By.name("j_idt88:name"));
//	name.sendKeys("Soundar");
//	WebElement app = driver.findElement(By.name("j_idt88:j_idt91"));
//	app.sendKeys(",INDIA");
//	WebElement txtbox = driver.findElement(By.id("j_idt88:j_idt93"));
//	System.out.println(txtbox.isEnabled());
//	WebElement CLR = driver.findElement(By.name("j_idt88:j_idt95"));
//	CLR.clear();
//	WebElement rtr = driver.findElement(By.id("j_idt88:j_idt97"));
//   System.out.println( rtr.getAttribute("value"));
//   WebElement typ = driver.findElement(By.id("j_idt88:j_idt99"));
//	typ.sendKeys("2k21eee65 and tab"+Keys.ENTER);
//	typ.sendKeys(Keys.TAB+"ggggggg"+Keys.ENTER);
//	WebElement pr = driver.findElement(By.id("j_idt106:thisform:age"));
//	pr.sendKeys(Keys.ENTER);
//	WebElement cl = driver.findElement(By.id("j_idt106:float-input"));
//	WebElement cl1 = driver.findElement(By.id("j_idt106:j_idt113"));
//	
//	System.out.println("Before click:"+cl1.getLocation());
//	cl.click();
//	cl.sendKeys("written"+Keys.ENTER);
//	System.out.println("After click:"+cl1.getLocation());
//	WebElement op = driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/ul"));
//	op.sendKeys("Soundar"+Keys.ENTER);
//	WebElement dr = driver.findElement(By.className("ui-button-text"));
//	dr.click();
	
//	WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
//	driver1.manage().window().maximize();
//	driver1.get("https://www.facebook.com/");
//	WebElement text=driver1.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
//	System.out.println(text.getDomAttribute("class"));
//	WebElement text1=driver1.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
//	System.out.println(text1.getDomAttribute("class"));
	
//	driver.get("https://www.amazon.com/");
//	WebElement amz=driver.findElement(By.name("field-keywords"));
//	System.out.println(amz.getDomAttribute("name"));
//	System.out.println(amz.getDomAttribute("class"));
//	System.out.println(amz.getDomAttribute("tabindex"));
//	System.out.println(amz.getDomAttribute("type"));
//	System.out.println(amz.getDomAttribute("id"));
//	System.out.println(amz.getAttribute("test"));
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
//	driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver1.manage().window().maximize();
//	String PartialLinkText_Text = driver1.findElement(By.partialLinkText("orange")).getText();
//	System.out.println("the location is-> "+PartialLinkText_Text);
//	driver1.findElement(By.name("username")).sendKeys("Admin");
//	driver1.findElement(By.name("password")).sendKeys("admin123");
//	List<WebElement> linkName = driver1.findElements(By.tagName("a"));
//	int linkcount = linkName.size();
//	System.out.println("LIST OF LINK");
//	System.out.println("TOTAL LIST: "+linkcount);
//	for(WebElement link : linkName)
//	{
//		System.out.println(link.getText()+" - "+link.getDomAttribute("href"));
//	}
//	driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//	
//	driver1.close();
//
//}
//}

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Opengoogle {
    public static void main(String[] args) throws InterruptedException {
      
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

     
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        try { Thread.sleep(3000); } catch (InterruptedException e) { }

        try {
            String partialText = driver.findElement(By.partialLinkText("OrangeHRM")).getText();
            System.out.println("Partial Link Text: " + partialText);
        } catch (NoSuchElementException e) {
            System.out.println("Partial link text not found.");
        }

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

    
        List<WebElement> linkName = driver.findElements(By.tagName("a"));
        int linkcount = linkName.size();
        System.out.println("LIST OF LINKS");
        System.out.println("TOTAL LINKS: " + linkcount);
        for (WebElement link : linkName) {
            System.out.println(link.getText() + " - " + link.getDomAttribute("href"));
        }

     
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        
       
        WebElement lo = driver.findElement(By.xpath("/html/body"));
        Thread.sleep(1000);
        List<WebElement> linkName1 = driver.findElements(By.tagName("a"));
        int linkcount1 = linkName1.size();
        System.out.println("LIST OF LINKS");
        System.out.println("TOTAL LINKS: " + linkcount1);
        for (WebElement link1 : linkName1) {
            System.out.println(link1.getText() + " - " + link1.getDomAttribute("href"));
        }

        
       WebElement lg = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span"));
      lg.click();
//
//        WebElement lg1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a"));
//        lg1.click();
   
    }
}


//
//import io.github.bonigarcia.wdm.*;
//public class Opengoogle {
//public static void main(String[]args)  {
//	//WebDriverManager.chromedriver().setup();
//	ChromeOptions option = new ChromeOptions();
//	option.addArguments("--headless");
//	WebDriver dvr = new ChromeDriver(option);
//	dvr.manage().window().maximize();
//	dvr.get("https://www.google.co.in");
//	WebElement search_box = dvr.findElement(By.name("q"));
//	search_box.sendKeys("Java Selenium" + Keys.ENTER);
//	String url = dvr.getCurrentUrl();
//	String title = dvr.getTitle();
//	System.out.println("URL : "+url);
//	System.out.println("TITLE : "+title);
//	}
//}

