package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalaryPage {

    private final By FIND_TEXT = By.cssSelector("[class='input info-count']>h3");

    public boolean findTextPageSalary(WebDriver driver){
        WebElement findText = driver.findElement(FIND_TEXT);

        if(!findText.getText().equals("Зарплата в ИТ")){
            return false;
        }
        return true;
    }
}
