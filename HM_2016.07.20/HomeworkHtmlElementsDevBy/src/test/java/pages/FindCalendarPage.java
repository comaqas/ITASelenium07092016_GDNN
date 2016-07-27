package pages;


import blocks.FindMenuDevByBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class FindCalendarPage {
    private FindMenuDevByBlock findMenuDevByBlock;

    private final By FIND_CALENDAR_TEXT = By.cssSelector("[href='https://events.dev.by/rss']");

    public FindCalendarPage (WebDriver driver){
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public boolean findCalendarText(WebDriver driver){
        WebElement findText = driver.findElement(FIND_CALENDAR_TEXT);
        if (!findText.getText().equals("Ближайшие события")){
            return false;
        }
        return true;
    }
}
