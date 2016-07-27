package test;


import core.TestBase;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;


public class FindTest extends TestBase {


    private FindCalendarPage findCalendarPage = new FindCalendarPage(driver);
    private FindNewsPage findNewsPage = new FindNewsPage(driver);
    private FindCompanyPage findCompanyPage = new FindCompanyPage(driver);
    private FindVacancyPage findVacancyPage =new FindVacancyPage(driver);
    private FindSalaryPage findSalaryPage = new FindSalaryPage(driver);

    @Test
    public void findDevByTest(){
        findNewsPage.clickLinkNews();
        assertTrue(findNewsPage.logoTypeDevBy(driver));
        findNewsPage.clickLinkCompany();

        assertTrue(findCompanyPage.findIsSoftCompany(driver));
        findCompanyPage.clickLinkSalary();

        assertTrue(findSalaryPage.findSalaryText(driver));
        findSalaryPage.clickLinkVacancy();

        assertTrue(findVacancyPage.findVacancyText(driver));
        findVacancyPage.clickLinkCalendar();

        assertTrue(findCalendarPage.findCalendarText(driver));

    }
}




