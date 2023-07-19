package base;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Amazon.CartPage;
import pages.Amazon.HomePage;

public class BaseTests2 {

    public WebDriver driver;
    protected HomePage homePage;
    protected CartPage cartPage;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.eg/-/en/");
        Thread.sleep(500);
        Cookie g = new Cookie("x-acbeg","zUOgd362zjD7DCDibpZ1TTTpHkAY0t@FpxqEBSjy9NXWnCWLXv7lN7b5@iRUJl6W");
        driver.manage().addCookie(g);
        Cookie s = new Cookie("at-acbeg","Atza|IwEBIMub6UPcP9W0bTlpCws9BX3S2DSsNAiuk2XCAFtxF4UyCBfzNalBNa3HCOnHvED8aYid76His3v7RATQN6jMn3nOe7No6SNXj6NtaNnVShz7KUJpzH0m7YK9wHkADfdDw-_WyBi8YnOOOVug0vA-IY7Zvq2Pkpj3KCa14UdBUSmP5xL6zsEyAnNvNwQDrjLX3_MSQssn6uEfLA8vLt4c8SL-kOzBd2vxzLVc--fUiRm19g");
        driver.manage().addCookie(s);
        driver.navigate().refresh();
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }
}
