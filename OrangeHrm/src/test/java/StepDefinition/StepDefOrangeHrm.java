package StepDefinition;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefOrangeHrm {
	
	WebDriver driver ;
	
	@Given("The user is on the Login Page of OrangeHRM website")
	public void the_user_is_on_the_login_page_of_orange_hrm_website() {
		
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("the user provides the valid username as {string} and password as {string}")
	public void the_user_provides_the_valid_username_as_and_password_as(String username, String password) {
	driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
driver.findElement(By.className("oxd-button")).click();
	}

	@Then("the user is able to visible the Dashboard text")
	public void the_user_is_able_to_vivsible_the_dashboard_text() {
		String expectedDashboardText = "Dashboard";
		WebElement dashboardText = driver.findElement(By.xpath("//header[@class='oxd-topbar']/div/div/span/h6"));
		Assert.assertTrue(dashboardText.getText().contains(expectedDashboardText));
	}
@Then("assert the quick launch options {string}")
	public void assert_the_quick_launch_options(String option) {
		if(option.equals("Assign Leave")) {
			WebElement Assign_Leave = driver.findElement(By.xpath("//p[text()='Assign Leave']"));
			Assert.assertTrue(Assign_Leave.getText().contains(option));
		}
else if(option.equals("Leave List")) {
			WebElement Leave_List = driver.findElement(By.xpath("//p[text()='Leave List']"));
			Assert.assertTrue(Leave_List.getText().contains("Leave List"));
		}
else if(option.equals("Timesheets")) {
			WebElement Time_sheets = driver.findElement(By.xpath("//p[text()='Timesheets']"));
			Assert.assertTrue(Time_sheets.getText().contains("Timesheets"));
		}
		else if(option.equals("Apply Leave")) {
	WebElement Apply_Leave = driver.findElement(By.xpath("//p[text()='Apply Leave']"));
			Assert.assertTrue(Apply_Leave.getText().contains("Apply Leave"));
		}
else if(option.equals("My Leave")) {
			WebElement My_Leave = driver.findElement(By.xpath("//p[text()='My Leave']"));
			Assert.assertTrue(My_Leave.getText().contains("My Leave"));
		}
		else if(option.equals("My Timesheet")) {
			WebElement My_Timesheet = driver.findElement(By.xpath("//p[text()='My Timesheet']"));
			Assert.assertTrue(My_Timesheet.getText().contains("My Timesheet"));
		}
        driver.quit();
        }
		
	}