package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    private By QtyIndicator =By.className("(//*/span[@class=\"a-dropdown-prompt\"])[1]"); //hst3mlo eni a3d 3dd el items wl quantity

    private By SubtotalItems =By.id("sc-subtotal-label-activecart");
    private By SubtotalPrice =By.id("sc-subtotal-amount-activecart");
    private  By DeleteButton = By.xpath("(//input[@value=\"Delete\"])[1]");
    private  By PriceIndividualFirstItem =By.xpath("(//span[contains(@class,'sc-price')])[7]");
    private  By PriceIndividualSecondItem =By.xpath("(//span[contains(@class,'sc-price')])[8]");
    private  By NameOfFirstItem =By.xpath("(//span[@class = \"a-truncate-cut\"])[1]");
    private  By NameOfSecondItem =By.xpath("(//span[@class = \"a-truncate-cut\"])[2]");

    private By DeselectAllButton = By.id("deselect-all"); //compare with subtotal price
    private By ProceedTOBuyButton = By.id("sc-buy-box-ptc-button");
    private By SkipButton = By.id("prime-declineCTA");

    private int getInt(String items){
        int x = Integer.parseInt(items.replaceAll("[^0-9]",""));
        return x;
    }
    public CheckoutPage clickProceedTOBuyButton( ){

         try {
            //  Block of code to try
             clickLink(ProceedTOBuyButton);

        }
            catch(Exception e) {
            clickLink(SkipButton);
        }
        return new CheckoutPage(driver);
    }
    public void clickDeselectAllButton( ){
        clickLink(DeselectAllButton);
    }
    public void clickDeleteButton( ){
        clickLink(DeleteButton);
    }
    public String getNameOfSecondItem( ){
        return  driver.findElement(NameOfSecondItem).getText();
    }
    public String getNameOfFirstItem( ){
        return  driver.findElement(NameOfFirstItem).getText();
    }
    public int getPriceIndividualFirstItem( ){
        return getInt( driver.findElement(PriceIndividualFirstItem).getText());
    }
    public int getPriceIndividualSecondItem( ){
        return getInt( driver.findElement(PriceIndividualSecondItem).getText());
    }
    public int getQtyIndicator( ){
        return getInt( driver.findElement(QtyIndicator).getText());
    }
    public int getSubtotalItems( ){
        return getInt( driver.findElement(SubtotalItems).getText());
    }

    public int getSubtotalPrice( ){
       return getIntAndReplaceComma( driver.findElement(SubtotalPrice).getText());
    }


    private int getIntAndReplaceComma(String price){
        int x = Integer.parseInt(price.replace(",",""));
        return x;
    }
    private void clickLink(By element){driver.findElement(element).click();}
}
