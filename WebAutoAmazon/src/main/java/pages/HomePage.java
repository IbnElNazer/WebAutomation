package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private By loginButton= By.id("nav-link-accountList-nav-line-1");

    private By SearchField= By.id("twotabsearchtextbox");
    private By SearchButton= By.id("nav-search-submit-button");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public LoginPage clickLoginButton() {
        clickLink(loginButton);
        return new LoginPage(driver);
    }
    public ProductListingPage searchItem(String item){
        setSearchItem(item);
        clickSearchButton();
        return new ProductListingPage(driver);
    }
    public int getIntAndReplaceComma(String price){
        int x = Integer.parseInt(price.replace(",",""));
        return x;
    }
    public float getfloat(String rate){
       float x =Float.parseFloat( rate.substring(0,3));
       return  x;
    }
    public void setSearchItem(String item){driver.findElement(SearchField).sendKeys(item);}
    public void clickSearchButton(){clickLink(SearchButton);}
    private void clickLink(By linkText){
        driver.findElement(linkText).click();
    }
}
csacds