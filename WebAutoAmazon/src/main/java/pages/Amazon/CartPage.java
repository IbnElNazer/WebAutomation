package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Base.BasePage;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    private By QtyIndicator =By.xpath("(//*/span[@class=\"a-dropdown-prompt\"])[1]"); //hst3mlo eni a3d 3dd el items wl quantity

    private By SubtotalItems =By.id("sc-subtotal-label-activecart");
    private By SubtotalPrice =By.id("sc-subtotal-amount-activecart");
    private  By DeleteButton = By.xpath("(//input[@value=\"Delete\"])[1]");
    private  By PriceIndividualFirstItem =By.xpath("(//span[contains(@class,'sc-price')])[7]");
    private  By PriceIndividualSecondItem =By.xpath("(//span[contains(@class,'sc-price')])[8]");
    private  By NameOfFirstItem =By.xpath("(//span[@class = \"a-truncate-cut\"])[1]");
    private  By NameOfSecondItem =By.xpath("(//span[@class = \"a-truncate-cut\"])[2]");

    private By DeselectAllButton = By.id("deselect-all"); //compare with subtotal price
    private By ProceedTOBuyButton = By.xpath("//div[@data-feature-id=\"proceed-to-checkout-label\"]");
    private By SkipButton = By.id("cvf-signin-with-password-link");

    private int getInt(String items){
        int x = Integer.parseInt(items.replaceAll("[^0-9]",""));
        return x;
    }
    public CheckoutPage clickProceedTOBuyButton( ){
        WebElement tes = driver.findElement(ProceedTOBuyButton);
        Actions act = new Actions(driver);
        act.moveToElement(tes).click().perform();
        return new CheckoutPage(driver);
    }

    public void clickDeselectAllButton( ){
        clickLink(DeselectAllButton);
    }
    public void clickDeleteButton( ){
        clickLink(DeleteButton);
    }
    public void clickSkipButton( ){
        clickLink(SkipButton);
    }
    public String getNameOfSecondItem( ){
        return  getText(NameOfSecondItem);
    }
    public String getNameOfFirstItem( ){
        return  getText(NameOfFirstItem);
    }
    public int getPriceIndividualFirstItem( ){
        return getInt( getText(PriceIndividualFirstItem));
    }
    public int getPriceIndividualSecondItem( ){
        return getInt( getText(PriceIndividualSecondItem));
    }
    public int getQtyIndicator( ){
        return getInt( getText(QtyIndicator));
    }
    public int getSubtotalItems( ){
        return getInt( getText(SubtotalItems));
    }

    public int getSubtotalPrice( ){
       return getIntAndReplaceComma( getText(SubtotalPrice));
    }


    private int getIntAndReplaceComma(String price){
        int x = Integer.parseInt(price.replace(",",""));
        return x;
    }

}
