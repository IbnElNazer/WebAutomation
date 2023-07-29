package purchase;

import base.BaseTests_Cookies;
import base.BaseTests_Credentials;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Amazon.CartPage;
import pages.Amazon.CheckoutPage;

import static org.testng.Assert.assertEquals;

public class CartTests extends BaseTests_Cookies {


    @Test
    public void testFirstProductDetailsQTYInCart(){
        CartPage crt = homePage.displayCartPage();
       assertEquals( crt.getQtyIndicator(),1);

        ;
    }
    @Test
    public void testFirstProductDetailsNameInCart() {
        CartPage crt = homePage.displayCartPage();
        assertEquals(crt.getNameOfFirstItem(), "Sony PlayStation 5 Console with Wireless Controller, Mid…");
    }
    @Test
    public void testFirstProductDetailsPriceInCart() {
        CartPage crt = homePage.displayCartPage();
        assertEquals (crt.getPriceIndividualFirstItem(), 1);
    }

    @Test
    public void testTotalPrice() {
        CartPage crt = homePage.displayCartPage();
        assertEquals (crt.getSubtotalItems(), crt.getPriceIndividualFirstItem() + crt.getPriceIndividualSecondItem());
    }
    @Test
    public void testTotalPriceAfterDeleteItem() {
        CartPage crt = homePage.displayCartPage();
        float price = crt.getSubtotalPrice();
        crt.clickDeleteButton();
        assertEquals (crt.getSubtotalItems(), crt.getPriceIndividualSecondItem());
    }
    @Test
    public void testTotalPriceAfterDeselectAll() {
        CartPage crt = homePage.displayCartPage();
        crt.clickDeselectAllButton();
        assertEquals (crt.getSubtotalItems(), 0);
    }

//    @Test
//    public void testProceedToCheckout() throws InterruptedException {
//        CartPage crt = homePage.displayCartPage();
//        CheckoutPage chk = crt.clickProceedTOBuyButton();
//        Thread.sleep(2000);
//        crt.clickSkipButton();
//        crt.sendPassword();
//        crt.clickProceedTOBuyButton();
//        Thread.sleep(2000);
//        crt.sendPassword();
//        Thread.sleep(2000);
//        assertEquals(chk.getCheckoutTitle(),"Checkout");
//    }





}
