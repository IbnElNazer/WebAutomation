package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base.BasePage;

public class ProductDetailsPage extends BasePage {


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
    private By AltImg =By.xpath("//div[@id=\"imgTagWrapperId\"]/img");



    public void clickAddToListButton(){
        clickLink(AddToListButton);
    }
    public String getListAddedMsg(){
        return getText(ListAddedMsg);
    }
    public String getAltImg(){
        return driver.findElement(AltImg).getAttribute("alt");
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
        return getText(AddToCartSuccessMessage);
    }
    public String getBrandName(){
        return getText(BrandName);
    }
    public String getProductTitle(){
        return getText(ProductTitle);
    }
    public String getProductPrice(){
        return getText(ProductPrice);
    }

    public String getAboutThisItemSection(){
        return getText(AboutThisItemSection);
    }
    public String getCustomersAlsoViewed(){
        return getText(CustomersAlsoViewed);
    }
    public String getFrequentlyBoughtTogether(){
        return getText(FrequentlyBoughtTogether);
    }
    public String getProductDescription(){
        return getText(ProductDescription);
    }
    public String getProductDetails(){ return getText(ProductDetails);}
    public String getCustomerReviews(){

     return getText(CustomerReviews);
        }




}
