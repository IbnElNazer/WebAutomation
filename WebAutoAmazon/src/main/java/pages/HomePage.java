package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private WebDriver driver;
    private By loginButton= By.id("nav-link-accountList-nav-line-1");

    private By SearchField= By.id("twotabsearchtextbox");
    private By SearchButton= By.id("nav-search-submit-button");
    private By AddressButton = By.id("nav-global-location-popover-link");
    private By UserUniquePageButton= By.id("nav-your-amazon-text");
    private By userName = By.id("nav-link-accountList-nav-line-1");
    private By userMenu = By.id("nav-tools");
    private By userlists = By.xpath("(//div/a/span[@class=\"nav-text\"])[5]");



    public HomePage(WebDriver driver){
        this.driver = driver;
    }



    public UserListsPage clickListButton() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(userMenu)).build().perform();
        clickLink(userlists);
        return new UserListsPage(driver);
    }

    public LoginPage clickLoginButton() {
        clickLink(loginButton);
        return new LoginPage(driver);
    }
    public AddressPopup clickAddressButton(){
        clickLink(AddressButton);
        return new AddressPopup(driver);
    }
    public UserUniquePage openUserUniquePage(){
        driver.findElement(UserUniquePageButton).click();
        return new UserUniquePage(driver);
    }

    public String getUserName(){
        return driver.findElement(userName).getText();
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
    public String getPageTitle() {
        return driver.getTitle();
    }
        public void setSearchItem(String item){driver.findElement(SearchField).sendKeys(item);}
    public void clickSearchButton(){clickLink(SearchButton);}
    public void getToDestination(String url){driver.navigate().to(url);}
    private void clickLink(By element){
        driver.findElement(element).click();
    }
}
