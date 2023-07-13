package product;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductListingPage;

import static org.testng.Assert.*;

public class ProductTests extends BaseTests  {

    String SearchItem="Playstation 5";

    @Test //OK
    public void testPaginationBarExists() {
        ProductListingPage prod= homePage.searchItem(SearchItem); //Search for an item to go to product listing page
        assertTrue(prod.getPaginationStrip().contains("Next"));// check if pagination bar exists in the bottom of the page
        System.out.println("Pagination bar is present");
    }

    @Test //OK
    public void testPageTitle() {
        ProductListingPage prod= homePage.searchItem(SearchItem); //Search for an item to go to product listing page
        assertEquals(prod.getPageTitle() , "Amazon.eg : playstation 5"); // Check title is matched
        System.out.println("Page title is valid");
    }

    @Test//OK
    public void testResultsHeaderShows() {
        ProductListingPage prod= homePage.searchItem(SearchItem); //Search for an item to go to product listing page
        assertEquals(prod.getResultsHeader(),"Results");  //Checks "results" title is present
        System.out.println("\"Results\" title is present");
    }

    @Test //OK
    public void testPriceFilter400AndUp() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        prod.clickPriceFilter400AndUp();
        assertTrue(prod.getPriceOfFirstListedProduct()>400);
        System.out.println("Price of the product matches the selected price filter");
    }

    @Test //Ok
    public void testEmptySearchBarReturnsLandingPage() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        HomePage hm = prod.searchNullItem();
        assertEquals(hm.getPageTitle(),"Your Souq is now Amazon.eg | Welcome to Amazon.eg in Egypt. Online Shopping for Electronics, Apparel, Beauty and Grooming, Grocery and more");
        System.out.println("Empty search result returns to landing page");
    }
    @Test //OK
    public void testSearchSuggestionListEqual10() throws InterruptedException {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        assertEquals(prod.getSearchSuggestionList().size(),10);
        System.out.println("The suggestion list of the search function consists of 10 items");
    }


    @Test //Ok
    public void testFirstResultName() {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        assertTrue(prod.getFirstResultName().contains(SearchItem));
        System.out.println("The first result contains the item searched for which is "+ SearchItem);
    }
    @Test //OK
    public void checkboxFulfilledByAmazonIsCheckedTest() throws InterruptedException {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        prod.clickFUllfilledByAmazon();
        assertTrue(prod.getFUllfilledByAmazonButton().isEnabled());
        System.out.println("Checkbox is enabled");
    }

    @Test //OK
    public void checkFulfilledByAmazonTest() throws InterruptedException {
        ProductListingPage prod= homePage.searchItem(SearchItem);
        prod.clickFUllfilledByAmazon();
        assertEquals(prod.getFUllfilledByAmazonText(),"Fulfilled by Amazon - FREE Shipping");
        System.out.println("The checkbox is applied to the search results");
    }




}

