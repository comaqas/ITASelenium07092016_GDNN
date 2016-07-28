package dynamicTest;

import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailPageDynamic;
import pages.LoginEmailPageDynamic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicPOTest extends TestBase {


    @Test
    public void loginEmailTest() {
        LoginEmailPageDynamic page = new LoginEmailPageDynamic(driver);
        String loginEmail = "strong.zubovich@bk.ru";
        String passwordEmail = "ZXCvbn123!";
        page.enterLoginEmail(loginEmail);
        page.enterPasswordEmail(passwordEmail);
        page.clickLoginButton();

        assertTrue(page.userEmail());
    }
    @Test(dependsOnMethods = {"loginEmailTest"})
    public void calculateLetters(){
        EmailPageDynamic page = new EmailPageDynamic(driver);
        int numberLetters = page.calculateLetters();
        int inBoxLetters = 54;
        Assert.assertEquals(numberLetters, inBoxLetters);


    }
}
