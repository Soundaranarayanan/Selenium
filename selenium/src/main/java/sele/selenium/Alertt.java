package sele.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertt {
public static void main(String[]args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://omayo.blogspot.com");
     
//    WebElement simple = driver.findElement(By.xpath("//input[@id='alert1']"));
//    simple.click();
//    String alertText = driver.switchTo().alert().getText();
//    System.out.println("Simple Alert Text: " + alertText);
//    driver.switchTo().alert().accept();
    
    
//    WebElement prompt = driver.findElement(By.xpath("//input[@id='prompt']"));
//    prompt.click();
//    String alertText = driver.switchTo().alert().getText();
//    System.out.println("Prompt Alert Text: " + alertText);
//    driver.switchTo().alert().sendKeys("Soundar");
//    driver.switchTo().alert().accept();
   
    
    WebElement confirm = driver.findElement(By.xpath("//input[@id='confirm']"));
    confirm.click();
    String alertText1 = driver.switchTo().alert().getText();
    System.out.println("Confirmation Alert Text: " + alertText1);
    driver.switchTo().alert().accept();
    confirm.click();
    String alertText2 = driver.switchTo().alert().getText();
    System.out.println("Confirmation Alert Text: " + alertText2);
    driver.switchTo().alert().dismiss();
    driver.quit();
	
}
}
