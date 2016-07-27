package pages;

import blocks.FindMenuDevByBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class FindNewsPage {

    private FindMenuDevByBlock findMenuDevByBlock;

    private final By LOGOTYPE_DEV = By.cssSelector(".header-logo");

    public FindNewsPage(WebDriver driver){
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void clickLinkNews () {
        findMenuDevByBlock.clickLinkNews();
    }

    public boolean logoTypeDevBy(WebDriver driver){
        WebElement logoType = driver.findElement(LOGOTYPE_DEV);

        if (!logoType.isDisplayed()){
            return false;
        }
        return true;
    }
    public void clickLinkCompany(){
        findMenuDevByBlock.clickLinkCompany();
    }


}
