package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
    private WebDriver driver;

    public ProductDetailsPage(WebDriver driver){
        this.driver = driver;
    }
    private By AddToCartButton = By.id("add-to-cart-button");
    private By AboutThisItemSection = By.id("feature-bullets");
    private  By BuyNowButton =By.id("buy-now-button");
    private  By BrandName =By.className("a-spacing-small po-brand");
    private  By HazardWarningText =By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[4]/div[31]/div/ul/li[5]/span");
    private  By ProductTitle =By.id("productTitle");
    private  By ProductPrice =By.className("/html/body/div[2]/div/div[5]/div[3]/div[4]/div[9]/div[3]/div[1]/span[1]/span[2]/span[2]");


    public void clickBuyNowButton(){
        clickLink(BuyNowButton);
    }

    public CheckoutPage goToCheckoutPage(){

        clickBuyNowButton();

        return new CheckoutPage(driver);
    }


    private void clickLink(By element){
        driver.findElement(element).click();
    }

}
