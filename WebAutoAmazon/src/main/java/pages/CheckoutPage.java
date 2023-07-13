package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

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
        return getText(EstimatedDeliveryDate);
    }
    public String getProduct1Name (){
        return getText(Product1Name);
    }
    public int getQtyOfProduct1 (){
        return Integer.parseInt( getText(QtyOfProduct1));
    }
    public int geTotalPrice (){
        return Integer.parseInt( getText(TotalPrice));
    }
    public int getQtyOfProduct2 (){
        return Integer.parseInt( getText(QtyOfProduct2));
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

}
