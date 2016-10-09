import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.SearchPage;
import reporting.Listener;

@Listeners(Listener.class)

public class SearchGoodsAddCartAndDeleteTest extends TestBase {
    private final String textSearch = "Faded Short Sleeve T-shirts";

    @Test
    public void searchGoodsTest()  {
        SearchPage.goodsSearch(driver, textSearch);
        Assert.assertTrue(CartPage.checkGoodsInCart(driver));
        CartPage.deleteGoods(driver);
        Assert.assertTrue(CartPage.checkWhatGoodsDelete(driver));
    }
}
