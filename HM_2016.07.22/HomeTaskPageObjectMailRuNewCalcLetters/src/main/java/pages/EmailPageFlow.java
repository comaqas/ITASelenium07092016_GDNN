package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.yecht.Data;

import java.util.List;

import static org.testng.Assert.fail;

public class EmailPageFlow {
    private final By LETTERS_ON_PAGE = By.cssSelector("div.b-datalist__item__panel");
    private final By NEXT_BUTTON = By.cssSelector("div[data-name='next']");
    private final By NEXT_PAGE_BUTTON = By.cssSelector("i.ico_toolbar_arrow_right");


    private WebDriver driver;

    public EmailPageFlow(WebDriver driver) {
        this.driver = driver;
    }

    public  EmailPageFlow calculateAllLetters(int lettersInBox){
        int numberOfletters = 0;

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


        if (numberOfletters != lettersInBox){
            fail("Bad work calculator)");
        }
        return this;
    }
}
