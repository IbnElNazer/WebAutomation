package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserUniquePage {

    private WebDriver driver;
    private By userName = By.id("nav-link-accountList-nav-line-1");

    public UserUniquePage(WebDriver driver){
        this.driver = driver;
    }

    public String getUserName(){
        return driver.findElement(userName).getText();
    }
}
