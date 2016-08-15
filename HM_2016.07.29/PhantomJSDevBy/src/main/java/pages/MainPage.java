package pages;

import locator.Locators;
import org.apache.xerces.dom.PSVIAttrNSImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    public static final By REGISTRATION_LINK = Locators.get("LoginLink");
    public static final By CONFIRMATION_REGISTRATION_POPUP_MESSAGE = Locators.get("ConfirmationRegistryPopup");

    public static void clickRegistration(WebDriver driver){
        driver.findElement(REGISTRATION_LINK).click();

    }

    public static boolean registrationMessage(WebDriver driver){
        return driver.findElement(CONFIRMATION_REGISTRATION_POPUP_MESSAGE).isDisplayed();
    }

}



