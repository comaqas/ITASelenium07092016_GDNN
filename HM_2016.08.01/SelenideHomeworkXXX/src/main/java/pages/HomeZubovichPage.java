package pages;


import helpers.Locators;
import helpers.RandomHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomeZubovichPage {
    private static int letters;
    private static  String text = "b-toolbar__btn_disabled";
    private static final By WRITE_MAIL = Locators.get("WriteMail");
    private static final By WHOM_MAIL = Locators.get("WhomMail");
    private static final By SUBJECT = Locators.get("Subject");
    private static final By CLICK_SMILE = Locators.get("Smile");
    private static final By SMILE = Locators.get("ChooseSmile");
    private static final By SEND_MAIL = Locators.get("SendMail");
    private static final By CLICK_INBOX = Locators.get("ClickInBox");
    private static final By CHECK_SUBJECT = Locators.get("CheckSubject");
    private static final By LETTERS_ON_PAGE = Locators.get("LettersOnPage");
    private static final By NEXT_PAGE_BUTTON = Locators.get("NextPageButton");
    private static final By NEXT_PAGE_ARROW = Locators.get("NextPageArrow");


    public static void writeAndSendMail(String mail, String subject) throws InterruptedException {

        while (true){
            letters = $$(LETTERS_ON_PAGE).size();
            System.out.println(" a page has " + letters + " letters ");
            if (!$(NEXT_PAGE_BUTTON).getAttribute("class").contains(text)){
                $(NEXT_PAGE_ARROW).click();
            } else
                break;
        }

        $(WRITE_MAIL).click();
        $(WHOM_MAIL).sendKeys(mail);
        $(SUBJECT).sendKeys(subject);
        $(CLICK_SMILE).click();
        $(SMILE).click();
        $(SEND_MAIL).click();
        Thread.sleep(5000);
        $(CLICK_INBOX).click();
        $(CHECK_SUBJECT).click();

    }

    public static boolean checkMail (String getRandomString) {
        if ($(CHECK_SUBJECT).getText().equals(getRandomString)) {
            return true;
        }
        return false;
    }

}

