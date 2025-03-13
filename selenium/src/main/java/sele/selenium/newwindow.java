package sele.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindow {
	 public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://www.bing.com");
	        System.out.println("bing");
	        driver.switchTo().newWindow(WindowType.WINDOW);
	        driver.navigate().to("https://duckduckgo.com");
	        System.out.println("duck");
	       // driver.quit();
	        
	 }
}
 