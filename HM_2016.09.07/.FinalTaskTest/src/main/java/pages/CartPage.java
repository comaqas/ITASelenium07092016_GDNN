package pages;

import helpers.LocatorsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage {
    private static final By CHECK_GOODS_IN_CART = LocatorsHelper.get("GoodsInCart");
    private static final By DELETE_GOODS = LocatorsHelper.get("DeleteGoods");
    private static final By CHECK_WHAT_CART_IS_EMPTY= LocatorsHelper.get("CartIsEmpty");
    private static final By PROCEED_TO_CHECKOUT = LocatorsHelper.get("ProceedToCheckoutInCart");
    private static final By CLICK_PROCEED_Address = LocatorsHelper.get("ProceedAddress");
    private static final By CLICK_TERMS_OF_SERVICE = LocatorsHelper.get("TermsOfService");
    private static final By CLICK_SHIPPING_PROCCED = LocatorsHelper.get("ShippingProceed");
    private static final By CLICK_BANK_WIRE = LocatorsHelper.get("PayByBankWire");
    private static final By CLICK_CONFIRM_ORDER = LocatorsHelper.get("IConfirmMyOrder");
    private static final By MESSAGE_ABOUT_ORDER = LocatorsHelper.get("MessageAboutOrder");
    private static final By CLICK_BACK_TO_ORDERS = LocatorsHelper.get("BackToOrders");
    public static String informationAboutOrder;


    public static void deleteGoods(WebDriver driver) {
        driver.findElement(DELETE_GOODS).click();
    }

    public static boolean checkWhatGoodsDelete(WebDriver driver){
        WebElement checkGoodsDelete = driver.findElement(CHECK_WHAT_CART_IS_EMPTY);
        if (checkGoodsDelete.isDisplayed()){
            return true;
        }
        return false;
    }

    public static boolean checkGoodsInCart(WebDriver driver) {
        WebElement checkGoodsInCart = driver.findElement(CHECK_GOODS_IN_CART);
        if (checkGoodsInCart.isDisplayed()) {
            return true;
        }
            return false;

    }

    public static void  shopGoods(WebDriver driver){
        WebElement shopping = driver.findElement(PROCEED_TO_CHECKOUT);
        shopping.click();
    }


    public static void buyingProcess(WebDriver driver){
        driver.findElement(CLICK_PROCEED_Address).click();
        driver.findElement(CLICK_TERMS_OF_SERVICE).click();
        driver.findElement(CLICK_SHIPPING_PROCCED).click();
        driver.findElement(CLICK_BANK_WIRE).click();
        driver.findElement(CLICK_CONFIRM_ORDER).click();
        String messageAboutBuying = driver.findElement(MESSAGE_ABOUT_ORDER).getText();
        String[] message = messageAboutBuying.split(" ");
        informationAboutOrder = message[36];
        driver.findElement(CLICK_BACK_TO_ORDERS).click();

    }
}
