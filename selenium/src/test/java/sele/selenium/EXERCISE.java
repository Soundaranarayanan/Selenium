package sele.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

public class EXERCISE {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.shopclues.com/");
        WebElement element = driver.findElement(By.cssSelector("input#autocomplete"));
       
//        WebElement element = driver.findElement(By.xpath("//input[@id='autocomplete']"));
//      WebElement element = driver.findElement(By.xpath("//input[@type='submit']/preceding-sibling::input[@id='autocomplete']"));       
//      WebElement element = driver.findElement(By.xpath("//span[@id='search']/input[@id='autocomplete']"));       
//      WebElement element = driver.findElement(By.xpath("//input[contains(@placeholder,'What is on your mind today?')]"));
        element.sendKeys("T-shirts"+Keys.ENTER);
        
        
    WebElement men = driver.findElement(By.xpath("//a[text()='MEN']"));
//    WebElement men = driver.findElement(By.linkText("MEN"));
//    WebElement men = driver.findElement(By.partialLinkText("MEN"));
//    WebElement men = driver.findElement(By.xpath("//div[@id='rightpanel_43']/preceding-sibling::a[@href='javascript:void(0);']"));
//    WebElement men = driver.findElement(By.xpath("//li[@id='nav_44']/following-sibling::li[1]/a[@href='javascript:void(0);']"));
//    WebElement men = driver.findElement(By.xpath("//li[@id='nav_43']//a[@href='javascript:void(0);']"));
      men.click();
      
    
      WebElement chk = driver.findElement(By.xpath("//label[@for='UDNAG_4168255']"));
//      WebElement chk = driver.findElement(By.cssSelector("label[for=UDNAG_4168255]"));
//      WebElement chk = driver.findElement(By.xpath("//input[@id='UDNAG_4168255']/following-sibling::label[@for='UDNAG_4168255']"));
//      WebElement chk = driver.findElement(By.xpath("//li[input[@id='UDNAG_4168255']]/label"));
//      WebElement chk = driver.findElement(By.xpath("//input[@id='UDNAG_4168255']/ancestor::li/label"));		
      chk.click();
        
      
    WebElement img = driver.findElement(By.xpath("//img[@id='det_img_152921247']"));
//    WebElement img = driver.findElement(By.cssSelector("img#det_img_152921247"));
//    WebElement img = driver.findElement(By.xpath("//div[@class='img_section']/img[@id='det_img_152921247']"));  
//    WebElement img = driver.findElement(By.xpath("//a[@href='//www.shopclues.com/udnag-unisex-round-neck-graphic-independence-day--my-ancestors-kicked-the-brits-out-polyester-t-shirt-white-152921247.html']//img"));  
//    WebElement img = driver.findElement(By.xpath("//div[@class='extraBadges']/preceding-sibling::div[@class='img_section']/img[@id='det_img_152921247']"));  
   img.click(); 
        
   String mainWindowHandle = driver.getWindowHandle();

for (String windowHandle : driver.getWindowHandles()) {
    if (!windowHandle.equals(mainWindowHandle)) {
        driver.switchTo().window(windowHandle);
        break;
    }
}
        

  WebElement size = driver.findElement(By.xpath("//span[@id='1056205']"));
//      WebElement size = driver.findElement(By.xpath("//span[@id=5338248]/following-sibling::span[1]"));
//      WebElement size = driver.findElement(By.cssSelector("span[id='1056205']"));
//      WebElement size = driver.findElement(By.xpath("//span[@id='1056207']/preceding-sibling::span[1]"));
//      WebElement size = driver.findElement(By.xpath("//span[text()='S']"));
   size.click();

      WebElement add = driver.findElement(By.xpath("//button[@id='add_cart']"));
//      WebElement add = driver.findElement(By.cssSelector("button#add_cart"));
//      WebElement add = driver.findElement(By.xpath("//div[@class='buy_product']/button[@id='add_cart']"));     
//      WebElement add = driver.findElement(By.xpath("//button[@id='buy']/preceding-sibling::button[@id='add_cart']"));
//      WebElement add = driver.findElement(By.xpath("//button[@id='buy']/ancestor::div//button[@id='add_cart']"));     
    add.click();
 
    WebElement cart = driver.findElement(By.xpath("//li[@id='wishlist_d_content']/following-sibling::li/a"));
//    WebElement cart = driver.findElement(By.xpath("//span/ancestor::a[@class='cart_ic']"));
//    WebElement cart = driver.findElement(By.xpath("//li/a[@class='cart_ic']"));
//    WebElement cart = driver.findElement(By.xpath("//a[@class='cart_ic']"));
//    WebElement cart = driver.findElement(By.cssSelector("a.cart_ic"));
    cart.click();
    
