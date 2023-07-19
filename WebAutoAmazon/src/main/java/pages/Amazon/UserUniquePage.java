package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base.BasePage;

public class UserUniquePage extends BasePage {//done


    private By TopPicksElement = By.className("_cDEzb_card-title_1EuRU");

    public UserUniquePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTopPicksElement(){
        return getText(TopPicksElement);
    }

}
