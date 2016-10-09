import core.TestBase;
import helpers.RandomHelper;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import reporting.Listener;

@Listeners(Listener.class)

public class NewsLetterTest extends TestBase {
    private static final String mail = RandomHelper.getRandomEmail() ;

    @Test
    public  void newsletterTest (){
        MainPage.newsLetter(driver,mail);
        Assert.assertTrue(MainPage.successfulSubscriptionMessage(driver));
    }

}
