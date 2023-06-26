package product;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.ProductDetailsPage;
import pages.ProductListingPage;

public class ProductTests extends BaseTests {

//Search for existing product
    @Test
    public void testSearchValidItem() {
        ProductListingPage prod= homePage.searchItem("playstation 5");
        ProductDetailsPage detes= prod.goToProductDetailsPage(2);
      CheckoutPage bes= detes.goToCheckoutPage();
        System.out.println(bes.getCheckoutTitle());

    }
//    @Test
//    public void testSearchValidItemAndPriceRange() {
//        ProductListingPage prod= homePage.searchItem("playstation 5");
//        System.out.println(  homePage.getIntAndReplaceComma(prod.getPriceOfFirstListedProduct()));
//    }
}

