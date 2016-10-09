import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.MainPage;
import reporting.Listener;

@Listeners(Listener.class)

public class ContactUsTest extends TestBase {

    @Test
    public void contactUsPageFormFillingAndSuccessfulMessageReceiving()  {
        MainPage.clickContactUs(driver);
        ContactUsPage.messageSending(driver);
        Assert.assertTrue(ContactUsPage.successfulMessageCheck(driver));
    }
    @Test
    public void contactUsPageFormFillingAndErrorMessageReceiving() {
        MainPage.clickContactUs(driver);
        ContactUsPage.messageSendingError(driver);
        Assert.assertTrue(ContactUsPage.errorMessageCheck(driver));
    }
}

