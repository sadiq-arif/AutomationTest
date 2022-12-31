package StepDefinition;

import PageObjects.HomePage;
import io.cucumber.java.en.And;

public class HomePageStepDefinition {

    @And("user change the dropdown from Z to A")
    public void userChangeTheDropdownFromZToA() {
        HomePage.SortByDropDown();
    }

    @And("user add to cart the less price products")
    public void userAddToCartTheLessPriceProducts() {
        HomePage.checkPrice();
    }

    @And("user click on cart button")
    public void userClickOnCartButton() {
        HomePage.clickOnShoppingCartBtn();
    }
}
