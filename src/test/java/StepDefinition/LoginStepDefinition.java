package StepDefinition;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.util.Properties;

public class LoginStepDefinition {

    Properties properties = PropertiesUtil.loadUserProperties();
    @Given("user enter valid username in username field")
    public void userEnterValidUsernameInUsernameField() {
        String username = properties.getProperty("username");
        LoginPage.enterUsername(username);
    }

    @And("user enter valid password in password field")
    public void userEnterValidPasswordInPasswordField() {
        String password = properties.getProperty("password");
        LoginPage.enterPassword(password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        LoginPage.clickLoginBtn();
    }

    @Then("user logged in successfully")
    public void userLoggedInSuccessfully() {
        System.out.println("User Logged In Successfully");
    }

    @Given("user redirects to ultimatega page in new tab")
    public void userRedirectsToUltimategaPageInNewTab() {
        LoginPage.switchTab();
    }

    @And("user enters username of ultimatega")
    public void userEntersUsernameOfUltimatega() {
        String username = properties.getProperty("username");
        LoginPage.enterUsernameOfUltimatega(username);
    }

    @And("user enters password of ultimatega")
    public void userEntersPasswordOfUltimatega() {
        String password = properties.getProperty("password");
        LoginPage.enterPasswordOfUltimatega(password);
    }

    @Then("user clicks on Sign In of ultimatega")
    public void userClicksOnSignInOfUltimatega() {
        LoginPage.clickSignInBtnOfUltimatega();
    }
}
