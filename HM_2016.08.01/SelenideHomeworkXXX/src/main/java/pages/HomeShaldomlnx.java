package pages;

import com.codeborne.selenide.Condition;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.io.File;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomeShaldomlnx {

    private static final By CLICK_AUT_MENU = Locators.get("ClickAutMenu");
    private static final By CLICK_USER_INFO = Locators.get("ClickUserInfo");
    private static final By UPLOAD_FILE = Locators.get("UploadFile");
    private static final By SAVE_IMAGE = Locators.get("SaveImage");
    private static final By SAVE_CHANGES = Locators.get("SaveChanges");
    private static final By Assert = Locators.get("Assert");


    public static void uploadImage(){
        $(CLICK_AUT_MENU).click();
        $(CLICK_USER_INFO).click();
        $(UPLOAD_FILE).uploadFile(new File("E:\\avatar.png"));
        $(SAVE_IMAGE).click();
        $(SAVE_CHANGES).click();
        $(Assert).shouldHave(Condition.text("Ульрих Франкинштейн  (27 лет) "));
    }

    public static void uploadBlacImage(){
        $(CLICK_AUT_MENU).click();
        $(CLICK_USER_INFO).click();
        $(UPLOAD_FILE).uploadFile(new File("E:\\avatar1.png"));
        $(SAVE_IMAGE).click();
        $(SAVE_CHANGES).click();
    }
}
