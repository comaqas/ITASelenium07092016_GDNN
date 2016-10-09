package pages;

import helpers.LocatorsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MainPage {

    private static final By CONTACT_US_CLICK = LocatorsHelper.get("ContactUs");
    private static final By SIGN_IN_CLICK = LocatorsHelper.get("SignIn");
    private static final By WOMEN_SECTION = LocatorsHelper.get("Women");
    private static final By CHOOSING_CATEGORY_WOMEN_T_SHIRTS = LocatorsHelper.get("WomenT-shirts");
    private static final By WOMEN_T_SHIRTS_CHECK = LocatorsHelper.get("WomenT-shirtsCheck");
    private static final By ENTER_MAIL_FOR_NEWSLETTER = LocatorsHelper.get("NewsLetter");
    private static final By SUBMIT_BUTTON_NEWSLETTER = LocatorsHelper.get("SubmitNewsLetter");
    private static final By SUCCESSFUL_SUBSCRIPTION_MESSAGE = LocatorsHelper.get("SuccessfulNewsletter");
    private static final By CLICK_DRESSES = LocatorsHelper.get("Dresses");
    private static final By CLICK_EVENING_DRESSES = LocatorsHelper.get("EveningDresses");
    private static final By CLICK_CHECKBOX_SIZE = LocatorsHelper.get("CheckboxSize");
    private static final By CLICK_CHECKBOX_COLOR = LocatorsHelper.get("CheckboxColor");
    private static final By CLICK_CHECKBOX_COMPOSITIONS = LocatorsHelper.get("CheckboxCompositions");
    private static final By CLICK_CHECKBOX_PROPERTIES = LocatorsHelper.get("CheckboxProperties");
    private static final By CLICK_CHECKBOX_AVAILABILITY = LocatorsHelper.get("CheckboxAvailability");
    private static final By CLICK_CHECKBOX_MANUFACTURER = LocatorsHelper.get("CheckboxManufacturer");
    private static final By CLICK_CHECKBOX_CONDITION = LocatorsHelper.get("CheckboxCondition");
    private static final By XXX = LocatorsHelper.get("XXXX");
    private static final By CHECK_DRESS = LocatorsHelper.get("CheckDress");


    public static void clickContactUs(WebDriver driver){
        WebElement clickContact = driver.findElement(CONTACT_US_CLICK);
        clickContact.click();
    }
    public static void clickSingIn(WebDriver driver){
        WebElement clickSingIn = driver.findElement(SIGN_IN_CLICK);
        clickSingIn.click();
    }

    public static void chooseTShort(WebDriver driver)  {
        WebElement element = driver.findElement(WOMEN_SECTION);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        WebElement subElement = driver.findElement(CHOOSING_CATEGORY_WOMEN_T_SHIRTS);
        action.moveToElement(subElement);
        action.click();
        action.perform();

    }
    public static boolean womenTShirtCheck(WebDriver driver){
        WebElement tShirtCheck = driver.findElement(WOMEN_T_SHIRTS_CHECK);
        if (tShirtCheck.isDisplayed()){
            return  true;
        }
        return false;
    }

    public static void newsLetter(WebDriver driver, String mail){
        driver.findElement(ENTER_MAIL_FOR_NEWSLETTER).sendKeys(mail);
        driver.findElement(SUBMIT_BUTTON_NEWSLETTER).click();
    }

    public static boolean successfulSubscriptionMessage(WebDriver driver) {

        if (driver.findElement(SUCCESSFUL_SUBSCRIPTION_MESSAGE).isDisplayed()) {
            return true;
        }
        return false;
    }
    public static void selectionOfGoodsCheck(WebDriver driver){
        driver.findElement(WOMEN_SECTION).click();
        driver.findElement(CLICK_DRESSES).click();
        driver.findElement(CLICK_EVENING_DRESSES).click();
        driver.findElement(CLICK_CHECKBOX_SIZE).click();
        driver.findElement(CLICK_CHECKBOX_COLOR).click();
        driver.findElement(CLICK_CHECKBOX_COMPOSITIONS).click();
        driver.findElement(CLICK_CHECKBOX_PROPERTIES).click();
        driver.findElement(CLICK_CHECKBOX_AVAILABILITY).click();
        driver.findElement(CLICK_CHECKBOX_MANUFACTURER).click();
        driver.findElement(CLICK_CHECKBOX_CONDITION).click();


    }
    public static void sliderMovePrice(WebDriver driver){
        WebElement slider = driver.findElement(XXX);
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, -80, 0).build();
        action.perform();
    }
    public static boolean checkDress(WebDriver driver){
        if (driver.findElement(CHECK_DRESS).isDisplayed()){
            return true;
        }
        return false;
    }

}



