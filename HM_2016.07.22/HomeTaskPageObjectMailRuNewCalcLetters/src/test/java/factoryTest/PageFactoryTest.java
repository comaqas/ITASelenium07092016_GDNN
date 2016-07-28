package factoryTest;

import core.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.EmailPageSimpleFactory;
import pages.LoginEmailPageSimpleFactory;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PageFactoryTest extends TestBase {

    @Test
    public void loginEmailTest() {
        LoginEmailPageSimpleFactory page = PageFactory.initElements(driver, LoginEmailPageSimpleFactory.class);
        String loginEmail = "strong.zubovich@bk.ru";
        String enterPassword = "ZXCvbn123!";
        page.enterLoginEmail(loginEmail);
        page.enterPasswordEmail(enterPassword);
        page.clickButton();
        assertTrue(page.afterLoginCheck());
    }
    @Test(dependsOnMethods = {"loginEmailTest"})
    public void  calculateLettersTest(){
        EmailPageSimpleFactory page = PageFactory.initElements(driver, EmailPageSimpleFactory.class);

        assertEquals(page.calculateLetters(), 54);
    }
}
