package sele.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(1000);

        WebElement username = driver.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]//child::label[contains(text(),\"Username\")]//parent::div"));
        System.out.println(username.getText());

        WebElement fielduser = driver.findElement(with(By.tagName("input")).below(username));
        fielduser.sendKeys("Admin" + Keys.ENTER);

        WebElement pass = driver.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]//child::label[contains(text(),\"Password\")]//parent::div"));
        System.out.println(pass.getText());

        WebElement password = driver.findElement(with(By.tagName("input")).near(pass));
        password.sendKeys("admin123");

        WebElement frg = driver.findElement(By.cssSelector("div.orangehrm-login-forgot"));
        WebElement fr = driver.findElement(with(By.tagName("button")).above(frg));
        fr.click();

        Thread.sleep(3000);

        WebElement drp = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
        drp.click();
        Thread.sleep(1000);

        WebElement out = driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']"));
        out.click();
    }
}
