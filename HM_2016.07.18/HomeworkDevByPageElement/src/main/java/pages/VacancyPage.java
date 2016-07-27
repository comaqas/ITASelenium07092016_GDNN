package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VacancyPage {

    private final By VACANCY_FIND_TEXT = By.cssSelector(".column-left");

    public boolean findTextVacancy(WebDriver driver){
        WebElement findText = driver.findElement(VACANCY_FIND_TEXT);

        if (!findText.getText().equals("Поиск вакансий:")){
            return false;
        }
        return  true;
    }
}
