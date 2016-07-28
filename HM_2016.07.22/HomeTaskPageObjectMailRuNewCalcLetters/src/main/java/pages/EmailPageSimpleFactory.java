package pages;


import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmailPageSimpleFactory {

    @FindAll({@FindBy(css = "div.b-datalist__item__panel")})
    private List<WebElement> selectAllLetters;

    @FindBy(css = "div[data-name='next']")
    private WebElement nextLettersInBox;

    @FindBy(css = "i.ico_toolbar_arrow_right")
    private WebElement nextLettesrArrow;





    public int calculateLetters(){
        int lettersInbox = 0;


        while (true){
            lettersInbox += selectAllLetters.size();

            if (!nextLettersInBox.getAttribute("class").contains("b-toolbar__btn_disabled")) {
                nextLettesrArrow.click();
            } else {
                break;
            }
        }
        return lettersInbox;
    }

}