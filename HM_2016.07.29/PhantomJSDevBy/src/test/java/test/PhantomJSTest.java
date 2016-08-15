package test;

import core.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;

import java.io.File;
import java.io.IOException;


public class PhantomJSTest extends TestBase{

    @Test
    public void navigateToRegistrationLinkTest() throws IOException {
        File screenshotOne = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotOne,new File("E://mainPage.png"));

        driver.findElement(MainPage.REGISTRATION_LINK).click();

        File screenshotTwo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotTwo,new File("E://RegistrationPage.png"));

        RegistrationPage.PopulateRegistryForm(driver);
        File screenshotThree = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotThree,new File("E://Message.png"));

        Assert.assertTrue(driver.findElement(MainPage.CONFIRMATION_REGISTRATION_POPUP_MESSAGE).isDisplayed(), "Popup is not displayed");



    }
}
