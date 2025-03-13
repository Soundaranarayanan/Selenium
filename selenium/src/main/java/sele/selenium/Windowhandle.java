package sele.selenium;


import java.time.Duration;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/browser-windows");

        // Get parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);

        // Click the button to open a new window
        driver.findElement(By.id("windowButton")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total Windows Opened: " + allWindows.size());

        // Iterate through the windows to find the child window
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to Child Window: " + windowHandle);
                break;
            }
        }

        // Close the child window
        driver.close();
        System.out.println("Child window closed");

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to Parent Window");

        // Close the driver
        driver.quit();
    }
}
