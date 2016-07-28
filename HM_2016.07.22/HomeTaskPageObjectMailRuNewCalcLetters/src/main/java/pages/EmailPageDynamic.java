package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmailPageDynamic {
    private final By LETTERS_ON_PAGE = By.cssSelector("div.b-datalist__item__panel");
    private final By NEXT_BUTTON = By.cssSelector("div[data-name='next']");
    private final By NEXT_PAGE_BUTTON = By.cssSelector("i.ico_toolbar_arrow_right");

    int numberOfletters;

    private WebDriver driver;

    public EmailPageDynamic(WebDriver driver){
        this.driver = driver;
    }

    public boolean checkEmailPage(String titleEmailPage){
        if(!driver.getTitle().equals(titleEmailPage)){
            return false;
        }
        return true;
    }


    public int calculateLetters (){


        while (true){
            List<WebElement> letters = driver.findElements(LETTERS_ON_PAGE);
          numberOfletters += letters.size();

            WebElement nextPageButton = driver.findElement(NEXT_BUTTON);
            WebElement nextPageArrow = driver.findElement(NEXT_PAGE_BUTTON);

            if (!nextPageButton.getAttribute("class").contains("b-toolbar__btn_disabled")) {
                nextPageArrow.click();
            } else {
                break;
            }
        }
        return numberOfletters;
    }

}




