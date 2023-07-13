package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    public WebDriver driver;
    public void clickLink(By element){
        driver.findElement(element).click();
    }
    public WebElement chooseFromListOfElements(int x, By element){
        return findLinks(element).get(x);
    }

    public String getText(By element){
        return driver.findElement(element).getText();
    }
    public List<WebElement> findLinks(By element){
        return driver.findElements(element);
    }
}
