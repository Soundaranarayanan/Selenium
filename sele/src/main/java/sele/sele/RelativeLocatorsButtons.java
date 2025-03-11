package sele.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
        String lo = login.getText();
        System.out.println(lo);

        WebElement submit = driver.findElement(with(By.tagName("button")).toLeftOf(login));
        String su = submit.getText();
        System.out.println(su);

        WebElement register = driver.findElement(with(By.tagName("button")).toRightOf(login));
        String re = register.getText();
        System.out.println(re);
    }
}
