package pages;

import helpers.LocatorsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrderHistoryPage {
    private static By INFORMATION_ABOUT_ORDER_HISTORY = LocatorsHelper.get("OrderHistory");
    static String orderMessageInformation = CartPage.informationAboutOrder;

    public static boolean verifyOrder(WebDriver driver){
        return driver.findElements(INFORMATION_ABOUT_ORDER_HISTORY).get(0).getText().contains(orderMessageInformation);
    }
}
