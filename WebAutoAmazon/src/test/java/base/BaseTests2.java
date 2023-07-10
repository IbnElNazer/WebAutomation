package base;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;

public class BaseTests2 {

    public WebDriver driver;
    protected HomePage homePage;
    protected CartPage cartPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.eg/-/en/");
        Cookie c = new Cookie("session-token","SjyNLiyco7qpxl9JQJ0D0g5/8m3QV7ZJ4Iad5zrHMENtPQJXHB27XkhlSPa+Y2l3zi/oAgBN5g24cLvdm9nEcTrJCzmUJJMrw11oTXe3Dgk/hYOMk/ZvqkJOcs4UqvxIEL1zpEnCxNL/GTjLOfiZ/k4VUm2G6vOGy4ShQtZzzh0u763vrdfb2K7Y76FvOKjSiFUmDO0r7qLdP035mZ4MIbeYomOO95YT+hFl1DHF7P4AEztG19zFDv8Qr3lO8J9DvYUTuI/HbC8=");
        Cookie d = new Cookie("session-id","262-0758544-7672438");
        Cookie e = new Cookie("ubid-acbeg","257-1436958-0136141");
        driver.manage().addCookie(c);
        driver.manage().addCookie(d);
        driver.manage().addCookie(e);
        driver.navigate().refresh();
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
