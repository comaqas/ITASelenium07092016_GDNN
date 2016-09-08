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
    private static final String mail =RandomHelper.getRandomEmail() ;
    private static final String firstName = RandomHelper.getFirstNameAndLastName(6);
    private static final String lastName = RandomHelper.getFirstNameAndLastName(7);
    private static final String password = RandomHelper.getPassword(10);
    private static final String day = RandomHelper.getDate();
    private static final String month = RandomHelper.getMonth();
    private static final String year = RandomHelper.getYear();
    private static final String company = RandomHelper.getRandomString();
    private static final String address = RandomHelper.getRandomString();
    private static final String addressLine2 = RandomHelper.getRandomString();
    private static final String city = RandomHelper.getRandomString();
    private static final String information = RandomHelper.getRandomString();
    private static final String homePhone = RandomHelper.getPhoneNumber();
    private static final String mobilePhone = RandomHelper.getPhoneNumber();
    private static final String postalCode = RandomHelper.getPostCode();
    private static final String state = "California";
    private static final String stateWrong = RandomHelper.getRandomString();

    @Test
    public void registrationTest()  {
        MainPage.clickSingIn(driver);
        SignInPage.enterMailAndCreateAccount(driver, mail);
        RegistrationPage.registration(driver, firstName, lastName, password,day,month,year,company,
                address, addressLine2,city, postalCode, information, homePhone,mobilePhone,state );
        Assert.assertTrue(RegistrationPage.myAccountRegistrationCheck(driver));
    }

    @Test
    public void failedRegistrationTest(){
        MainPage.clickSingIn(driver);
        SignInPage.enterMailAndCreateAccount(driver, mail);
        RegistrationPage.registration(driver, firstName, lastName, password,day,month,year,company,
                address, addressLine2,city, postalCode, information, homePhone,mobilePhone,stateWrong );
        Assert.assertTrue(RegistrationPage.myAccountRegistrationFailed(driver));

    }
}