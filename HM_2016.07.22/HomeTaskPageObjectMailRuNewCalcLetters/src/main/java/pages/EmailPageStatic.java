package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmailPageStatic {
    private static final By LETTERS_ON_PAGE = By.cssSelector("div.b-datalist__item__panel");
    private static final By NEXT_BUTTON = By.cssSelector("div[data-name='next']");
    private static final By NEXT_PAGE_BUTTON = By.cssSelector("i.ico_toolbar_arrow_right");




    public static int calculateLetters(WebDriver driver) {
        int numberOfLetters = 0;
        while (true){
            List<WebElement> letters = driver.findElements(LETTERS_ON_PAGE);
            numberOfLetters += letters.size();

            WebElement nextPageButton = driver.findElement(NEXT_BUTTON);
            WebElement nextPageArrow = driver.findElement(NEXT_PAGE_BUTTON);

            if (!nextPageButton.getAttribute("class").contains("b-toolbar__btn_disabled")) {
                nextPageArrow.click();
            } else {
                break;
            }
        }
        return numberOfLetters;
    }

}