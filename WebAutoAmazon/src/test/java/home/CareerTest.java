package home;

import base.BaseTests_Cookies;
import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Amazon.CareerPage;


public class CareerTest extends BaseTests_Cookies {

    @Test (dataProvider="SearchProvider")
    public void checkJobTest( String job , String level) throws InterruptedException {
        CareerPage cp = homePage.displayCareerPage(); //Goes to career page
        Thread.sleep(2000);
        cp.sendJobName(job +" "+ level); //search for Job title
        Thread.sleep(2000);
        assertTrue( cp.getJobName(1).contains(job));
    }

    @DataProvider(name="SearchProvider") //data provider for the tests associated with it
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "Automation", "Engineer" },
                        { "Vendor", "Consultant" },
                };
    }
}
