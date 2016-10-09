package pages;


import helpers.LocatorsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private static final By SEARCH_FIELD = LocatorsHelper.get("SearchField");
    private static final By CLICK_SEARCH_BUTTON = LocatorsHelper.get("SearchButton");
    private static final By BLOUSE_SEARCH_RESULT = LocatorsHelper.get("SearchResult");
    private static final By GOODS_SEARCH_RESULT = LocatorsHelper.get("SearchGoodsResult");
    private static final By ADDING_GOODS_TO_CART = LocatorsHelper.get("AddToCart");
    private static final By PROCEED_TO_CHECKOUT = LocatorsHelper.get("ProceedToCheckout");
    private static final By NO_RESULTS_WERE_FOUND = LocatorsHelper.get("NoResultSearch");



    public static void goodsSearch(WebDriver driver, String textSearch)  {
        driver.findElement(SEARCH_FIELD).clear();
        driver.findElement(SEARCH_FIELD).sendKeys(textSearch);
        driver.findElement(CLICK_SEARCH_BUTTON).click();
        goodsSearchResult(driver);
        driver.findElement(GOODS_SEARCH_RESULT).click();
        driver.findElement(ADDING_GOODS_TO_CART).click();
        driver.findElement(PROCEED_TO_CHECKOUT).click();

    }


    public static void blouseSearch(WebDriver driver, String textSearch)  {

        WebElement blouseSearch = driver.findElement(SEARCH_FIELD);
        blouseSearch.clear();
        blouseSearch.sendKeys(textSearch);
        WebElement clickSearchButton = driver.findElement(CLICK_SEARCH_BUTTON);
        clickSearchButton.click();
    }
    public static boolean checkSearchResult(WebDriver driver){
        WebElement searchResult = driver.findElement(BLOUSE_SEARCH_RESULT);
        if (searchResult.isDisplayed()){
            return true;
        }
        return false;
    }

    public static boolean goodsSearchResult(WebDriver driver){
        WebElement searchGoods = driver.findElement(GOODS_SEARCH_RESULT);
        if (searchGoods.isDisplayed()){
            return true;
        }
        return false;
    }
    public static void searchForInvalidData(WebDriver driver, String searchText){
        driver.findElement(SEARCH_FIELD).sendKeys(searchText);
        driver.findElement(CLICK_SEARCH_BUTTON).click();
    }

    public static boolean noResultsFound(WebDriver driver){
        if (driver.findElement(NO_RESULTS_WERE_FOUND).isDisplayed()){
            return true;
        }
        return false;
    }
}
