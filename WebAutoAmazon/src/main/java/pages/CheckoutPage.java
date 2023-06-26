package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    private By NameField = By.id("address-ui-widgets-enterAddressFullName");
    private By PhoneField = By.id("address-ui-widgets-enterAddressPhoneNumber");
    private By StreetField = By.id("address-ui-widgets-enterAddressLine1");
    private By BuildingField = By.id("address-ui-widgets-enter-building-name-or-number");
    private By GiftCardField = By.id("pp-agyLUl-58");
    private By GiftCardButton = By.id("pp-agyLUl-59");
    private By TotalPrice = By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/table/tbody/tr[6]/td[2]");
    private By CashonDelievery = By.id("pp-agyLUl-63");
    private By SkipOffers = By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[7]/div/div[3]/div[3]/div/div/div/div/div[3]/span");
    private By ProductsNames = By.className("a-row breakword");
    private By PlaceOrderBUtton=By.id("is-remove-os-pabt"); //e3ml list feha kol el elements eli fl cart 3shan ttcheck 3la el asami
    private By EstimatedDeliveryDate = By.className("checkout-chewbacca-contract-promise-content display-inline-block");
    private By CheckoutTitle = By.tagName("h1");


    //dropmenu for country
    //dropmenu for district


    public String getCheckoutTitle (){
       return driver.findElement(CheckoutTitle).getText();
    }
    private void clickLink(By element){
        driver.findElement(element).click();
    }




}
