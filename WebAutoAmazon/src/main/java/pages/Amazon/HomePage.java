package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Base.BasePage;

public class HomePage extends BasePage {


    private By loginButton= By.id("nav-link-accountList-nav-line-1");

    private By SearchField= By.id("twotabsearchtextbox");
    private By SearchButton= By.id("nav-search-submit-button");
    private By AddressButton = By.id("nav-global-location-popover-link");
    private By UserUniquePageButton= By.id("nav-your-amazon-text");
    private By AddressFromUser = By.id("nav_prefetch_youraddresses");
    private By userName = By.id("nav-link-accountList-nav-line-1");
    private By userMenu = By.id("nav-tools");
    private By userlists = By.xpath("(//div/a/span[@class=\"nav-text\"])[5]");
    private By AmazonLogo = By.id("nav-logo");
    private By FlashSalesIMG =By.xpath("//img[@alt=\"Flash Deals\"]");
    private By CartButton = By.id("nav-cart-count-container");
    private By CareersButton =By.xpath("//div[@id=\"navFooter\"]//ul/li/a[@href=\"http://amazon.jobs\"]");
    private By LanguageOptions = By.id("icp-nav-flyout");
    private By ArabicLanguage =By.xpath("(//span[@dir=\"rtl\"])[1]");
    private By TodayOffersInArabic =By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_0\"]");



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
    public AddressPage goToAddressPage(){
        hoverToElement(userName);
        clickLink(AddressFromUser);
        return new AddressPage(driver);
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
    public CheckoutPage displayCheckOut() throws InterruptedException {
        clickLink(CartButton);
        Thread.sleep(2000);
        CartPage ct = new CartPage(driver);
        return ct.clickProceedTOBuyButton();
    }
    public CareerPage displayCareerPage(){
        clickLink(CareersButton);
        return new CareerPage(driver);
    }
    public CartPage displayCartPage(){
        clickLink(CartButton);
        return new CartPage(driver);
    }
    public void clickArabicLanguage() throws InterruptedException {
        Thread.sleep(4000);
        hoverToElement(LanguageOptions);
        Thread.sleep(2000);
        waiter(ArabicLanguage);
        clickLink(ArabicLanguage);
    }
    public String getTodayOffersInArabicText(){
       return getText(TodayOffersInArabic);
    }


    public String getFlashSAlesIMG () {
        return driver.findElement(FlashSalesIMG).getAttribute("src");
    }
    public WebElement getAmazonLogo(){
        return driver.findElement(AmazonLogo);
    }
    public String getPageTitle() {
        return driver.getTitle();
    }
    public void setSearchItem(String item){driver.findElement(SearchField).sendKeys(item);}
    public void clickSearchButton(){clickLink(SearchButton);}
    public void getToDestination(String url){driver.navigate().to(url);}

}
