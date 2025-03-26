package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
  private By register = By.xpath("//a[@class='ico-register']");
   public HomePage(WebDriver driver) {
        super(driver);
    }
  public void clickRegister() {
	  
	   System.out.println("Home Page Title: " + getPageTitle()); 
       driver.findElement(register).click();
       System.out.println("Register Page Title: " + getPageTitle());
    }
}
