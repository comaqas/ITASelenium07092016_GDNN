package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageElements {
    private final By NEWS = By.cssSelector("[href='https://dev.by/lenta']");
    private final By COMPANY = By.cssSelector(".menu [href='https://companies.dev.by/']");
    private final By SALARY = By.cssSelector(".navigation [href='https://salaries.dev.by/']");
    private final By VACANCY = By.cssSelector(".menu [href='https://jobs.dev.by/']");
    private final By CALENDAR = By.cssSelector(".menu [href='https://events.dev.by/']");

    public void clickNews(WebDriver driver){
        WebElement news = driver.findElement(NEWS);
        news.click();
    }
    public void clickCompany(WebDriver driver){
        WebElement company = driver.findElement(COMPANY);
        company.click();
    }
    public void clickSalary(WebDriver driver){
        WebElement salary = driver.findElement(SALARY);
        salary.click();
    }
    public void clickVacancy(WebDriver driver){
        WebElement vacancy = driver.findElement(VACANCY);
        vacancy.click();
    }
    public void clickCalendar(WebDriver driver){
        WebElement calendar = driver.findElement(CALENDAR);
        calendar.click();
    }
}
