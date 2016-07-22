package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.fail;

public class EmailPageFlow {
    private final By CHOOSE_BOX_ALL_LETTERS = By.cssSelector("[data-group='selectAll']");
    private final By SELECT_ALL_LETTERS = By.cssSelector("[data-name='all']");
    private final By SELECT_ALL_EMAILS_IN_INBOX = By.cssSelector("[data-name='selectAllLetters']");
    private final By NUMBER_OF_INCOMING_LETTERS = By.cssSelector(".b-announcement__text");

    private WebDriver driver;

    public EmailPageFlow(WebDriver driver) {
        this.driver = driver;
    }

    public  EmailPageFlow calculateAllLetters(){
        WebElement chooseBoxAllLetters = driver.findElement(CHOOSE_BOX_ALL_LETTERS);
        chooseBoxAllLetters.click();
        WebElement selectAllLetters = driver.findElement(SELECT_ALL_LETTERS);
        selectAllLetters.click();
        WebElement selectAllEmailsInBox = driver.findElement(SELECT_ALL_EMAILS_IN_INBOX);
        selectAllEmailsInBox.click();

        WebElement letters = driver.findElement(NUMBER_OF_INCOMING_LETTERS);
        String numberOfLetters = letters.getText();
        String[] numberOfIncomingLetters = numberOfLetters.split(" ");
        String numberLetters = numberOfIncomingLetters[1];

        if (!numberLetters.equals("53")){
            fail("Bad finds calculator)");
        }
        return this;
    }
}
