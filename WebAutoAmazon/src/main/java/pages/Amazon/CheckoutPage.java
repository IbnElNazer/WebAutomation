package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Base.BasePage;

import java.util.List;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    private By TotalPrice = By.xpath("(//tr/td[contains(@class,'grand-total-price')])[2]");
    private By CashPayment = By.xpath("//input[@value=\"instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false\"]");
    private By ValuPayment = By.xpath("//input[@value=\"instrumentId=amzn1.pm.pma.gil-TG9hbjpHbG9iYWxJbnN0YWxsbWVudExlbmRpbmdDcmVkaXRMaW5l.QTUxQUdVT0wxOE1KSQ&isExpired=false&paymentMethod=Loan&tfxEligible=false\"]");
    private By ValuPaymentChecker = By.xpath("//div[@id=\"callouts\"]//span/span[@class=\"break-word\"]");
    private By Product1Name = By.xpath("(//div[@class=\"a-row breakword\"])[1]");
    private By PlaceOrderBUtton=By.id("is-remove-os-pabt");
   // private By EstimatedDeliveryDate = By.className("checkout-chewbacca-contract-promise-content display-inline-block");
    private By CheckoutTitle = By.tagName("h1");
    private By ReviewOrderButton = By.id("spcViewButtonId");
    private By SaveQuantitiesButton =By.xpath("//input[@name=\"continue-bottom\"]");
    private By SubtotalItems =By.xpath("//h1//span[@class=\"a-color-link clickable-heading\"]");
    private By QtyOfProduct =By.xpath("//span[@data-action=\"a-dropdown-button\"]//span[@class=\"a-dropdown-prompt\"]");
    private By usethisaddressButton = By.id("shipToThisAddressButton");
    private By usethispaymentButton = By.xpath("//span/input[@name=\"ppw-widgetEvent:SetPaymentPlanSelectContinueEvent\"]");
    private By OffersSectionCreditText =By.xpath("//div[@id=\"pp-Q6QYZE-55\"]//div[@class=\"a-row\"]/span");
    private By OffersSectionButton =By.xpath("//div[@id=\"no-thanks-container\"]//button[@class=\"a-button-text a-text-center\"]");
    private By ItemsCheckoutSection = By.xpath("//div[@aria-label=\"Items and shipping\"]//h3");

    public String getCheckoutTitle (){return getText(CheckoutTitle);} // Displays checkout title at top of the screen
    public void clickItemsCheckoutSection(){clickLink(ItemsCheckoutSection);} // Chooses the items section so i can get the qtys directly
    public String getProduct1Name (){
        return getText(Product1Name);
    } //
    public String getQtyOfProduct1AsString (int x){return getAllQtys().get(x-1).getText();} // get the qty of first item as a string
    public int getQtyNumberOfProduct (int x){return Integer.parseInt(getQtyOfProduct1AsString(x)); } // converts the qty of first item from a string to int for math operations
    public String getTotalPriceAsString (){return getText(TotalPrice);} // get the qty of first item as a string
    public int getTotalPrice (){ return Integer.parseInt( getTotalPriceAsString());}// converts the Total price from a string to int for math operations
    public List<WebElement> getAllQtys(){
        return driver.findElements(QtyOfProduct);
    }

    public void clickSaveQuantitiesButton(){
        clickLink(SaveQuantitiesButton);
    }
    public void clickusethisaddressButton(){clickLink(usethisaddressButton);
    }
    public void clickReviewOrderButton(){
        clickLink(ReviewOrderButton);
    }
    public void clickCashPayment(){clickLink(CashPayment);}
    public void clickPlaceOrderBUtton(){
        clickLink(PlaceOrderBUtton);
    }
    public void waitForAddressButton(){waiter(usethisaddressButton);}
    public void waitusethispaymentButton(){waiter(usethispaymentButton);}
    public void clickusethispaymentButton(){clickLink(usethispaymentButton);}
    public void clickSkipOffersButton(){clickLink(OffersSectionButton);}
    public String getSubtotalItems (){return getText(SubtotalItems);}
    //------------------------------------------------------------------
    public String getValuPaymentChecker (){return getText(ValuPaymentChecker);}
    public void clickValuPaymentButton(){clickLink(ValuPayment);}
    //------------------------------------------------------------------
public void chngQTy(int x){
    getAllQtys().get(x-1).sendKeys("5");
}
}
