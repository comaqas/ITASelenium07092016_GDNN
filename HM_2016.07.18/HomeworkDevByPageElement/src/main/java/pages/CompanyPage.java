package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyPage {

    private final By FIND_ISSOFT = By.cssSelector("[data='ISsoft'] [href='/issoft']");

    public boolean findISsoftCompany(WebDriver driver){
        WebElement isSoft = driver.findElement(FIND_ISSOFT);

        if (!isSoft.isDisplayed()){
            return false;
        }
        return true;
    }
}
