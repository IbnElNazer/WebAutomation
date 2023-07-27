package home;

import base.BaseTests2;
import static org.testng.Assert.*;

import io.cucumber.java.en.Given;
import org.testng.annotations.Test;
import pages.Amazon.CareerPage;


public class CareerTest extends BaseTests2 {

    @Test
    public void checkJobTest() throws InterruptedException {

        CareerPage cp = homePage.displayCareerPage();
        Thread.sleep(2000);
        cp.sendJobName("Automation Engineer");
        Thread.sleep(2000);
        assertTrue( cp.getJobName(1).contains("Automation"));
    }
}
