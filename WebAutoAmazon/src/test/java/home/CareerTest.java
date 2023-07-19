package home;

import base.BaseTests2;
import org.testng.annotations.Test;
import pages.Amazon.CareerPage;

public class CareerTest extends BaseTests2 {

    @Test (groups = "Functional")
    public void checkJobTest() throws InterruptedException {
        CareerPage cp = homePage.displayCareerPage();
        Thread.sleep(3000);
//        cp.sendJobLocation();
        cp.sendJobName();
        cp.clickSearch();
        System.out.println(cp.getLocationChecker());
    }
}
