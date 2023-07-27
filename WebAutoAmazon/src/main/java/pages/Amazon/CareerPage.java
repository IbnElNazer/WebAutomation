package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.Base.BasePage;

public class CareerPage extends BasePage {
    public CareerPage(WebDriver driver){
        this.driver = driver;
    }
    private final By JobNameChecker = By.className("job-title");
    private final By SearchField =By.xpath("(//input[@id=\"search_typeahead\"])[2]");

    public void sendJobName(String job){
        sendData(SearchField,job);
    driver.findElement(SearchField).sendKeys(Keys.ENTER);}
    public String getJobName (int x){ return (chooseFromListOfElements(x,JobNameChecker)).getText();}

}
