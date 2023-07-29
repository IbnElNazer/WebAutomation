package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.Base.BasePage;

public class AddressPage extends BasePage {

    private By FirstAddressName = By.xpath("//div[@id='ya-myab-display-address-block-0']//li[1]/span/span");
    private By RemoveFirstAddress= By.id("ya-myab-address-delete-btn-0");
    private By ConfirmButton = By.id("deleteAddressModal-0-submit-btn");
    private By AddAddressButton = By.id("ya-myab-plus-address-icon");
    private By NameField = By.id("address-ui-widgets-enterAddressFullName");
    private By MobileField = By.id("address-ui-widgets-enterAddressPhoneNumber");
    private By StreetField = By.id("address-ui-widgets-enterAddressLine1");
    private By BuildingField = By.id("address-ui-widgets-enter-building-name-or-number");
    private By CityField = By.id("address-ui-widgets-enterAddressCity");
    private By DistrictField = By.id("address-ui-widgets-enterAddressDistrictOrCounty");
    private By GovernorateField = By.id("address-ui-widgets-enterAddressStateOrRegion");
    private By HomeButton = By.id("address-ui-widgets-addr-details-res-radio-input");
    private  By NameErrorMessage = By.xpath("//div[@id=\"address-ui-widgets-enterAddressFullName-full-validation-alerts\"]//div[@class=\"a-section\"]");
    private  By MobileErrorMessage = By.xpath("//div[@id=\"address-ui-widgets-addr-form-phone-number-inline-hard-alert\"]//div[@class=\"a-section\"]");
    private  By DistrictErrorMessage = By.xpath("//div[@id=\"address-ui-widgets-enterAddressDistrictOrCounty-full-validation-alerts\"]//div[@class=\"a-section\"]");
    private By SaveAddressButton = By.xpath("//span[@id=\"address-ui-widgets-form-submit-button\"]//input[@class=\"a-button-input\"]");
    public AddressPage(WebDriver driver){this.driver=driver;}

    public void setRemoveFirstAddress() throws InterruptedException {
        clickLink(RemoveFirstAddress);
        Thread.sleep(2000);
        clickLink(ConfirmButton);
    }
    public void setNameField(String x){sendData(NameField, x);}
    public void setMobileField(String x){sendData(MobileField, x);}
    public void setStreetField(String x){sendData(StreetField, x);}
    public void setBuildingField(String x){sendData(BuildingField, x);}
    public void setCityField(String x)
    {
        sendData(CityField, x);
        driver.findElement(CityField).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(CityField).sendKeys(Keys.ENTER);
    }
    public void setDistrictField(String x){sendData(DistrictField, x);}
    public void clickSaveAddressButton(){clickLink(SaveAddressButton);}
    public void clickHomeButton(){clickLink(HomeButton);}
    public void clickAddAddressButton(){clickLink(AddAddressButton);}
    public String getGovernorateField(){
        return getText(GovernorateField);
    }

    public String getFirstAddressName(){
        return getText(FirstAddressName);
    }
    public String getNameErrorMessage(){
        return getText(NameErrorMessage);
    }
    public String getMobileErrorMessage(){
        return getText(MobileErrorMessage);
    }
    public String getDistrictErrorMessage(){
        return getText(DistrictErrorMessage);
    }


}
