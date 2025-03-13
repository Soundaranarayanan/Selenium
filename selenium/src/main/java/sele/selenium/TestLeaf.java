package sele.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TestLeaf {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");
        System.out.println("Parent Window Title: " + driver.getTitle());
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//span[text()='Open']")).click();

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Child Window Title: " + driver.getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent Window");
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        
        System.out.println("delay Window Title: " + driver.getTitle());
        
        
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
  
        driver.quit();
    }
}
