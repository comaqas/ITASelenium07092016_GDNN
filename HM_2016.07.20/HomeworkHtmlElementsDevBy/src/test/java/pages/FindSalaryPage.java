package pages;

import blocks.FindMenuDevByBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by User on 7/24/2016.
 */
public class FindSalaryPage {
    private FindMenuDevByBlock findMenuDevByBlock;

    private final By FIND_SALARY_TEXT = By.cssSelector("[class='input info-count']>h3");

    public FindSalaryPage(WebDriver driver){
        HtmlElementLoader.populatePageObject(this,driver);
    }

    public boolean findSalaryText(WebDriver driver){
        WebElement findText = driver.findElement(FIND_SALARY_TEXT);

        if (findText.getText().equals("Зарплата в ИТ")){
            return true;
        }
        return false;
    }

    public void clickLinkVacancy(){
        findMenuDevByBlock.clickLinkVacancy();

    }

}

