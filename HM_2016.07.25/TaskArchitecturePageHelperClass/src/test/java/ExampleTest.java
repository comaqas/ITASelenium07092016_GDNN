import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExampleTest {
     public static final String BASE_LINK = "https://dev.by/";

    @Test
    public void navigateToRegistrationLinkTest() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(BASE_LINK);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(MainPage.REGISTRATION_LINK).click();

        RegistrationPage.PopulateRegistryForm(driver);

        Assert.assertTrue(driver.findElement(MainPage.CONFIRMATION_REGISTRATION_POPUP_MESSAGE).isDisplayed(), "Popup is not displayed");


        driver.close();
    }
}
