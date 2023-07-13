package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage extends BasePage {

    private By FirstAddressName = By.xpath("//div[@id='ya-myab-display-address-block-0']//li[1]/span/span");
    private By RemoveFirstAddress= By.id("ya-myab-address-delete-btn-0");
    private By ConfirmButton = By.id("deleteAddressModal-0-submit-btn");
    public AddressPage(WebDriver driver){
        this.driver=driver;

    }

    public void setRemoveFirstAddress(){
        clickLink(RemoveFirstAddress);
        clickLink(ConfirmButton);
    }
    public String getFirstAddressName(){
        return getText(FirstAddressName);
    }

}
