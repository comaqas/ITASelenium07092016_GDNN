package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class MainZubovichPage {
    private static final By LOGIN = Locators.get("Login");
    private static final By PASSWORD = Locators.get("Password");
    private static final By LOGIN_BUTTON = Locators.get("LoginButton");
    private static final By USER_EMAIL_ACCOUNT = Locators.get("UserEmailAccount");

    public static void loginEmail(String login, String password) throws InterruptedException {
        $(LOGIN).sendKeys(login);
        $(PASSWORD).sendKeys(password);
        $(LOGIN_BUTTON).click();
        Thread.sleep(10000);

    }
        public static boolean checkAccount(String account) {

        if ($(USER_EMAIL_ACCOUNT).isDisplayed() && $(USER_EMAIL_ACCOUNT).getText().equals(account)){
            return true;
        }
        return false;
    }
}
