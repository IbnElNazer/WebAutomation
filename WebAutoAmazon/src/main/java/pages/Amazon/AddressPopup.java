package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.Base.BasePage;

public class AddressPopup extends BasePage { //done



    private final By AddressElements = By.xpath("//ul[@id='GLUXAddressList']//li"); //returns a list of items
    private final By DropDownGovernorateMenu =By.id("GLUXCityList");
    private final By DeliverToLocationText = By.id("glow-ingress-line2");


    public AddressPopup(WebDriver driver){
        this.driver = driver;
    }
    public String displayLocationText() {return getText(DeliverToLocationText);}
    public void chooseAddress(int x){
         chooseFromListOfElements(x, AddressElements).click();
    }
    public void selectGovernorate(int Gov)
    {
        Select dropdownElement = new Select(driver.findElement(DropDownGovernorateMenu));
        dropdownElement.selectByIndex(Gov);
    }




}
