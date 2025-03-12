package sele.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListDemo {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bstackdemo.com/");
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> all = driver.findElements(By.cssSelector("select option"));
		System.out.println("Options size:"+all.size());
		String option = "Lowest to highest";
		for(int i=0;i<all.size();i++) {
			if(all.get(i).getText().contains(option)) {
				all.get(i).click();
				System.out.println("clicked");
				break;
			}
		}
	}

}
