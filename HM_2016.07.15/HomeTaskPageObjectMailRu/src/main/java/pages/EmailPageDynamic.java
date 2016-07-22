package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailPageDynamic {
    private final By SELECT_ALL_LETTERS = By.cssSelector(".b-dropdown__ctrl .b-checkbox__box");
    private final By SELECT_ALL_EMAILS_IN_INBOX = By.cssSelector(".pseudo-link[data-name='selectAllLetters']");
    private final By NUMBER_OF_INCOMING_LETTERS = By.cssSelector(".b-announcement__text");

    private WebDriver driver;

    public EmailPageDynamic(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLetters() {
        WebElement selectAllLetters = driver.findElement(SELECT_ALL_LETTERS);
        selectAllLetters.click();

        WebElement selectAllEmailsInInbox = driver.findElement(SELECT_ALL_EMAILS_IN_INBOX);
        selectAllEmailsInInbox.click();
    }

    public String calculateLetters() {
        WebElement numberLetters = driver.findElement(NUMBER_OF_INCOMING_LETTERS);
        String numberOfIncomingLetters = numberLetters.getText();
        String[] AllLetters = numberOfIncomingLetters.split(" ");
        return AllLetters[1];
    }
}




