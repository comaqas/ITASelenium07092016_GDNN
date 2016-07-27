package blocks;


import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

@Name("FindMenuDevByBlock")
@Block(@FindBy(css = ".dev-container.header-nav"))
public class FindMenuDevByBlock extends HtmlElement {

    @Name("FindNews")
    @FindBy(css = "[href='https://dev.by/lenta']")
    private Link findNews;

    @Name("FindCompany")
    @FindBy(css = "[href='https://dev.by/lenta']")
    private Link findCompany;

    @Name("FindSalary")
    @FindBy(css = ".menu [href='https://salaries.dev.by/']")
    private Link findSalary;

    @Name("FindVacancy")
    @FindBy(css = ".menu [href='https://jobs.dev.by/']")
    private Link findVacancy;

    @Name("FindCalendar")
    @FindBy(css = ".menu [href='https://events.dev.by/']")
    private Link findCalendar;

    public void clickLinkNews(){
        findNews.click();
    }
    public void clickLinkCompany(){
        findCompany.click();
    }
    public void clickLinkSalary(){
        findSalary.click();
    }
    public void clickLinkVacancy(){
        findVacancy.click();
    }
    public void clickLinkCalendar(){
        findCalendar.click();
    }
}

