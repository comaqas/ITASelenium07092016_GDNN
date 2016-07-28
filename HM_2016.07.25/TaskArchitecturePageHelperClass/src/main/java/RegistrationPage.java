import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.applet.Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 7/25/2016.
 */
public class RegistrationPage {
    public static final By USERNAME = Locators.get("UserName");
    public static final By EMAIL = Locators.get("UserEmail");
    public static final By PASSWORD = Locators.get("Password");
    public static final By PASSWORD_CONFIRMATION = Locators.get("PasswordConfirmation");
    public static final By FIRST_NAME = Locators.get("UserFirstName");
    public static final By LAST_NAME = Locators.get("UserLastName");
    public static final By CURRENT_POSITION = Locators.get("UserCurrentPosition");
    public static final By COMPANY_DROPDOWN_LABEL = Locators.get("UserCompanyDropDownLabel");
    public static final By COMPANY_DROPDOWN_INPUT = Locators.get("UserCompanyDropDownInput");
    public static final By COMPANY_DROPDOWN_RESULT_ITEM = Locators.get("UserCompanyDropDownResult");
    public static final By AGREE_CHECKBOX = Locators.get("AgreedWithCheckbox");
    public static final By SUBMIT_BUTTON = Locators.get("SubmitBlueButton");

    private static List<String> itCompanies = Arrays.asList("Godel Technologies Europe", "issoft", "epam", "viber", "belhard");

    public static void PopulateRegistryForm(WebDriver driver) {

        String password = HelperRandomClass.getPassword();

        driver.findElement(USERNAME).sendKeys(HelperRandomClass.getUsername());
        driver.findElement(EMAIL).sendKeys(HelperRandomClass.getRandomEmail());
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(PASSWORD_CONFIRMATION).sendKeys(password);
        driver.findElement(FIRST_NAME).sendKeys(HelperRandomClass.getFirstName());
        driver.findElement(LAST_NAME).sendKeys(HelperRandomClass.getLastName());
        driver.findElement(CURRENT_POSITION).sendKeys(HelperRandomClass.getRandomString());
        SelectCompany(GetRandomCompany(itCompanies), driver);
        driver.findElement(AGREE_CHECKBOX).click();
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public static void SelectCompany(String company, WebDriver driver) {
        driver.findElement(COMPANY_DROPDOWN_LABEL).click();
        driver.findElement(COMPANY_DROPDOWN_INPUT).sendKeys(company);
        driver.findElement(COMPANY_DROPDOWN_RESULT_ITEM).click();
    }

    private static String GetRandomCompany(List<String> list) {
        Random randomizer = new Random();
        return list.get(randomizer.nextInt(list.size()));
    }
}
