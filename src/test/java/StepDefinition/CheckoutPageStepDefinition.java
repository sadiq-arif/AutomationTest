package StepDefinition;

import PageObjects.CheckoutPage;
import Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Properties;

public class CheckoutPageStepDefinition {

    Properties properties = PropertiesUtil.loadUserProperties();
    @When("user click on continue button")
    public void userClickOnContinueButton() {
        CheckoutPage.clickContinueBtn();
    }

    @Then("user will see the error")
    public void userWillSeeTheError() {
        CheckoutPage.checkError();
    }

    @And("user fill the checkout information")
    public void userFillTheCheckoutInformation() {
        String firstName = properties.getProperty("firstname");
        String lastName = properties.getProperty("lastname");
        String zipCode = properties.getProperty("zipcode");

        CheckoutPage.clickCrossBtn();
        CheckoutPage.fillCheckoutDetails(firstName,lastName,zipCode);
        CheckoutPage.clickContinueBtn();
    }

    @And("user click on finish button")
    public void userClickOnFinishButton() {
        CheckoutPage.clickFinishBtn();
    }

    @Then("user will see the thankyou message")
    public void userWillSeeTheThankyouMessage() {
        CheckoutPage.getThankyouMessage();
    }
}
