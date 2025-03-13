package sele.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement username = driver.findElement(By.cssSelector("button.dropbtn"));
        username.click();

        WebElement drop = driver.findElement(By.xpath("//a[contains(text(),'Flipkart')]"));
        drop.click();
    }
}
