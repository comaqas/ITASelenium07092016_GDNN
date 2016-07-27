package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {

    private final By LOGODEVBY = By.cssSelector("[title='Dev.by']");

    public boolean findLogo(WebDriver driver) {

        WebElement logotype = driver.findElement(LOGODEVBY);

        if (!logotype.isDisplayed()) {
            return false;
        }
        return true;
    }

}



