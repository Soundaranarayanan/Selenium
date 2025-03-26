package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        driver.set(new ChromeDriver(options)); // Separate WebDriver for each thread
        getDriver().manage().window().maximize();
        getDriver().get("https://demowebshop.tricentis.com/");
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void teardown() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
