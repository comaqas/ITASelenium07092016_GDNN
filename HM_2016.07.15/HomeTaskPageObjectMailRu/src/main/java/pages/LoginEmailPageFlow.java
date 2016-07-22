package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.testng.AssertJUnit.fail;

public class LoginEmailPageFlow {
    private final By MAIL_LOGIN = By.name("Login");
    private final By MAIL_PASSWORD = By.id("mailbox__password");
    private final By LOGIN_BUTTON = By.id("mailbox__auth__button");
    private final By USER_EMAIL_ACCOUNT = By.id("PH_user-email");

    private WebDriver driver;
    public LoginEmailPageFlow(WebDriver driver){
        this.driver = driver;
    }
    public LoginEmailPageFlow enterLogin(String Login){
        WebElement loginField = driver.findElement(MAIL_LOGIN);
        loginField.sendKeys(Login);
        return this;
    }
    public LoginEmailPageFlow enterPassword(String Password){
        WebElement passwordField = driver.findElement(MAIL_PASSWORD);
        passwordField.sendKeys(Password);
        return this;
    }
    public LoginEmailPageFlow putButton(){
        WebElement clickButton = driver.findElement(LOGIN_BUTTON);
        clickButton.click();
        return this;
    }
    public LoginEmailPageFlow userAccount (String Letters){
        List<WebElement> searchResults = driver.findElements(USER_EMAIL_ACCOUNT);
        boolean allResultsContainText = true;
        for (WebElement searchResult : searchResults) {
            if (searchResult.getText().toLowerCase().contains(Letters.toLowerCase())) {
                fail("something happened wrong");
            }
        }
        return this;
    }
}
