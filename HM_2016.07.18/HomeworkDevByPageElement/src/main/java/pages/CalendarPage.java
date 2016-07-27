package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarPage {
    private final By FIND_CALENDAR_TEXT = By.cssSelector(".topic-list>h3");

    public boolean findCalendarText(WebDriver driver){

        WebElement findText = driver.findElement(FIND_CALENDAR_TEXT);

        if (!findText.getText().equals("Ближайшие события")){
            return false;
        }
        return true;
    }

}
