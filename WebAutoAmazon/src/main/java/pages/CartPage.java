package pages;

import org.openqa.selenium.By;

public class CartPage {
    private By QtyIndicator =By.className("a-dropdown-prompt"); //hst3mlo eni a3d 3dd el items wl quantity

    private By SubtotalItems =By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[1]/div[1]/div/form/div/div/div[1]/span[1]"); //i need an extractor method for int
    private By SubtotalPrice =By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[1]/div[1]/div/form/div/div/div[1]/span[2]/span"); //i need an extractor method for int
    private  By DeleteButton = By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[3]/div[1]/span[2]");
    private  By PriceIndividual =By.className("a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold");
    private  By NameOfFirstItem =By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[3]/ul/li[1]/span/a/span[1]/span/span[1]");
    private By DeselectAllButton = By.id("deselect-all"); //compare with subtotal price
    private By ProceedTOBuyButton = By.id("sc-buy-box-ptc-button");


}
