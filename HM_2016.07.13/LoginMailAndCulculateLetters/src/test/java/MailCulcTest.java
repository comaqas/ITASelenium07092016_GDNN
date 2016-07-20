

 import org.openqa.selenium.By;
         import org.openqa.selenium.WebDriver;
         import org.openqa.selenium.WebElement;
         import org.openqa.selenium.firefox.FirefoxDriver;
         import org.testng.annotations.BeforeTest;
         import org.testng.annotations.Test;
         import java.util.concurrent.TimeUnit;
         import static org.testng.Assert.assertEquals;


         public class MailCulcTest {
             WebDriver driver;

             @BeforeTest
             public void setUp() {
                 driver = new FirefoxDriver();
                 driver.manage().window().maximize();
                 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

             }

             @Test
             public void loginMailRu() {
                 driver.get("https://mail.ru/");
                 WebElement loginMail = driver.findElement(By.id("mailbox__login"));
                 loginMail.sendKeys("strong.zubovich@bk.ru");

                 WebElement passwordMail = driver.findElement(By.id("mailbox__password"));
                 passwordMail.sendKeys("ZXCvbn123!");

                 WebElement buttonEnter = driver.findElement(By.id("mailbox__auth__button"));
                 buttonEnter.click();

                 int numberOfLettersFirstPage = driver.findElements(By.cssSelector("[data-bem='b-datalist__item']")).size();
                 System.out.println("The number of letters on the first page = " + numberOfLettersFirstPage);

                 assertEquals("Входящие - Почта Mail.Ru", driver.getTitle());

                 WebElement buttonNextPage = driver.findElement(By.cssSelector("[data-shortcut-title='Ctrl+→']"));
                 buttonNextPage.click();

                 int numberOfLettersSecondPage = driver.findElements(By.cssSelector("[data-bem='b-datalist__item']")).size();
                 System.out.println("The number of letters on the second page = " + numberOfLettersSecondPage);

                 assertEquals("Входящие - Почта Mail.Ru", driver.getTitle());

                 WebElement buttonNextPageSecond = driver.findElement(By.cssSelector("[data-shortcut-title='Ctrl+→']"));
                 buttonNextPageSecond.click();

                 int numberOfLettersThirdPage = driver.findElements(By.cssSelector("[data-bem='b-datalist__item']")).size();
                 System.out.println("The number of letters on the third page = " + numberOfLettersThirdPage);

                 assertEquals("Входящие - Почта Mail.Ru", driver.getTitle());

                 driver.close();
             }
         }


