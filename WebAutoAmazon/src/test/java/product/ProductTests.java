package product;

import base.BaseTests;
import base.BaseTests2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductListingPage;

import static org.testng.Assert.*;

public class ProductTests extends BaseTests  {

    String SearchItem="Playstation 5";

//Search for existing product
    @Test
    public void testPaginationBarExists() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        assertTrue(prod.getPaginationStrip().contains("Next"));
    }

    @Test
    public void testPageTitle() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        assertEquals(prod.getPageTitle() , "Amazon.eg : playstation 5");
    }

    @Test
    public void testResultsHeaderShows() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        assertEquals(prod.getResultsHeader(),"Results");
    }

    @Test
    public void testPriceFilter400AndUp() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        prod.clickPriceFilter400AndUp();
        assertTrue(prod.getPriceOfFirstListedProduct()>400);
    }

    @Test
    public void testEmptySearchBarReturnsLandingPage() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        HomePage hm = prod.searchNullItem();
        assertEquals(hm.getPageTitle(),"Your Souq is now Amazon.eg | Welcome to Amazon.eg in Egypt. Online Shopping for Electronics, Apparel, Beauty and Grooming, Grocery and more");
    }
    @Test
    public void testSearchSuggestionListEqual10() throws InterruptedException {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        assertEquals(prod.getSearchSuggestionList().size(),10);
    }


    @Test
    public void testFirstResultName() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        assertTrue(prod.getFirstResultName().contains(SearchItem));
    }





}

