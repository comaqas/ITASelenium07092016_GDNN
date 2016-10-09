import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.OrderHistoryPage;
import pages.SearchPage;
import pages.SignInPage;
import reporting.Listener;

@Listeners(Listener.class)

public class ShoppingTest extends TestBase {
    private final String textSearch = "Faded Short Sleeve T-shirts";
    private final String mail = "Shaldomlnx@mail.ru";
    private final String password = "Madluck300889";

    @Test
    public void buyGoodsTest()  {
        SearchPage.goodsSearch(driver, textSearch);
        CartPage.shopGoods(driver);
        SignInPage.enterMailForAccount(driver, mail, password);
        CartPage.buyingProcess(driver);
        Assert.assertTrue(OrderHistoryPage.verifyOrder(driver));
    }
}
