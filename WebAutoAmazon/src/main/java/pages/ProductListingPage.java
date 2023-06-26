package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListingPage {

    private WebDriver driver;

    public ProductListingPage(WebDriver driver){
        this.driver = driver;
    }

    //hntklm 3n el search hna




//3mlt el id morkb 3shan a3rf a8yr el locator 3shan p_89 de sabta
    //private By CheckboxButton= By.id("p_89/"+BrandName);
    private By NameOfFirstListedProduct = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span");
private By namsd = By.cssSelector("data-index= 2");
    private By PriceOfFirstListedProduct = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div[2]/a/span/span[2]/span[2]");
                                                                 ///html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/div/a/span/span[2]/span[2]
    //private By RatingOfFirstListedProduct = By.className("a-icon a-icon-star-small a-star-small-4 aok-align-bottom");
    private By AddProductToCartButton = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[5]/span/div/div[1]/form/span/div/div/span/span/button");
private By allItems = By.cssSelector("[data-index='2']");
    public String getNameOfFirstListedProduct() {
        String name;
        return name= (driver.findElement(NameOfFirstListedProduct).getText());
    }

    public String getPriceOfFirstListedProduct() {
        String price;
        return price= (driver.findElement(PriceOfFirstListedProduct).getText());
    }

    public List<WebElement> getRatingOfFirstListedProduct() {
       List< WebElement> rate;
        return rate= (driver.findElements(RatingOfFirstListedProduct));
    }
    public void clickFirstItem(){
        clickLink(namsd);
    }
    public void allitems( int x){
        WebElement figure = driver.findElements(allItems).get(x - 1);
        figure.click();
    }

    public ProductDetailsPage goToProductDetailsPage(int x) {

        allitems(x);

        return new ProductDetailsPage(driver);

    }
    private void clickLink(By element){
        driver.findElement(element).click();
    }

}
