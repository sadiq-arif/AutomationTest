package StepDefinition;

import PageObjects.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageStepDefinition {

    @Then("user remove the product of higher price")
    public void userRemoveTheProductOfHigherPrice() {
        CartPage.removeItem();
    }

    @And("user click on checkout button")
    public void userClickOnCheckoutButton() {
        CartPage.clickCheckoutBtn();
    }

}
