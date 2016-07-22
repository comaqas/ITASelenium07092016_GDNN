package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginEmailPageDynamic {
    private final By MAIL_LOGIN = By.name("Login");
    private final By MAIL_PASSWORD = By.id("mailbox__password");
    private final By LOGIN_BATTON = By.id("mailbox__auth__button");
    private final By USER_EMAIL_ACCOUNT = By.id("PH_user-email");

    private WebDriver driver;

    public LoginEmailPageDynamic(WebDriver driver){

        this.driver = driver;
    }
    public void enterLoginEmail(String login){
        WebElement searchField = driver.findElement(MAIL_LOGIN);
        searchField.sendKeys(login);
    }
    public void enterPasswordEmail(String password){
        WebElement searchField = driver.findElement(MAIL_PASSWORD);
        searchField.sendKeys(password);
    }
    public void clickLoginButton(){
        WebElement searchButton = driver.findElement(LOGIN_BATTON);
        searchButton.click();
    }
    public boolean userEmail(){
        WebElement account = driver.findElement(USER_EMAIL_ACCOUNT);
        if (account.isDisplayed()) {
            return true;
        }
        return false;
    }
}
