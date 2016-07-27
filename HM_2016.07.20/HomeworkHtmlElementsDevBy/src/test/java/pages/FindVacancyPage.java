package pages;

import blocks.FindMenuDevByBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by User on 7/24/2016.
 */
public class FindVacancyPage {
    private FindMenuDevByBlock findMenuDevByBlock;

    private final By FIND_VACANCY_TEXT =By.cssSelector(".column-left>h3");

    public FindVacancyPage(WebDriver driver){
        HtmlElementLoader.populatePageObject(this,driver);
    }

    public boolean findVacancyText(WebDriver driver){
        WebElement findVacancyText = driver.findElement(FIND_VACANCY_TEXT);

        if(findVacancyText.getText().equals("Поиск вакансий:")){
            return true;
        }
        return false;
    }

    public void clickLinkCalendar(){
        findMenuDevByBlock.clickLinkCalendar();
    }


}
