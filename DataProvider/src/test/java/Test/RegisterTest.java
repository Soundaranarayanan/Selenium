package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Page.HomePage;
import Page.RegisterPage;
import Data.Dataprovider;

public class RegisterTest extends BaseTest {
    @Test(dataProvider = "excelDataMale", dataProviderClass = Dataprovider.class)
    public void testUserRegistrationAsMaleWithDuplicateEmail(String firstName, String lastName, String email, String password, String confirmPassword) {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerAsMale(firstName, lastName, email, password, confirmPassword);

        WebElement errorMessage = getDriver().findElement(By.xpath("//div[contains(@class, 'message-error')]//li"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message for duplicate email is not displayed.");
        String expectedMessage = "The specified email already exists";
        Assert.assertEquals(errorMessage.getText(), expectedMessage);
        System.out.println("Duplicate email error message displayed: " + errorMessage.getText());
    }

    @Test(dataProvider = "excelDataFemale", dataProviderClass = Dataprovider.class)
    public void testUserRegistrationAsFemale(String firstName, String lastName, String email, String password, String confirmPassword) {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerAsFemale(firstName, lastName, email, password, confirmPassword);
    }

    @Test(dataProvider = "excelDataInvalidMale", dataProviderClass = Dataprovider.class)
    public void testUserRegistrationAsMaleWithEmptyFields(String firstName, String lastName, String email, String password, String confirmPassword) {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerAsMale(firstName, lastName, email, password, confirmPassword);

        WebElement errorMessage = getDriver().findElement(By.xpath("//span[@class='field-validation-error']"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Validation error message is not displayed.");
        System.out.println("Validation error message displayed: " + errorMessage.getText());
    }
}
