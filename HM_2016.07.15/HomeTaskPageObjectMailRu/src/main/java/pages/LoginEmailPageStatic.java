package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginEmailPageStatic {

    private static By MAIL_LOGIN = By.id("mailbox__login");
    private static By MAIL_PASSWORD = By.id("mailbox__password");
    private static By LOGIN_BATTON = By.id("mailbox__auth__button");
    private static By USER_EMAIL_ACCOUNT = By.id("PH_user-email");

    public static void  enterLoginEmail(WebDriver driver, String LoginEmail){
        WebElement loginEmail =driver.findElement(MAIL_LOGIN);
        loginEmail.sendKeys(LoginEmail);
    }
    public static void enterPasswordEmail(WebDriver driver, String PasswordEmail){
        WebElement enterPassword = driver.findElement(MAIL_PASSWORD);
        enterPassword.sendKeys(PasswordEmail);
    }
    public static void clickButtonEmail(WebDriver driver){
        WebElement clickButton = driver.findElement(LOGIN_BATTON);
        clickButton.click();
    }
    public static boolean  checkAccount(WebDriver driver, String account) {
        WebElement userEmailAccount = driver.findElement(USER_EMAIL_ACCOUNT);
        if (userEmailAccount.isDisplayed() && userEmailAccount.getText().equals(account)) {
            return true;
        }
        return false;
    }
}
