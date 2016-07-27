package pages;

import blocks.FindMenuDevByBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by User on 7/24/2016.
 */
public class FindCompanyPage {

    private FindMenuDevByBlock findMenuDevByBlock;

    private final By ISSOFT_COMPANY = By.cssSelector("[href='/issoft']");

    public FindCompanyPage(WebDriver driver){
        HtmlElementLoader.populatePageObject(this,driver);
    }

    public boolean findIsSoftCompany(WebDriver driver){
        WebElement isSoft = driver.findElement(ISSOFT_COMPANY);

        if (!isSoft.isDisplayed()){
            return false;
        }
        return true;
    }

    public void clickLinkSalary(){
        findMenuDevByBlock.clickLinkSalary();
    }

}
