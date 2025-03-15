package sele.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://omayo.blogspot.com");
        List<WebElement> rsize = driver.findElements(By.xpath("//table[@id='table1']//th"));
    
        List<WebElement> csize = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
    
        for (WebElement header : rsize) {
            System.out.print(header.getText() + " ");
        }
        
        for (int i = 0; i <= csize.size(); i++) {
            List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[" + i + "]//td"));
          for (WebElement cell : col) {
                System.out.print(cell.getText() + " ");
            }
            System.out.println();
        }
    }
}
