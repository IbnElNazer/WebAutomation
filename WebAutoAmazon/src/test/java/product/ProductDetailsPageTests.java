package product;
import base.BaseTests2;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.CheckoutPage;
import pages.ProductDetailsPage;



public class ProductDetailsPageTests extends BaseTests2 {

    @Test//notOk
    public void testAddToList() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        Detes.clickAddToListButton();
       assertEquals(Detes.getListAddedMsg(),"1 item added to");

    }
    @Test//not ok bt3l2
    public void testBuyNow() throws InterruptedException {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        CheckoutPage chk = Detes.goToCheckoutPage();
        assertEquals(chk.getCheckoutTitle(),"Checkout");
    }

    @Test //OK
    public void testAddToCart() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        Detes.clickAddToCartButton();
        assertTrue(Detes.getAddToCartSuccessMessage().contains("Added to Cart"));
    }
    @Test //OK
    public void testAboutThisItemSectionIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getAboutThisItemSection(),"About this item");}
    @Test //OK
    public void testBrandNameIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getBrandName(),"Brand: Sony");}
    @Test //OK
    public void testProductTitleIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductTitle(),"Sony PlayStation 5 Console with Wireless Controller, Middle East Version - White and Black");}
    @Test//OK
    public void testProductPriceIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductPrice(),"29,450");}
    @Test//OK
    public void testCustomersAlsoViewedIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getCustomersAlsoViewed(),"Customers who viewed this item also viewed");}
    @Test //OK
    public void testFrequentlyBoughtTogetherIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getFrequentlyBoughtTogether(),"Frequently bought together");}
    @Test //OK
    public void testProductDescriptionIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductDescription(),"Product description");}

    @Test //OK
    public void testCustomerQAIsFound() throws InterruptedException {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getCustomerReviews(),"Customer Reviews");}






}
