package pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class EmailPageSimpleFactory {

    @FindBy(css = ".b-dropdown__ctrl .b-checkbox__box")
    private WebElement selectAllLetters;
    @FindBy(css = ".pseudo-link[data-name='selectAllLetters']")
    private WebElement selectAllLettersInBox;
    @FindBy(css = ".b-announcement__text")
    private WebElement numberOfIncomingLetters;

    public void selectLetters(){
        selectAllLetters.click();
        selectAllLettersInBox.click();
    }
    public String calculateLetters(){
        WebElement calcLeters = numberOfIncomingLetters;
        String numberOfIncomingLetters = calcLeters.getText();
        String[] allLeters = numberOfIncomingLetters.split(" ");
        return allLeters[1];
    }
}
