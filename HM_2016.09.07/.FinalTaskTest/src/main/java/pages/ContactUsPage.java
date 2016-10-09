package pages;

import helpers.LocatorsHelper;
import helpers.RandomHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ContactUsPage {
    private static final By SUBJECT_HEADING = LocatorsHelper.get("SubjectHeading");
    private static final By MAIL_FIELD_ENTER = LocatorsHelper.get("MailField");
    private static final By ORDER_REFERENCE_FIELD = LocatorsHelper.get("OrderReference");
    private static final By FILE_UPLOAD = LocatorsHelper.get("AttachFile");
    private static final By MESSAGE_FIELD = LocatorsHelper.get("Message");
    private static final By SEND_MESSAGE_BUTTON = LocatorsHelper.get("SendMessage");
    private static final By SUCCESSFUL_MESSAGE = LocatorsHelper.get("AlertSuccess");
    private static final By ERROR_MESSAGE = LocatorsHelper.get("AlertDanger");
    private static final String subject = "Customer service";
    private static final String mail = RandomHelper.getRandomEmail();
    private static final String order = RandomHelper.getRandomString();
    private static final String file = "E:\\text.txt";
    private static final String message = RandomHelper.getRandomSubject();
    private static final String errorMessage = "";

    public static void messageSending(WebDriver driver) {
        driver.findElement(SUBJECT_HEADING).sendKeys(subject);
        driver.findElement(MAIL_FIELD_ENTER).sendKeys(mail);
        driver.findElement(ORDER_REFERENCE_FIELD).sendKeys(order);
        driver.findElement(FILE_UPLOAD).sendKeys(file);
        driver.findElement(MESSAGE_FIELD).sendKeys(message);
        driver.findElement(SEND_MESSAGE_BUTTON).click();
    }

    public static void messageSendingError(WebDriver driver) {
        driver.findElement(SUBJECT_HEADING).sendKeys(subject);
        driver.findElement(MAIL_FIELD_ENTER).sendKeys(mail);
        driver.findElement(ORDER_REFERENCE_FIELD).sendKeys(order);
        driver.findElement(FILE_UPLOAD).sendKeys(file);
        driver.findElement(MESSAGE_FIELD).sendKeys(errorMessage);
        driver.findElement(SEND_MESSAGE_BUTTON).click();
    }





    public static boolean successfulMessageCheck(WebDriver driver){
        WebElement successfulMessage = driver.findElement(SUCCESSFUL_MESSAGE);
        if (successfulMessage.isDisplayed()){
         return true;
        }
        return false;
    }
    public static boolean errorMessageCheck(WebDriver driver){
        WebElement errorAlert = driver.findElement(ERROR_MESSAGE);
        if (errorAlert.isDisplayed()){
            return true;
        }
            return false;
    }
}
