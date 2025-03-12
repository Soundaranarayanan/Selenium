
package sele.sele;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class select {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://leafground.com/select.xhtml");
//
//        
//        WebElement uiAuto = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
//        Select drp = new Select(uiAuto);
//
//        List<WebElement> list = drp.getOptions();
//        System.out.println("The drop down option size is: " + list.size());
//        for (WebElement option : list) {
//            System.out.println("The drop down options are: " + option.getText());
//        }
//
//        boolean isMultiple = drp.isMultiple();
//        System.out.println("The multiple options available: " + isMultiple);
//
//        drp.selectByVisibleText("Puppeteer");
        
        
        driver.get("https://selenium.dev/selenium/web/ formPage.html");
        WebElement uiAuto = driver.findElement(By.cssSelector("#multi"));
      Select drp = new Select(uiAuto);
      drp.deselectByVisibleText("Sausages");
      List<WebElement> list = drp.getOptions();
      for (WebElement option : list) {
        System.out.println("The drop down options are: " + option.getText());
    }
      List<String> opt = new ArrayList<>();
      for (WebElement option1 : list) {
         opt.add(option1.getText());
      }
     
      Collections.sort(opt);
      for (String option2 : opt) {
          System.out.println("After sorting: " + option2);
      }
//      drp.selectByVisibleText("Eggs");
//      drp.selectByIndex(3);
//      
//      List<WebElement> list1 = drp.getAllSelectedOptions();
//      for (WebElement option1 : list1) {
//          System.out.println("The drop down selected options are: " + option1.getText());
//      }
//      drp.deselectByVisibleText("Eggs");
//      drp.deselectAll();
      
     // driver.quit();
   
        
       
    }
}