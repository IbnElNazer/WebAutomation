package purchase;

import base.BaseTests2;
import org.testng.annotations.Test;
import pages.Amazon.CheckoutPage;

import static org.testng.Assert.*;

public class CheckoutTests extends BaseTests2 {
    @Test
    public void testCheckoutTitle() throws InterruptedException {
        CheckoutPage co = homePage.displayCheckOut();
        Thread.sleep(5000);
        co.sendEmailAndPassword();
        co.waitForAddressButton();
        assertTrue(co.getCheckoutTitle().contains("Checkout"));
    }
    @Test
    public void testQTYTotalItems() throws InterruptedException {
        CheckoutPage co = homePage.displayCheckOut();
        Thread.sleep(5000);
        co.sendEmailAndPassword();
        co.waitForAddressButton();
        co.clickusethisaddressButton();
        Thread.sleep(6000);
        co.clickCashPayment();
        co.waitusethispaymentButton();
        co.clickusethispaymentButton();
        Thread.sleep(6000);
        co.clickSkipOffersButton();
        Thread.sleep(9000);
        assertEquals(Math.addExact(co.getQtyNumberOfProduct(1),co.getQtyNumberOfProduct(2))+" items",co.getSubtotalItems());
    }


    @Test
    public void testUsingValuPaymentMethod() throws InterruptedException {
        CheckoutPage co = homePage.displayCheckOut();
        Thread.sleep(5000);
        co.sendEmailAndPassword();
        co.waitForAddressButton();
        co.clickusethisaddressButton();
        Thread.sleep(6000);
        co.clickValuPaymentButton();
        co.clickusethispaymentButton();
        Thread.sleep(6000);
        assertTrue(co.getValuPaymentChecker().contains("valU"));
}
    @Test
    public void testQTYChangeForFirstItem() throws InterruptedException {
        CheckoutPage co = homePage.displayCheckOut();
        Thread.sleep(5000);
        co.sendEmailAndPassword();
        co.waitForAddressButton();
        co.clickusethisaddressButton();
        Thread.sleep(6000);
        co.clickCashPayment();
        co.waitusethispaymentButton();
        co.clickusethispaymentButton();
        Thread.sleep(6000);
        co.clickSkipOffersButton();
        Thread.sleep(9000);
        co.chngQTy(1);
        System.out.println(co.getQtyNumberOfProduct(1));
    }

}
