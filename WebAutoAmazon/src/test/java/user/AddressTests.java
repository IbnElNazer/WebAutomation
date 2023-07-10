package user;

import base.BaseTests2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.AddressPopup;

import static org.testng.Assert.*;


public class AddressTests extends BaseTests2 {


    @Test
    public void testChangeGovPopAddressTest() throws InterruptedException
    {
        AddressPopup AP = homePage.clickAddressButton();
        Thread.sleep(2000);
        AP.selectGovernate(4);
        System.out.println(AP.displayGov());

    }

    @Test //OK
    public void testChangePopAddressTest() throws InterruptedException
    {
        AddressPopup AP = homePage.clickAddressButton();
        Thread.sleep(2000);
        AP.chooseAddress(1);
       assertEquals(AP.getAddress(1),"vdfs - Zahraa El-maadi El-Khamsen St.");

    }



}
