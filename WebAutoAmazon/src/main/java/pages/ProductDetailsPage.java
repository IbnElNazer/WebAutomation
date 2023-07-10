package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {
     WebDriver driver;

    public ProductDetailsPage(WebDriver driver){
        this.driver = driver;
    }
    private By AddToCartButton = By.id("add-to-cart-button");
    private By AddToCartSuccessMessage = By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS");
    private  By BuyNowButton =By.id("buy-now-button");
    private  By BrandName =By.id("bylineInfo");
    private  By ProductTitle =By.id("productTitle");
    private  By ProductPrice =By.xpath("(//span[@class=\"a-price-whole\"])[1]");
    private By AboutThisItemSection = By.xpath("//div[@id=\"feature-bullets\"]/h1");
    //
    private By CustomersAlsoViewed = By.xpath("(//h2)[3]");
    private By FrequentlyBoughtTogether = By.xpath("(//h2)[2]");
    private By ProductDescription = By.xpath("(//h2)[5]");
    private By ProductDetails = By.xpath("(//h2)[6]");
    private By CustomerReviews = By.xpath("//div[@id=\"customer-reviews_feature_div\"]//h2");
    private By AddToListButton = By.id("add-to-wishlist-button-submit");
    private By ListAddedMsg = By.xpath("(//*[@class=\"a-size-medium-plus huc-atwl-header-main\"])[1]");



    public void clickAddToListButton(){
        clickLink(AddToListButton);
    }
    public String getListAddedMsg(){
        return driver.findElement(ListAddedMsg).getText();
    }


    public void clickBuyNowButton(){
        clickLink(BuyNowButton);
    }
    public CheckoutPage goToCheckoutPage() throws InterruptedException {clickBuyNowButton();
//        driver.findElement(By.id("ap_email")).sendKeys("salahtest96@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("11223344aaAA!!");
        driver.findElement( By.id("signInSubmit")).click();
        Thread.sleep(3000);
        return new CheckoutPage(driver);}

    public void clickAddToCartButton(){
        clickLink(AddToCartButton);
    }
    public String getAddToCartSuccessMessage(){
        return driver.findElement(AddToCartSuccessMessage).getText();
    }
    public String getBrandName(){
        return driver.findElement(BrandName).getText();
    }
    public String getProductTitle(){
        return driver.findElement(ProductTitle).getText();
    }
    public String getProductPrice(){
        return driver.findElement(ProductPrice).getText();
    }

    public String getAboutThisItemSection(){
        return driver.findElement(AboutThisItemSection).getText();
    }
    public String getCustomersAlsoViewed(){
        return driver.findElement(CustomersAlsoViewed).getText();
    }
    public String getFrequentlyBoughtTogether(){
        return driver.findElement(FrequentlyBoughtTogether).getText();
    }
    public String getProductDescription(){
        return driver.findElement(ProductDescription).getText();
    }
    public String getProductDetails(){ return driver.findElement(ProductDetails).getText();}
    public String getCustomerReviews(){

     return driver.findElement(CustomerReviews).getText();
        }


    private void clickLink(By element){
        driver.findElement(element).click();
    }

}
