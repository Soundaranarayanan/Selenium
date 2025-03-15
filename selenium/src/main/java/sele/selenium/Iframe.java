package sele.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/frame.xhtml");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Switch to first iframe
        WebElement one = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@src='default.xhtml']")));
        driver.switchTo().frame(one);
        System.out.println("Switched to first iframe");

        WebElement a = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Click Me')]")));
        a.click();
        System.out.println("text click1: " + a.getText());

        // Switch back to main content
        driver.switchTo().defaultContent();
        System.out.println("Switched back to main page");

        WebElement bottom = driver.findElement(By.id("j_idt96"));
        System.out.println("main page: " + bottom.getText());

        // Switch to second iframe
        WebElement two = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@src='nested.xhtml']")));
        driver.switchTo().frame(two);
        System.out.println("Switched to second iframe");

        // Debug: Print all iframes inside `nested.xhtml`
        Thread.sleep(2000);
        List<WebElement> nestedIframes = driver.findElements(By.tagName("iframe"));
        System.out.println("Total iframes inside nested.xhtml: " + nestedIframes.size());

        if (nestedIframes.size() > 0) {
            for (WebElement iframe : nestedIframes) {
                String src = (String) js.executeScript("return arguments[0].getAttribute('src');", iframe);
                System.out.println("Found nested iframe with src: " + src);
            }

            // Switch to the first nested iframe
            driver.switchTo().frame(nestedIframes.get(0));
            System.out.println("Switched to nested iframe");

            WebElement b = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Click Me')]")));
            b.click();
            System.out.println("text click2: " + b.getText());
        } else {
            System.out.println("No nested iframes found!");
        }

        driver.quit();
    }
}
