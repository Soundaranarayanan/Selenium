package pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	WebDriver driver;
	@DataProvider(name ="testData")
	public Object[][] dataProv(){
		return new Object[][] {{"Selenium"},{"TestNG"}};
	}
	
}