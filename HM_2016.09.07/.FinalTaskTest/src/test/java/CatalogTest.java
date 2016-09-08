import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import reporting.Listener;

@Listeners(Listener.class)

public class CatalogTest extends TestBase{
    @Test
    public void catalogTest() throws InterruptedException {
        MainPage.chooseTShort(driver);
        Assert.assertTrue(MainPage.womenTShirtCheck(driver));
    }
    @Test
    public void selectionOfGoodsTest() throws InterruptedException {
        MainPage.selectionOfGoodsCheck(driver);
        MainPage.sliderMovePrice(driver);
        Assert.assertTrue(MainPage.checkDress(driver));
    }
}
