import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;
import reporting.Listener;

@Listeners(Listener.class)

public class SingInTest extends TestBase{
    private static final String mail = "Shaldomlnx@mail.ru";
    private static final String password = "Madluck300889";
    @Test
    public void  checkAccount(){
        MainPage.clickSingIn(driver);
        SignInPage.enterMailForAccount(driver,mail, password);
        Assert.assertTrue(SignInPage.checkAccountIsDislayed(driver));
    }
}
