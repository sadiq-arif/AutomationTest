package PageObjects;

import Utils.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BaseClass {
    private static String ContinueBtn = "continue";
    private static String Error = "//h3[@data-test='error']";
    private static String FirstName = "first-name";
    private static String LastName = "last-name";
    private static String ZipCode = "postal-code";
    private static String CrossButton = "//button[@class='error-button']";
    private static String FinishBtn = "finish";
    private static String ThankyouHeading = "//h2[@class='complete-header']";
    private static String ThankyouText = "//div[@class='complete-text']";
    private static WebElement getCheckoutBtn() {return driver.findElement(By.id(ContinueBtn));}
    private static WebElement getErrorTest() {return driver.findElement(By.xpath(Error));}
    private static WebElement getFirstName() {return driver.findElement(By.id(FirstName));}
    private static WebElement getLastName() {return driver.findElement(By.id(LastName));}
    private static WebElement getZipCode() {return driver.findElement(By.id(ZipCode));}
    private static WebElement getCrossErrorBtn() {return driver.findElement(By.xpath(CrossButton));}
    private static WebElement getFinishBtn() {return driver.findElement(By.id(FinishBtn));}
    private static WebElement getThankyouHeading() {return driver.findElement(By.xpath(ThankyouHeading));}
    private static WebElement getThankyouText() {return driver.findElement(By.xpath(ThankyouText));}
    public static void clickContinueBtn() {
        getCheckoutBtn().click();
    }

    public static void checkError() {
        Assert.assertTrue(getErrorTest().isDisplayed());
    }

    public static void fillCheckoutDetails(String firstName, String lastName, String zipCode) {
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
        getLastName().clear();
        getLastName().sendKeys(lastName);
        getZipCode().clear();
        getZipCode().sendKeys(zipCode);
    }

    public static void clickCrossBtn() {
        getCrossErrorBtn().click();
    }

    public static void clickFinishBtn() {
        getFinishBtn().click();
    }

    public static void getThankyouMessage() {
        String thankyouHeading = getThankyouHeading().getText();
        String thankyouText = getThankyouText().getText();

        System.out.println(thankyouHeading);
        System.out.println(thankyouText);
    }
}
