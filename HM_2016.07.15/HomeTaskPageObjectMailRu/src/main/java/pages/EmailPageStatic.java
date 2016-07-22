package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailPageStatic {
    private static By SELECT_ALL_LETTERS = By.cssSelector(".b-dropdown__ctrl .b-checkbox__box");
    private static By SELECT_ALL_EMAILS_IN_INBOX = By.cssSelector(".pseudo-link[data-name='selectAllLetters']");
    private static By NUMBER_OF_INCOMING_LETTERS = By.cssSelector(".b-announcement__text");

    public static void selectLetters(WebDriver driver){
        WebElement selectAllLetters = driver.findElement(SELECT_ALL_LETTERS);
        selectAllLetters.click();

        WebElement selectAllEmailsInInbox = driver.findElement(SELECT_ALL_EMAILS_IN_INBOX);
        selectAllEmailsInInbox.click();
    }
    public static String calculateLetters(WebDriver driver) {
        WebElement numberLetters = driver.findElement(NUMBER_OF_INCOMING_LETTERS);
        String numberOfIncomingLetters = numberLetters.getText();
        String[] AllLetters = numberOfIncomingLetters.split(" ");
        return AllLetters[1];

    }


}
