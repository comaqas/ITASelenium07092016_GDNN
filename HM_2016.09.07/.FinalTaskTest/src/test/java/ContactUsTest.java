import core.TestBase;
import helpers.RandomHelper;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.MainPage;
import reporting.Listener;

@Listeners(Listener.class)

public class ContactUsTest extends TestBase {
    private static final String mail = RandomHelper.getRandomEmail();
    private static final String order = RandomHelper.getRandomString();
    private static final String file = "E:\\text.txt";
    private static final String message = RandomHelper.getRandomSubject();
    private static final String errorMessage = "";

    @Test
    public void contactUsPageFormFillingAndSuccessfulMessageReceiving()  {
        MainPage.clickContactUs(driver);
        ContactUsPage.messageSending(driver, mail, order, file, message);
        Assert.assertTrue(ContactUsPage.successfulMessageCheck(driver));
    }
    @Test
    public void contactUsPageFormFillingAndErrorMessageReceiving() {
        MainPage.clickContactUs(driver);
        ContactUsPage.messageSending(driver, mail, order, file, errorMessage);
        Assert.assertTrue(ContactUsPage.errorMessageCheck(driver));
    }
}