    WebElement remove = driver.findElement(By.cssSelector("a.remove"));
//    WebElement remove = driver.findElement(By.xpath("//span/ancestor::div[@class='p_quantity']/a"));
//    WebElement remove = driver.findElement(By.xpath("////div[@class='p_quantity']//a[@class='remove']"));
//    WebElement remove = driver.findElement(By.xpath("//a[@class='cart_ic']"));
//    WebElement remove = driver.findElement(By.xpath("//a[@class='cart_ic']"));
        remove.click();
        
        WebElement Remove = driver.findElement(By.xpath("//div/a[@class='prod-remove']"));
//        WebElement Remove = driver.findElement(By.cssSelector("a[class='prod-remove']"));
//        WebElement Remove = driver.findElement(By.xpath("//a[@class='prod-move-wishlist']/preceding-sibling::a"));
//        WebElement Remove = driver.findElement(By.xpath("//a[@class='prod-remove']"));
//        WebElement Remove = driver.findElement(By.cssSelector("a.prod-remove"));
        Remove.click();
        
        
        WebElement back = driver.findElement(By.xpath("//a/ancestor::div[@class='logo']/i"));
//        WebElement back = driver.findElement(By.xpath("//div[@class='cart_steps']/div/div/i"));
//        WebElement back = driver.findElement(By.xpath("//div/i[@class='backtohistory']"));
//        WebElement back = driver.findElement(By.xpath("//i[@class='backtohistory']"));
//        WebElement back = driver.findElement(By.cssSelector("i.backtohistory"));
        back.click();
        
        
        
    

       WebElement home = driver.findElement(By.xpath("//span[text()='Home']"));
//        WebElement home = driver.findElement(By.xpath("//a/span[text()='Home']"));
//        WebElement home = driver.findElement(By.xpath("//a[@href='//www.shopclues.com/']/span"));
    //   WebElement home = driver.findElement(By.xpath("//li/a[@href='//www.shopclues.com/']/span"));
        //WebElement home = driver.findElement(By.xpath("//ul//span[text()='Home']"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", home);
    //  home.click();
        
      
       
      WebElement maharaja = driver.findElement(By.xpath("//a[text()='Maharaja Sale']"));
     // div[data-slick-index="0"] a[tabindex="0"]
      maharaja.click();
 
        
        
        
        WebElement Img = driver.findElement(By.xpath("//img[@title='Maharaja Sale']"));
        //  img[title='Maharaja Sale']
        // //a/img[@title='Maharaja Sale']
        Img.click();
      
          
        WebElement firs = driver.findElement(By.xpath("//div[@class='ingPidDiv']/img[@src=\"https://cdn.shopclues.com/images1/thumbnails/118031/200/200/153635523-118031522-1736944980.jpg\"]"));
        ////div[@class='infoPidDiv']/preceding-sibling::div[@class='ingPidDiv']//img[@src="https://cdn.shopclues.com/images1/thumbnails/118031/200/200/153635523-118031522-1736944980.jpg"]
        // img[src="https://cdn.shopclues.com/images1/thumbnails/118031/200/200/153635523-118031522-1736944980.jpg"]
        firs.click();
        
        WebElement secimg = driver.findElement(By.xpath("//li[@id='thumb_click_1']/a[@href='#']"));
      //  (//li[@id='thumb_click_1']/ancestor::div//a[@href='#'])[2]
        // li#thumb_click_1 a
        secimg.click();
        
        WebElement thirdimg = driver.findElement(By.xpath("//li[@id='thumb_click_2']/a[@href='#']"));
        // (//li[@id='thumb_click_1']/ancestor::div//a[@href='#'])[3]
        // li#thumb_click_2 a
        thirdimg.click();
        
        WebElement fourthimg = driver.findElement(By.xpath("//li[@id='thumb_click_3']/a[@href='#']"));
    //  (//li[@id='thumb_click_1']/ancestor::div//a[@href='#'])[4]
     // li#thumb_click_3 a
        fourthimg.click();
        
        WebElement Home = driver.findElement(By.xpath("//span[text()='Home']"));
        // //li[@itemprop='itemListElement']//span[text()='Home']
        // li:nth-of-type(1)[itemprop='itemListElement'] span[itemprop^='name']
         Home.click();
        
 
        // div.cLocation a
        // //div[@class='cLocation']/a
        // //div[@class='cLocation']/span/following-sibling::a
         
         // a.notify_ic
         // //a[@class='notify_ic']
         // //span[@class='notification_count']/ancestor::ul//a[@class='notify_ic']
         
         // li#wishlist_d a
         // //li[@id='wishlist_d']/a
         // //li[@id='wishlist_d_content']/preceding-sibling::li[@id='wishlist_d']/a
         
         // li.qCart a
         // //li[@class='qCart']/a
         // 
        
        
    }
    }
