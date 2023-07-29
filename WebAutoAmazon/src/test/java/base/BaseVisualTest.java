package base;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseVisualTest {
    public Eyes eyes;
    WebDriver driver;



    @BeforeMethod
    public  void beforeEach(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        eyes =new Eyes();
        eyes.setApiKey("MFZXPsceAwRoeD1113BrAqe9JCWVYaS0x31Dg6tQPpjF4110");
        eyes.open(driver,"Amazon Test", "Amazon Logo");
        driver.get("https://www.amazon.eg/-/en/");
    }
    @AfterMethod
    public void closeUp(){
        driver.quit();
        eyes.close();}

}
