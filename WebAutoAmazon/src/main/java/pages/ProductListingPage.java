package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductListingPage {

    private WebDriver driver;

    private By ResultsHeader = By.xpath("//span[@data-component-id=\"1\"]");
    private By PaginationStrip= By.className("s-pagination-strip");
    private By FirstResultName= By.xpath("//*[@data-index=\"2\"]//h2");
    private By PriceOfFirstListedProduct = By.xpath("//*[@data-index=\"2\"]//span[@class=\"a-price-whole\"]");
    private By SearchField= By.id("twotabsearchtextbox");
    private By SearchButton= By.id("nav-search-submit-button");
    private By SearchSuggestionListItems = By.className("s-suggestion-container");
    private By SearchSuggestionList = By.id("nav-flyout-searchAjax");

    private By PriceFilter400AndUp= By.id("p_36/26088918031");
    public ProductListingPage(WebDriver driver){
        this.driver = driver;
    }



public List<WebElement>  getSearchSuggestionList() throws InterruptedException {
        driver.findElement(SearchField).clear();
        driver.findElement(SearchField).sendKeys("dad");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.elementToBeClickable(SearchSuggestionList));
    Thread.sleep(2000);
    return driver.findElements(SearchSuggestionListItems);
}
    public String getPageTitle(){
        return driver.getTitle();
}
    public String getPaginationStrip (){
        return driver.findElement(PaginationStrip).getText();
    }
    public String getResultsHeader (){
        return driver.findElement(ResultsHeader).getText();
    }
    public String getFirstResultName (){
        return driver.findElement(FirstResultName).getText();
    }
    public int getPriceOfFirstListedProduct( ){
        return getInt( driver.findElement(PriceOfFirstListedProduct).getText());
    }
    public void clickPriceFilter400AndUp(){
        clickLink(PriceFilter400AndUp);
    }

    private int getInt(String items){
        int x = Integer.parseInt(items.replaceAll("[^0-9]",""));
        return x;
    }

    public HomePage searchNullItem(){
        driver.findElement(SearchField).clear();
        clickLink(SearchButton);
        return new HomePage(driver);
    }
    private void clickLink(By element){
        driver.findElement(element).click();
    }

}
