package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    private By male = By.xpath("//input[@id='gender-male']");
   private By female = By.xpath("//input[@id='gender-female']");
    private By firrname = By.xpath("(//div[@class='inputs']/input)[1]");
    private By lastname = By.xpath("(//div[@class='inputs']/input)[2]");
     private By emailField = By.xpath("(//div[@class='inputs']/input)[3]");
    private By pass = By.xpath("(//div[@class='inputs']/input)[4]");
    private By conpass = By.xpath("(//div[@class='inputs']/input)[5]");
    private By registerbutton = By.xpath("//input[@id='register-button']");
public RegisterPage(WebDriver driver) {
        super(driver);
    }
public void registerAsMale(String firstName, String lastName, String email, String password, String confirmPassword) {
        driver.findElement(male).click();
        fillRegistrationForm(firstName, lastName, email, password, confirmPassword);
    }
 public void registerAsFemale(String firstName, String lastName, String email, String password, String confirmPassword) {
        driver.findElement(female).click();
        fillRegistrationForm(firstName, lastName, email, password, confirmPassword);
    }
   private void fillRegistrationForm(String firstName, String lastName, String email, String password, String confirmPassword) {
          driver.findElement(firrname).sendKeys(firstName);
        driver.findElement(lastname).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(pass).sendKeys(password);
         driver.findElement(conpass).sendKeys(confirmPassword);
        driver.findElement(registerbutton).click();
    }
}
