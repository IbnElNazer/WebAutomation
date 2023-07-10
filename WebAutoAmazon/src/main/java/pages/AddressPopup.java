package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AddressPopup { //done

    WebDriver driver;

    private By AdressElements = By.xpath("//ul[@id='GLUXAddressList']//li"); //returns a list of items
    private By DropDownGovernateMenu =By.xpath("//a[contains(@role, 'navigation')]");


    public AddressPopup(WebDriver driver){
        this.driver = driver;
    }
    public String displayGov(){
        return driver.findElement(DropDownGovernateMenu).getText();
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

    private WebElement chooseFromListOfElements(int x, By element){
    return findLinks(element).get(x);
}
    private List<WebElement> findLinks(By element){
        return driver.findElements(element);
    }

}
