package purchase;

import base.BaseTests2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;

import static org.testng.Assert.*;

public class CheckoutTests extends BaseTests2 {
    @Test
    public void testCheckoutTitle(){
        homePage.getToDestination("https://www.amazon.eg/gp/buy/addressselect/handlers/display.html?_from=cheetah");
        CheckoutPage co = new CheckoutPage(driver);
        assertEquals(co.getCheckoutTitle(),"Checkout");
    }

}
