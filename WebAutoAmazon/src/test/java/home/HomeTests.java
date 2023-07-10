package home;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPopup;
import pages.LoginPage;
import pages.UserUniquePage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.testng.Assert.*;

public class HomeTests  extends BaseTests  {





    @Test
    public void checkWebsiteName()  {
        assertEquals(homePage.getPageTitle(),"Your Souq is now Amazon.eg | Welcome to Amazon.eg in Egypt. Online Shopping for Electronics, Apparel, Beauty and Grooming, Grocery and more");

    }

    @Test
    public void checkLoadTimeLessThan4Seconds()  {

        homePage.clickAddressButton();
        System.out.println();

    }
    @Test
    public void loadTimeTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        long currentTime1st = System.currentTimeMillis();
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
        wt.until(ExpectedConditions.elementToBeClickable (By.id("nav-search-submit-button")));
        //capture time after page load
        long currentTime2nd = System.currentTimeMillis();
        //compute time
        long netTime = Math.subtractExact(currentTime2nd,currentTime1st);
        System.out.println(netTime);
       assertTrue(netTime<4000);

    }
    @Test
        void getStatusForWebsiteBrokenLink() throws IOException {
        driver.get("https://www.amazon.eg/-/en/sdafwqewq");
        HttpURLConnection cn = (HttpURLConnection) new URL(driver.getCurrentUrl()).openConnection();
            // set HEADER request
            cn.setRequestMethod("GET");
            // connection initiate
            cn.connect();
            //get response code
            int res = cn.getResponseCode();
            //Display
            assertEquals(res,404);
            System.out.println("Http response code: " + res);

}
    @Test
    void getStatusCodeForWebsite() throws IOException {

        HttpURLConnection cn = (HttpURLConnection) new URL(driver.getCurrentUrl()).openConnection();
        // set HEADER request
        cn.setRequestMethod("GET");
        // connection initiate
        cn.connect();
        //get response code
        int res = cn.getResponseCode();
        //Display
        assertEquals(res,200);
        System.out.println("Http response code: " + res);

    }


}
