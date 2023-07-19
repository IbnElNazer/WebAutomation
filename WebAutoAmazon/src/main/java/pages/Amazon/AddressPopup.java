package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.Base.BasePage;

public class AddressPopup extends BasePage { //done



    private By AdressElements = By.xpath("//ul[@id='GLUXAddressList']//li"); //returns a list of items
    private By DropDownGovernateMenu =By.xpath("//a[contains(@role, 'navigation')]");


    public AddressPopup(WebDriver driver){
        this.driver = driver;
    }
    public String displayGov(){
        return getText(DropDownGovernateMenu);
    }
    public String getAddress(int x){
    return chooseFromListOfElements(x,AdressElements).getText();
}
    public void chooseAddress(int x){
         chooseFromListOfElements(x,AdressElements).click();
    }


public void selectGovernate(int Gov){
    Select dropdownelement = new Select(driver.findElement(DropDownGovernateMenu));
    dropdownelement.selectByIndex(Gov);
}



}
