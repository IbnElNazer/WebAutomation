package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    private By TotalPrice = By.xpath("(//tr/td[contains(@class,'grand-total-price')])[2]");
    private By ValuPayment = By.id("pp-1JH3tA-86");
    private By Product1Name = By.xpath("(//div[@class=\"a-row breakword\"])[1]");
    private By PlaceOrderBUtton=By.id("is-remove-os-pabt");
    private By EstimatedDeliveryDate = By.className("checkout-chewbacca-contract-promise-content display-inline-block");
    private By CheckoutTitle = By.tagName("h1");
    private By ReviewOrderButton = By.id("spcViewButtonId");
    private By SaveQuantitiesButton =By.xpath("//input[@name=\"continue-bottom\"]");
    private By QtyOfProduct1 =By.id("(//*[@class=\"a-dropdown-prompt\"])[1]");
    private By QtyOfProduct2 =By.id("(//*[@class=\"a-dropdown-prompt\"])[2]");

    public String getCheckoutTitle (){return driver.findElement(CheckoutTitle).getText();
    }
    public String getEstimatedDeliveryDate (){
        return driver.findElement(EstimatedDeliveryDate).getText();
    }
    public String getProduct1Name (){
        return driver.findElement(Product1Name).getText();
    }
    public int getQtyOfProduct1 (){
        return Integer.parseInt( driver.findElement(QtyOfProduct1).getText());
    }
    public int geTotalPrice (){
        return Integer.parseInt( driver.findElement(TotalPrice).getText());
    }
    public int getQtyOfProduct2 (){
        return Integer.parseInt( driver.findElement(QtyOfProduct2).getText());
    }
    public void clickSaveQuantitiesButton(){
        clickLink(SaveQuantitiesButton);
    }

    public void clickReviewOrderButton(){
        clickLink(ReviewOrderButton);
    }

    public void clickValuPayment(){
        clickLink(ValuPayment);
    }
    public void clickPlaceOrderBUtton(){
        clickLink(PlaceOrderBUtton);
    }

    private void clickLink(By element){
        driver.findElement(element).click();
    }
}
