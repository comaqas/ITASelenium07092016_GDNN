import core.TestBase;
import helpers.RandomHelper;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.Listener;

@Listeners(Listener.class)

public class SearchTest extends TestBase {
    private static final String textSearch = "Blouse";
    private static final String searchText = RandomHelper.getRandomString();

    @Test
    public void searchTest()  {
        SearchPage.blouseSearch(driver, textSearch);
        Assert.assertTrue(SearchPage.checkSearchResult(driver));
    }
    @Test
    public void  noSearchResultTest(){
        SearchPage.searchForInvalidData(driver, searchText);
        Assert.assertTrue(SearchPage.noResultsFound(driver));
    }
}
