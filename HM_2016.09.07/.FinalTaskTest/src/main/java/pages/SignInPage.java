package pages;


import helpers.LocatorsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    private static final By MAIL_ENTER = LocatorsHelper.get("EnterMail");
    private static final By ACCOUNT_CREATION = LocatorsHelper.get("CreateAnAccount");
    private static final By ENTER_MAIL_FOR_ACCOUNT = LocatorsHelper.get("EnterMailForSingInAccount");
    private static final By ENTER_PASSWORD_FOR_ACCOUNT = LocatorsHelper.get("EnterPasswordForSingInAccount");
    private static final By CLICK_ENTER_ACCOUNT_BUTTON = LocatorsHelper.get("ClickButtonEnterAccount");
    private static final By ACCOUNT_DISPLAYED = LocatorsHelper.get("AccountISDisplayed");


    public static void enterMailAndCreateAccount(WebDriver driver, String mail){
        WebElement enterMail = driver.findElement(MAIL_ENTER);
        WebElement clickCreateAccount = driver.findElement(ACCOUNT_CREATION);
        enterMail.sendKeys(mail);
        clickCreateAccount.click();
    }
    public static void enterMailForAccount(WebDriver driver, String mail, String password){
        WebElement enterMailAccount = driver.findElement(ENTER_MAIL_FOR_ACCOUNT);
        enterMailAccount.sendKeys(mail);
        WebElement enterPasswordForAccount = driver.findElement(ENTER_PASSWORD_FOR_ACCOUNT);
        enterPasswordForAccount.sendKeys(password);
        WebElement clickButtonForEnterAccount = driver.findElement(CLICK_ENTER_ACCOUNT_BUTTON);
        clickButtonForEnterAccount.click();
    }
    public static boolean checkAccountIsDislayed(WebDriver driver){
       if (driver.findElement(ACCOUNT_DISPLAYED).isDisplayed()){
            return true;
        }
        return false;
    }
}
