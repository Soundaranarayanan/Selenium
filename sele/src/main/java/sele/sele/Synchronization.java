package sele.sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
 
public class Synchronization {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://configureselenium.blogspot.com/2020/11/selenium-tutorials.html");

          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Stats1_totalCount")));
         System.out.println("Before:"+username.getText());

        WebElement sele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"PageList1\"]/div/div[1]/div[1]/div/ul/li[1]/a")));
        sele.click();
         WebElement ud = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Stats1_totalCount")));
        System.out.println("After:"+ud.getText());

        driver.quit();
    }
}
