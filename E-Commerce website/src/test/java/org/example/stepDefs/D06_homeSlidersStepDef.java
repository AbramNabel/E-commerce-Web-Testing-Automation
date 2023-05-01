package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pagesLocators.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef
{
    Actions action = new Actions(Hooks.driver);
    P03_homePage locator = new P03_homePage();
    @Given("user click on slider 1")
    public void user_click_on_slider_1()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver , Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOf(locator.iphoneLocator()));

        action.moveToElement(locator.iphoneLocator(),217,559).perform();
       // locator.iphoneLocator().click();
    }
    @Then("iphone window will open")
    public void iphone_window_will_open()
    {
        String currentURL = Hooks.driver.getCurrentUrl();
        String expectURL = "https://demo.nopcommerce.com/iphone14";
        Assert.assertEquals(currentURL , expectURL);
    }
    @Given("user click on slider 2")
    public void user_click_on_slider_2()
    {
        WebDriverWait wait4 = new WebDriverWait(Hooks.driver, Duration.ofMillis(5000));
        wait4.until(ExpectedConditions.visibilityOf(locator.samsunglocator()));
        locator.samsunglocator().click();
    }
    @Then("samsung window will open")
    public void samsung_window_will_open()
    {
        String currentURL = Hooks.driver.getCurrentUrl();
        String expectURL = "https://demo.nopcommerce.com/iphone14";
        Assert.assertEquals(currentURL , expectURL);
    }
}
