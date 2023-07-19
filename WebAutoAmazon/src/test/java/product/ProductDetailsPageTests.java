package product;
import base.BaseTests2;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.Amazon.CheckoutPage;
import pages.Amazon.ProductDetailsPage;



public class ProductDetailsPageTests extends BaseTests2 {

    @Test (groups = "Functional") //notOk
    public void testAddToList() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        Detes.clickAddToListButton();
       assertEquals(Detes.getListAddedMsg(),"1 item added to");

    }
    @Test (groups = "Functional") //not ok bt3l2
    public void testBuyNow() throws InterruptedException {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        CheckoutPage chk = Detes.goToCheckoutPage();
        assertEquals(chk.getCheckoutTitle(),"Checkout");
    }

    @Test (groups = "Functional") //OK
    public void testAddToCart() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        Detes.clickAddToCartButton();
        assertTrue(Detes.getAddToCartSuccessMessage().contains("Added to Cart"));
    }
    @Test (groups = "Happy") //OK
    public void testAboutThisItemSectionIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getAboutThisItemSection(),"About this item");}
    @Test (groups = "Happy") //OK
    public void testBrandNameIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getBrandName(),"Brand: Sony");}
    @Test (groups = "Happy") //OK
    public void testProductTitleIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductTitle(),"Sony PlayStation 5 Console with Wireless Controller, Middle East Version - White and Black");}
    @Test (groups = "Happy")//OK
    public void testProductPriceIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductPrice(),"29,450");}
    @Test (groups = "Happy") //OK
    public void testCustomersAlsoViewedIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getCustomersAlsoViewed(),"Customers who viewed this item also viewed");}
    @Test (groups = "Happy") //OK
    public void testFrequentlyBoughtTogetherIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getFrequentlyBoughtTogether(),"Frequently bought together");}
    @Test (groups = "Happy") //OK
    public void testProductDescriptionIsFound() {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getProductDescription(),"Product description");}

    @Test (groups = "Happy") //OK
    public void testCustomerQAIsFound() throws InterruptedException {
        homePage.getToDestination("https://www.amazon.eg/-/en/Sony-PlayStation-Console-Wireless-Controller/dp/B08HKDSVV2");
        ProductDetailsPage Detes = new ProductDetailsPage(driver);
        assertEquals(Detes.getCustomerReviews(),"Customer Reviews");}






}
