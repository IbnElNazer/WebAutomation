package user;

import base.BaseTests2;
import org.testng.annotations.Test;
import pages.Amazon.AddressPopup;

import static org.testng.Assert.*;


public class AddressTests extends BaseTests2 {


    @Test //ok
    public void testChangeGovPopAddressTest() throws InterruptedException
    {
        AddressPopup AP = homePage.clickAddressButton();
        Thread.sleep(2000);
        AP.selectGovernorate(5); //index number 5 represents el sharkia
        driver.navigate().refresh();
        Thread.sleep(2000);
        assertEquals(AP.displayLocationText(),"Ash Sharqia");

    }

    @Test //OK
    public void testChangePopAddressTest() throws InterruptedException
    {
        AddressPopup AP = homePage.clickAddressButton();
        Thread.sleep(2000);
        AP.chooseAddress(2);
        driver.navigate().refresh();
        Thread.sleep(2000);
       assertTrue(AP.displayLocationText().contains("Zahraa"));

    }




}
