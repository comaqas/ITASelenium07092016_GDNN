import core.TestBase;
import helpers.RandomHelper;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import pages.SignInPage;
import reporting.Listener;

@Listeners(Listener.class)

public class RegistrationTest extends TestBase {
    private static final String mail = RandomHelper.getRandomEmail();

    @Test
    public void registrationTest()  {
        MainPage.clickSingIn(driver);
        SignInPage.enterMailAndCreateAccount(driver, mail);
        RegistrationPage.registration(driver);
        Assert.assertTrue(RegistrationPage.myAccountRegistrationCheck(driver));
    }

    @Test
    public void failedRegistrationTest(){
        MainPage.clickSingIn(driver);
        SignInPage.enterMailAndCreateAccount(driver, mail);
        RegistrationPage.registration(driver );
        Assert.assertTrue(RegistrationPage.myAccountRegistrationFailed(driver));

    }
}