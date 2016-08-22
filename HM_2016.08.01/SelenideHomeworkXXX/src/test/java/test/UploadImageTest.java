package test;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomeShaldomlnx;
import pages.MainShaldomlnx;

public class UploadImageTest {
    String login = "Shaldomlnx@mail.ru";
    String password = "Madluck300889";

    @BeforeTest
    public void setUp(){
        Configuration.startMaximized = true;
        open("https://mail.ru/");
    }


    @Test
    public void uploadImegeTest() throws InterruptedException {

        MainShaldomlnx.loginEmail(login, password);

        HomeShaldomlnx.uploadImage();
    }
    @AfterTest
    public void tearDown() throws InterruptedException {

        HomeShaldomlnx.uploadBlacImage();

    }
}
