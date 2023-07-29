package product;

import base.BaseTests_Credentials;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;
import pages.Amazon.ProductListingPage;

import static org.testng.Assert.*;

public class ProductTests extends BaseTests_Credentials {

    String SearchItem="Playstation 5";

    @Test
    public void testPaginationBarExists() {
        ProductListingPage prod= homePage.searchItem(SearchItem); //Search for an item to go to product listing page
        assertTrue(prod.getPaginationStrip().contains("Next"));// check if pagination bar exists in the bottom of the page
    }

    @Test
    public void testPageTitle() {
        ProductListingPage prod= homePage.searchItem(SearchItem); //Search for an item to go to product listing page
        assertEquals(prod.getPageTitle() , "Amazon.eg : Playstation 5"); // Check title is matched

    }

    @Test
    public void testResultsHeaderShows() {
        ProductListingPage prod= homePage.searchItem(SearchItem); //Search for an item to go to product listing page
        assertEquals(prod.getResultsHeader(),"Results");  //Checks "results" title is present
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
    @Test
    public void checkboxFulfilledByAmazonIsCheckedTest() throws InterruptedException {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        prod.clickFUllfilledByAmazon();
        assertTrue(prod.getFUllfilledByAmazonButton().isEnabled());
    }

    @Test
    public void checkFulfilledByAmazonTest() throws InterruptedException {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        prod.clickFUllfilledByAmazon();
        assertEquals(prod.getFUllfilledByAmazonText(),"Fulfilled by Amazon - FREE Shipping");
    }




}

