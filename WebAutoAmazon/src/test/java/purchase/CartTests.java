package purchase;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Amazon.CartPage;
import pages.Amazon.CheckoutPage;

import static org.testng.Assert.assertEquals;

public class CartTests extends BaseTests {

    WebDriver driver;


    @Test
    public void testFirstProductDetailsQTYInCart(){
        CartPage crt = new CartPage(driver);
       assertEquals( crt.getQtyIndicator(),1);

        ;
    }
    @Test
    public void testFirstProductDetailsNameInCart() {
        CartPage crt = new CartPage(driver);
        assertEquals(crt.getNameOfFirstItem(), "");
    }
    @Test
    public void testFirstProductDetailsPriceInCart() {
        CartPage crt = new CartPage(driver);
        assertEquals (crt.getPriceIndividualFirstItem(), 1);
    }

    @Test
    public void testTotalPrice() {
        CartPage crt = new CartPage(driver);
        assertEquals (crt.getSubtotalItems(), crt.getPriceIndividualFirstItem() + crt.getPriceIndividualSecondItem());
    }
    @Test
    public void testTotalPriceAfterDeleteItem() {
        CartPage crt = new CartPage(driver);
        float price = crt.getSubtotalPrice();
        crt.clickDeleteButton();
        assertEquals (crt.getSubtotalItems(), crt.getPriceIndividualSecondItem());
    }
    @Test
    public void testTotalPriceAfterDeselectAll() {
        CartPage crt = new CartPage(driver);
        crt.clickDeselectAllButton();
        assertEquals (crt.getSubtotalItems(), 0);
    }

    @Test
    public void testProceedToCheckout() {
        CheckoutPage chk = cartPage.clickProceedTOBuyButton();
        assertEquals(chk.getCheckoutTitle(),"Checkout");
    }





}
