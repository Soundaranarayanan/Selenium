package Test;

import org.testng.annotations.Test;
import Page.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void testClickRegister() {
        HomePage homePage = new HomePage(getDriver()); // Use getDriver()
        homePage.clickRegister();
    }
}
