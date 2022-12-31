package PageObjects;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BaseClass {

    private static String Dropdown_SortBy = "//select[@class='product_sort_container']";
    private static String Dropdown_AtoZ = "//option[@value='az']";
    private static String Dropdown_ZtoA = "//option[@value='za']";
    private static String Dropdown_LowToHigh = "//option[@value='lohi']";
    private static String Dropdown_HighToLow = "//option[@value='hilo']";
    private static String InventoryPrice = "//div[@class='inventory_item_price']";
    private static String AddToCartBtn = "//div[@class='inventory_item_price']/following::button[text()='Add to cart']";
    private static String CartBtn = "//a[@class='shopping_cart_link']";

    private static WebElement getSortByDropDown() {return driver.findElement(By.xpath(Dropdown_SortBy));}
    private static WebElement getDropdownAtoZ() {return driver.findElement(By.xpath(Dropdown_AtoZ));}
    private static WebElement getDropdownZtoA() {return driver.findElement(By.xpath(Dropdown_ZtoA));}
    private static WebElement getDropdownLowToHigh() {return driver.findElement(By.xpath(Dropdown_LowToHigh));}
    private static WebElement getDropdownHighToLow() {return driver.findElement(By.xpath(Dropdown_HighToLow));}
//    private static WebElement getInventoryPrice() {return driver.findElement(By.xpath(InventoryPrice));}
    private static List<WebElement> getInventoryPrice = driver.findElements(By.xpath(InventoryPrice));
    private static WebElement getAddToCartBtn() {return driver.findElement(By.xpath(AddToCartBtn));}
    private static WebElement getCartBtn() {return driver.findElement(By.xpath(CartBtn));}

    public static void SortByDropDown() {
        getSortByDropDown().click();
        Select dropdown = new Select(getSortByDropDown());
        if(getDropdownAtoZ().isDisplayed())
            dropdown.selectByValue("za");
        else
            dropdown.selectByValue("lohi");
    }

    public static void checkPrice() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Double lowerPrice = 15.99;
        List<Double> prices = new ArrayList<>();

        for (WebElement i : getInventoryPrice){
            prices.add(Double.valueOf(i.getText().replace("$","")));
        }

        for(int j = 0; j < prices.size(); j++){
            Double itemJ = prices.get(j);
            if(itemJ < lowerPrice) {
                js.executeScript("arguments[0].scrollIntoView();",getAddToCartBtn());
                getAddToCartBtn().click();
            }
            else
                System.out.println("Price is greater than 15.99");
        }
    }

    public static void clickOnShoppingCartBtn() {
        getCartBtn().click();
    }
}
