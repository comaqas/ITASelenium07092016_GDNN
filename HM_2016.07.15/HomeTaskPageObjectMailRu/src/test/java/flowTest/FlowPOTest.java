package flowTest;

import core.TestBase;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.Test;
import pages.EmailPageFlow;
import pages.LoginEmailPageFlow;

public class FlowPOTest extends TestBase {

    @Test
    public void loginEmailTest() {
        LoginEmailPageFlow page = new LoginEmailPageFlow(driver);
        page
                .enterLogin("strong.zubovich@bk.ru")
                .enterPassword("ZXCvbn123!")
                .putButton()
                .userAccount("PH_user-email");
    }
    @Test(dependsOnMethods = {"loginEmailTest"})
    public void calculateLetters(){
        EmailPageFlow page = new EmailPageFlow(driver);
        page
                .calculateAllLetters();
    }
}
