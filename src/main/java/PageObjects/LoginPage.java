package PageObjects;

import Utils.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

public class LoginPage extends BaseClass {

    private static String Username = "user-name";
    private static String Password = "password";
    private static String LoginBtn = "login-button";
    private static String UltimategaEmail = "user[email]";
    private static String UltimategaPassword = "user[password]";
    private static String UltimategaSignInBtn = "//button[@type='submit']";
    private static String ErrorMessage = "//li[@class='form-error__list-item']";

    private static WebElement getUsername() {return driver.findElement(By.id(Username));}
    private static WebElement getPassword() {return driver.findElement(By.id(Password));}
    private static WebElement getLoginBtn() {return driver.findElement(By.id(LoginBtn));}
    private static WebElement getUltimategaEmail() {return driver.findElement(By.id(UltimategaEmail));}
    private static WebElement getUltimategaPassword() {return driver.findElement(By.id(UltimategaPassword));}
    private static WebElement getUltimategaSignInBtn() {return driver.findElement(By.xpath(UltimategaSignInBtn));}
    private static WebElement getErrorMessage() {return driver.findElement(By.xpath(ErrorMessage));}
    public static void enterUsername(String username) {
        getUsername().clear();
        getUsername().sendKeys(username);
    }

    public static void enterPassword(String password) {
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public static void clickLoginBtn() {
        getLoginBtn().click();
    }

    public static void switchTab() {
//        String windowHandle = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.close();
        driver.switchTo().window(tabs.get(1));
        driver.get("https://courses.ultimateqa.com/users/sign_in");
    }


    public static void enterUsernameOfUltimatega(String username) {
        getUltimategaEmail().clear();
        getUltimategaEmail().sendKeys(username);
    }

    public static void enterPasswordOfUltimatega(String password) {
        getUltimategaPassword().clear();
        getUltimategaPassword().sendKeys(password);
    }

    public static void clickSignInBtnOfUltimatega() {
        getUltimategaSignInBtn().click();
    }

    public static void checkError() {
        Assert.assertTrue(getErrorMessage().isDisplayed());
    }
}
