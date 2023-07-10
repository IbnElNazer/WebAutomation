package base;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VisualTest {
    Eyes eyes;
    WebDriver driver;



    @BeforeMethod
    public  void beforeEach(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        eyes =new Eyes();
        eyes.setApiKey("MV3jhESNWxyT6N4K989nnOMXBmjlil111k8jOiGSlJxDsM110");
        eyes.open(driver,"Amazon Test", "LayOut Test",new RectangleSize(1200,900));
        driver.get("https://www.amazon.eg/s?k=playstation+5");
    }

    @Test
    public void  test(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gdsfsf");
        eyes.check(Target.window().strict());
    }
    @Test
    public void  test2(){
        driver.findElement(By.id("p_36/26088918031")).click();
        eyes.check(Target.window().layout());
    }
    @AfterMethod
    public void closeUp(){
        eyes.close();
    driver.close();}



}
