package PageObjects;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends BaseClass {

    private static String InventoryPrice = "//div[@class='inventory_item_price']";
    private static String RemoveBtn = "//div[@class='inventory_item_price']/following::button[text()='Remove']";
    private static String CheckoutBtn = "checkout";

    private static List<WebElement> getInventoryPrice = driver.findElements(By.xpath(InventoryPrice));
    private static WebElement getRemoveBtn() {return driver.findElement(By.xpath(RemoveBtn));}
    private static WebElement getCheckoutBtn() {return driver.findElement(By.id(CheckoutBtn));}

    public static void removeItem() {
        Double lowerPrice = 9.00;
        List<Double> prices = new ArrayList<>();

        for (WebElement i : getInventoryPrice) {
            prices.add(Double.valueOf(i.getText().replace("$","")));
        }

        for(int j = 0; j < prices.size(); j++){
            Double itemJ = prices.get(j);
            if(itemJ > lowerPrice) {
                getRemoveBtn().click();
            }
            else
                System.out.println("Price is greater than 15.99");
        }
    }

    public static void clickCheckoutBtn() {
        getCheckoutBtn().click();
    }
}
