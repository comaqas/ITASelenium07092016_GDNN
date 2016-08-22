package test;

import com.codeborne.selenide.Configuration;
import helpers.RandomHelper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomeZubovichPage;
import pages.MainZubovichPage;

import static com.codeborne.selenide.Selenide.open;


public class SendMailTest {


    String login = "strong.zubovich@bk.ru";
    String password = "ZXCvbn123!";
    String mail = "Shaldomlnx@mail.ru";
    String subject = RandomHelper.getRandomString();
    String mailTitle = subject;

    @BeforeTest
    public void setUp(){
        Configuration.startMaximized = true;
        open("https://mail.ru/");
    }

    @Test
    public void loginMailTest() throws InterruptedException {
        Configuration.startMaximized = true;
        MainZubovichPage.loginEmail(login, password);
        Assert.assertTrue(MainZubovichPage.checkAccount(login));

        HomeZubovichPage.writeAndSendMail(mail,subject);

        Assert.assertTrue(HomeZubovichPage.checkMail(mailTitle));
    }
}
