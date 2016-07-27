import core.TestBase;
import element.PageElements;
import org.testng.annotations.Test;
import pages.CalendarPage;
import pages.CompanyPage;
import pages.NewsPage;
import pages.SalaryPage;
import pages.VacancyPage;
import static org.testng.Assert.assertTrue;

public class ElementsCheckAtDevByTest extends TestBase {

    @Test
    public void checkAtDevBy(){

        PageElements page = new PageElements();
        NewsPage newsPage = new NewsPage();
        CalendarPage calendarPage = new CalendarPage();
        CompanyPage companyPage = new CompanyPage();
        SalaryPage salaryPage = new SalaryPage();
        VacancyPage vacancyPage = new VacancyPage();

        page.clickNews(driver);
        assertTrue(newsPage.findLogo(driver));

        page.clickCompany(driver);
        assertTrue(companyPage.findISsoftCompany(driver));

        page.clickSalary(driver);
        assertTrue(salaryPage.findTextPageSalary(driver));

        page.clickVacancy(driver);
        assertTrue(vacancyPage.findTextVacancy(driver));

        page.clickCalendar(driver);
        assertTrue(calendarPage.findCalendarText(driver));
    }
}
