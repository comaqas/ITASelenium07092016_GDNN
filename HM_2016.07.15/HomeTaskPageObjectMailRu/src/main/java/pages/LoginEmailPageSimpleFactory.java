package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class LoginEmailPageSimpleFactory {

    @FindBy(name ="Login")
    private WebElement searchLogin;
    @FindBy(id ="mailbox__password")
    private WebElement searchPasword;
    @FindBy(id ="mailbox__auth__button")
    private WebElement searchButton;
    @FindBy(css ="[class='ico ico_toolbar ico_toolbar_remove'][data-bem='ico']")
    private WebElement searchDeleteButton;

    public void enterLoginEmail(String LoginMail){
        searchLogin.sendKeys(LoginMail);
    }
    public void enterPasswordEmail(String PasswordMail){
        searchPasword.sendKeys(PasswordMail);
    }
    public void clickButton(){
        searchButton.click();
    }
    public  boolean afterLoginCheck () {
        if(!searchDeleteButton.isDisplayed()) {
            return false;
        }
        return true;
    }
}
