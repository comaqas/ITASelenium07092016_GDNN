package staticTest;


import core.TestBase;
import org.testng.annotations.Test;
import pages.EmailPageStatic;
import pages.LoginEmailPageStatic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class StaticPOTest extends TestBase{

    @Test
    public void loginEmailTest(){
        String loginEmail = "strong.zubovich@bk.ru";
        String passwordEmail = "ZXCvbn123!";


        LoginEmailPageStatic.enterLoginEmail(driver, loginEmail);
        LoginEmailPageStatic.enterPasswordEmail(driver, passwordEmail);
        LoginEmailPageStatic.clickButtonEmail(driver);
        LoginEmailPageStatic.checkAccount(driver,loginEmail);

        assertTrue(LoginEmailPageStatic.checkAccount(driver,loginEmail));
    }
    @Test(dependsOnMethods = {"loginEmailTest"})
    public void calculateLetters(){

        assertEquals(EmailPageStatic.calculateLetters(driver), 54);


    }
}
