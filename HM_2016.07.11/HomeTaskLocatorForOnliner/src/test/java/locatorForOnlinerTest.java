import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class locatorForOnlinerTest {
    WebDriver driver;

    @BeforeTest

    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test

    public void myTestMethod() {

        driver.get("https://www.onliner.by/");

        WebElement catalogButton = driver.findElement
                (By.cssSelector("[href='http://catalog.onliner.by/']>.b-main-navigation__text"));
        catalogButton.click();

        assertEquals(driver.getTitle(), "Каталог Onliner.by");

        WebElement mobilePhone = driver.findElement
                (By.cssSelector(".catalog-bar__item>[href='http://catalog.onliner.by/mobile']"));
        mobilePhone.click();

        WebElement checkBox = driver.findElement(By.cssSelector(".schema-filter__list .i-checkbox__real[value='apple']"));
        checkBox.click();

        WebElement putNumber = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        putNumber.sendKeys("10");

        WebElement putNumberSecond = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        putNumberSecond.sendKeys("1900");

        WebElement chooseData = driver.findElement(By.xpath("//div[3]/ul/li[2]/label/span/span"));
        chooseData.click();

        WebElement choseeDataSecond = driver.findElement(By.xpath("//div[3]/ul/li[3]/label/span/span"));
        choseeDataSecond.click();

        WebElement chooseOS = driver.findElement(By.cssSelector(".schema-filter__list .i-checkbox__real[value='ios']"));
        chooseOS.click();

        WebElement chooseScreen = driver.findElement
                (By.xpath("//span[text()='4.5 - 5\"']/..//span[@class='i-checkbox__faux']"));
        chooseScreen.click();
        WebElement chooseScreenSecond = driver.findElement
                (By.xpath("//span[text()='5 - 5.5\"']/..//span[@class='i-checkbox__faux']"));
        chooseScreenSecond.click();

        WebElement chooseScreenResolution = driver.findElement
                (By.xpath("//span[text()='1080x1920 (FullHD)']"));
        chooseScreenResolution.click();

        WebElement chooseMatrix = driver.findElement
                (By.cssSelector(".i-checkbox__real[value='ips'] + .i-checkbox__faux"));
        chooseMatrix.click();

        WebElement chooseMemory = driver.findElement
                (By.xpath("//div[@id='schema-filter']/div/div[8]/div[3]/div/div/input"));
        chooseMemory.sendKeys("2");

        WebElement choseeMemorySecond = driver.findElement
                (By.xpath("//div[@id='schema-filter']/div/div[8]/div[3]/div/div[2]/input"));
        choseeMemorySecond.sendKeys("4");

        WebElement inputFlashMemory = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        inputFlashMemory.sendKeys("8");

        WebElement inputFlashMemorySecond = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
        inputFlashMemorySecond.sendKeys("128");

        WebElement inputCamera = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
        inputCamera.sendKeys("1");

        WebElement inputCameraSecond = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
        inputCameraSecond.sendKeys("20");

        WebElement chooseSimCardType = driver.findElement
                (By.cssSelector("[class='i-checkbox__real'][value='nano']+[class='i-checkbox__faux']"));
        chooseSimCardType.click();

        WebElement chooseDualSimCard = driver.findElement
                (By.xpath("//span[text() = 'Dual-SIM']//../..//span[text() = 'Нет']"));
        chooseDualSimCard.click();

        WebElement chooseLTE = driver.findElement
                (By.xpath("//span[text()='LTE']/..//span[@class='i-checkbox__faux']"));
        chooseLTE.click();

        WebElement clickColorButton = driver.findElement
                (By.xpath("//div[@id='schema-filter']/div/div[15]/div[3]/div/div"));
        clickColorButton.click();

        WebElement chooseColor = driver.findElement
                (By.xpath("//div[@id='schema-filter']/div/div[15]/div[3]/div[2]/div/div/div/div[20]/label/span[2]"));
        chooseColor.click();

        WebElement chooseBatteryVolume = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
        chooseBatteryVolume.sendKeys("0");

        WebElement chooseBatteryVolumeSecond = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
        chooseBatteryVolumeSecond.sendKeys("0");


        WebElement enterAcount = driver.findElement(By.xpath("//div[@onclick='MODELS.AuthController.showModalAuth()']"));

        enterAcount.click();

        WebElement logInName = driver.findElement(By.xpath("(//input[@type='text'])[32]"));
        logInName.sendKeys("Shaldomlnx@yandex.ru");

        WebElement logInPass = driver.findElement(By.xpath("//input[@type='password']"));
        logInPass.sendKeys("QazxsW123");

        WebElement putInLogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        putInLogin.click();

        driver.quit();

    }

}

