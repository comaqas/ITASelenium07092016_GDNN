package pages;


import helpers.LocatorsHelper;
import helpers.RandomHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {


    private static final By RADIO_BUTTON_MR_SELECTION = LocatorsHelper.get("SelectMr");
    private static final By FIRST_NAME_ENTER = LocatorsHelper.get("FirstName");
    private static final By LAST_NAME_ENTER = LocatorsHelper.get("LastName");
    private static final By PASSWORD_ENTER = LocatorsHelper.get("Password");
    private static final By DATE_SELECTION = LocatorsHelper.get("Date");
    private static final By MONTH_SELECTION = LocatorsHelper.get("Month");
    private static final By YEAR_SELECTION = LocatorsHelper.get("Year");
    private static final By COMPANY_ENTER = LocatorsHelper.get("Company");
    private static final By ADDRESS_LINE_ENTER = LocatorsHelper.get("Address");
    private static final By ADDRESS_LINE2_ENTER = LocatorsHelper.get("Address(Line2)");
    private static final By CITY_ENTER = LocatorsHelper.get("City");
    private static final By STATE_SELECTION = LocatorsHelper.get("State");
    private static final By POST_CODE_ENTER = LocatorsHelper.get("PostalCode");
    private static final By ADDITIONAL_INFORMATION_ENTER = LocatorsHelper.get("AdditionalInformation");
    private static final By HOME_PHONE_ENTER = LocatorsHelper.get("HomePhone");
    private static final By MOBILE_PHONE_ENTER = LocatorsHelper.get("MobilePhone");
    private static final By REGISTRATION_BUTTON_CLICK = LocatorsHelper.get("RegisterButton");
    private static final By MY_ACCOUNT = LocatorsHelper.get("MyAccount");
    private static final By ERROR_MESSAGE = LocatorsHelper.get("ErrorMessage");
    private static final String firstName = RandomHelper.getFirstNameAndLastName(6);
    private static final String lastName = RandomHelper.getFirstNameAndLastName(7);
    private static final String password = RandomHelper.getPassword(10);
    private static final String day = RandomHelper.getDate();
    private static final String month = RandomHelper.getMonth();
    private static final String year = RandomHelper.getYear();
    private static final String company = RandomHelper.getRandomString();
    private static final String address = RandomHelper.getRandomString();
    private static final String addressLine2 = RandomHelper.getRandomString();
    private static final String city = RandomHelper.getRandomString();
    private static final String information = RandomHelper.getRandomString();
    private static final String homePhone = RandomHelper.getPhoneNumber();
    private static final String mobilePhone = RandomHelper.getPhoneNumber();
    private static final String postalCode = RandomHelper.getPostCode();
    private static final String state = "California";
//    private static final String stateWrong = RandomHelper.getRandomString();



    public static void registration(WebDriver driver) {

        driver.findElement(RADIO_BUTTON_MR_SELECTION).click();
        driver.findElement(FIRST_NAME_ENTER).sendKeys(firstName);
        driver.findElement(LAST_NAME_ENTER).sendKeys(lastName);
        driver.findElement(PASSWORD_ENTER).sendKeys(password);
        driver.findElement(DATE_SELECTION).sendKeys(day);
        driver.findElement(MONTH_SELECTION).sendKeys(month);
        driver.findElement(YEAR_SELECTION).sendKeys(year);
        driver.findElement(COMPANY_ENTER).sendKeys(company);
        driver.findElement(ADDRESS_LINE_ENTER).sendKeys(address);
        driver.findElement(ADDRESS_LINE2_ENTER).sendKeys(addressLine2);
        driver.findElement(CITY_ENTER).sendKeys(city);
        driver.findElement(STATE_SELECTION).sendKeys(state);
        driver.findElement(POST_CODE_ENTER).sendKeys(postalCode);
        driver.findElement(ADDITIONAL_INFORMATION_ENTER).sendKeys(information);
        driver.findElement(HOME_PHONE_ENTER).sendKeys(homePhone);
        driver.findElement(MOBILE_PHONE_ENTER).sendKeys(mobilePhone);
        driver.findElement(REGISTRATION_BUTTON_CLICK).click();

    }
    public static boolean myAccountRegistrationCheck(WebDriver driver){
        WebElement checkMyAccount = driver.findElement(MY_ACCOUNT);
        if (checkMyAccount.isDisplayed()){
            return true;
        }
        return false;
    }
    public static boolean myAccountRegistrationFailed(WebDriver driver){
        WebElement checkMyAccount = driver.findElement(ERROR_MESSAGE);
        if (checkMyAccount.isDisplayed()){
            return true;
        }
        return false;
    }
}
