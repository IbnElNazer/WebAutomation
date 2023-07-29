package user;

import base.BaseTests_Cookies;
import org.testng.annotations.Test;
import pages.Amazon.AddressPage;
import pages.Amazon.AddressPopup;

import static org.testng.Assert.*;


public class AddressTests extends BaseTests_Cookies {


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

    @Test //OK
    public void testRemoveAddressTest() throws InterruptedException {
        AddressPage APP = homePage.goToAddressPage();
        APP.sendPassword();
        APP.setRemoveFirstAddress();
        driver.navigate().refresh();
        Thread.sleep(5000);

    }

    @Test //OK
    public void testAddAddressTest() throws InterruptedException {
        AddressPage APP = homePage.goToAddressPage();
        APP.sendPassword();
        Thread.sleep(2000);
        APP.clickAddAddressButton();
        APP.setNameField("ahmed");
        APP.setMobileField("01156379832");
        APP.setStreetField("uyt");
        APP.setCityField("Zahraa El-maadi");
        Thread.sleep(2000);
        APP.setDistrictField("El-Khamsen St.");
        APP.setBuildingField("245");
        APP.clickHomeButton();
        APP.clickSaveAddressButton();
        Thread.sleep(5000);

    }

    @Test //OK
    public void testAddAddressTestFailedName() throws InterruptedException {
        AddressPage APP = homePage.goToAddressPage();
        APP.sendPassword();
        Thread.sleep(2000);
        APP.clickAddAddressButton();
        APP.setNameField(" ");
        APP.setMobileField("01156379832");
        APP.setStreetField("uyt");
        APP.setCityField("Zahraa El-maadi");
        Thread.sleep(2000);
        APP.setDistrictField("El-Khamsen St.");
        APP.setBuildingField("245");
        APP.clickHomeButton();
        APP.clickSaveAddressButton();
        Thread.sleep(5000);
       assertEquals(APP.getNameErrorMessage(),"Please enter a name.");

    }
    @Test //OK
    public void testAddAddressTestFailedDistrict() throws InterruptedException {
        AddressPage APP = homePage.goToAddressPage();
        APP.sendPassword();
        Thread.sleep(2000);
        APP.clickAddAddressButton();
        APP.setNameField("ahmed");
        APP.setMobileField("01156379832");
        APP.setStreetField("uyt");
        APP.setBuildingField("245");
        APP.setCityField("Zahraa El-maadi");
        Thread.sleep(2000);
        APP.setDistrictField("wfsa");
        APP.clickHomeButton();
        APP.clickSaveAddressButton();
        Thread.sleep(5000);
        assertEquals(APP.getDistrictErrorMessage(),"Please enter valid district");

    }
    @Test //OK
    public void testAddAddressTestFailedMobile() throws InterruptedException {
        AddressPage APP = homePage.goToAddressPage();
        APP.sendPassword();
        Thread.sleep(2000);
        APP.clickAddAddressButton();
        APP.setNameField("ahmed");
        APP.setMobileField("");
        APP.setStreetField("uyt");
        APP.setCityField("Zahraa El-maadi");
        Thread.sleep(2000);
        APP.setDistrictField("wfsa");
        APP.setBuildingField("245");
        APP.clickHomeButton();
        APP.clickSaveAddressButton();
        Thread.sleep(5000);
        assertEquals(APP.getMobileErrorMessage(),"Please enter a phone number so we can call if there are any issues with delivery.");

    }
}
