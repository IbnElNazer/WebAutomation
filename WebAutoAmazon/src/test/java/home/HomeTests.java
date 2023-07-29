package home;

import base.BaseTests_Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import static org.testng.Assert.*;

public class HomeTests  extends BaseTests_Credentials {

    @Test
    public void checkWebsiteName()  {
        assertEquals(homePage.getPageTitle(),"Your Souq is now Amazon.eg | Welcome to Amazon.eg in Egypt. Online Shopping for Electronics, Apparel, Beauty and Grooming, Grocery and more");

    }
    @Test (groups = "Visual") // OK
    public void checkAmazonLogoIsDisplayed(){
      assertTrue(homePage.getAmazonLogo().isDisplayed());
        System.out.println("Amazon logo is displayed correctly");
    }

    @Test (groups = "Visual") //OK
    public void CheckFlashSalesIMGISDisplayed() throws IOException{
       String Loc = homePage.getFlashSAlesIMG();
       URL url = new URL(Loc);
        HttpURLConnection cn = (HttpURLConnection) url.openConnection();
        cn.setRequestMethod("GET");
        // connection initiate
        cn.connect();
        int res = cn.getResponseCode();
        //assert that response code passes and equals 200
        assertEquals(res,200);
        System.out.println("The image is displayed correctly");
    }

    @Test
    public void loadTimeTest(){
        long currentTime1st = System.currentTimeMillis();
        homePage.getToDestination("https://www.amazon.eg/");
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
        wt.until(ExpectedConditions.elementToBeClickable (By.id("nav-search-submit-button")));
        //capture time after page load
        long currentTime2nd = System.currentTimeMillis();
        //calculate time difference
        long netTime = Math.subtractExact(currentTime2nd,currentTime1st);
        assertTrue(netTime<4000);
        System.out.println("Good load time: " + netTime/1000 +" second(s)");

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
            //assert that response code fails and equals 404
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
        //assert that response code passes and equals 200
        assertEquals(res,200);
        System.out.println("Http response code: " + res);

    }
    @Test (groups = "Visual") //OK
    public void checkVisualImageTest () throws IOException {
        //Preparation of expected result of image
        String exp = "resources/img.jpg";
        File expi = new File(exp);
        BufferedImage expp = ImageIO.read(expi);
        //Preparation of actual result of image
        URL url = new URL(homePage.getFlashSAlesIMG());
        BufferedImage actt = ImageIO.read(url);
        //Comparison between the two images
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(expp,actt);
        //assertion for comparison difference
       assertFalse(diff.hasDiff());
    }
    @Test
    public void changeLanguageTest() throws InterruptedException {
        homePage.clickArabicLanguage();
        Thread.sleep(3000);
       assertEquals(homePage.getTodayOffersInArabicText(),"عروض اليوم");
    }

    @Test (groups = "Thank you")
    public void ThankYou() throws InterruptedException {
        homePage.getToDestination("https://www.funimada.com/assets/images/cards/big/thank-you-26.gif");
        Thread.sleep(20000);
    }

}
