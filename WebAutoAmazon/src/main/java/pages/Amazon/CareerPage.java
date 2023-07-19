package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base.BasePage;

public class CareerPage extends BasePage {
    public CareerPage(WebDriver driver){
        this.driver = driver;
    }
    private By LocationChecker = By.xpath("(//div[@class=\"info first col-12 col-md-8\"]/p)[1]");
private By SearchFIeld =By.id("search_typeahead");
    private By LocationFIeld =By.id("location-typeahead");
    private By SearchButton =By.id("search-button");


    public void sendJobName(){sendData(SearchFIeld,"Automation Engineer");}
    public void sendJobLocation(){sendData(LocationFIeld,"Egypt");}
    public void clickSearch(){clickLink(SearchButton);}
    public String getLocationChecker (){return getText(LocationChecker);}
}
