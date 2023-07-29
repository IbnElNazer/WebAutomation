package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Amazon.CartPage;
import pages.Amazon.HomePage;

public class BaseTests_Credentials {


     public WebDriver driver;
    protected HomePage homePage;
    protected CartPage cartPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/-/en/");
        homePage = new HomePage(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}