package product;
import base.BaseTests_Cookies;
import base.BaseTests_Cookies2;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.Amazon.CheckoutPage;
import pages.Amazon.ProductDetailsPage;



public class ProductDetailsPageTests extends BaseTests_Cookies2 {

    @Test
    public void testAddToList() throws InterruptedException {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        Detes.clickAddToListButton();
        Thread.sleep(2000);
       assertEquals(Detes.getListAddedMsg(),"1 item added to");

    }
    @Test
    public void testBuyNow() throws InterruptedException {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        CheckoutPage chk = Detes.goToCheckoutPage();
        assertTrue(chk.getCheckoutTitle().contains("Checkout"));
    }

    @Test
    public void testAddToCart() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        Detes.clickAddToCartButton();
        assertTrue(Detes.getAddToCartSuccessMessage().contains("Added to Cart"));
    }
    @Test
    public void testAboutThisItemSectionIsFound() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getAboutThisItemSection(),"About this item");}
    @Test
    public void testBrandNameIsFound() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getBrandName(),"Brand: Sony");}
    @Test
    public void testProductTitleIsFound() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductTitle(),"Sony PlayStation 5 Console with Wireless Controller, Middle East Version - White and Black");}
    @Test
    public void testProductPriceIsFound() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductPrice(),"29,450");}
    @Test
    public void testCustomersAlsoViewedIsFound() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getCustomersAlsoViewed(),"Customers who viewed this item also viewed");}
    @Test
    public void testFrequentlyBoughtTogetherIsFound() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getFrequentlyBoughtTogether(),"Frequently bought together");}
    @Test
    public void testProductDescriptionIsFound() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductDescription(),"Product description");}

    @Test
    public void testCustomerQAIsFound() throws InterruptedException {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getCustomerReviews(),"Customer Reviews");}

    @Test
    public void testWCAG() {
        ProductDetailsPage Detes = new ProductDetailsPage(driver);  // test for WCAG that has alt description for pictures
        assertEquals(Detes.getAltImg(),"Sony PlayStation 5 Console with Wireless Controller, Middle East Version - White and Black");







}}
