package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserUniquePage {//done

    private WebDriver driver;

    private By TopPicksElement = By.className("_cDEzb_card-title_1EuRU");

    public UserUniquePage(WebDriver driver){
        this.driver = driver;
    }


    public String getTopPicksElement(){
        return driver.findElement(TopPicksElement).getText();
    }


}
