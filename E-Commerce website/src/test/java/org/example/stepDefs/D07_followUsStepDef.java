package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pagesLocators.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class D07_followUsStepDef
{
P03_homePage locator = new P03_homePage();
@Given("user click on facebook link")
    public void user_click_on_facebook_link()
{
    locator.facebookLocator().click();

}
@Then("facebook is opened in new tab")
    public void facebook_Tab_isOpened()
    {
    WebDriverWait wait = new WebDriverWait(Hooks.driver , Duration.ofMillis(15000));
     Set<String> tabs = Hooks.driver.getWindowHandles();
     String tab1 = (String)  tabs.toArray()[0];
     String tab2 = (String)  tabs.toArray()[1];
     Hooks.driver.switchTo().window(tab2);
     String expectedResult = "https://www.facebook.com/nopCommerce";
    String currentResult = Hooks.driver.getCurrentUrl();
    Assert.assertEquals(currentResult,expectedResult);
    Hooks.driver.close();
   }
    @Given("user click on twitter link")
    public void user_click_on_twitter_link()
    {
        locator.twitterLocator().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

    }
    @Then("twitter is opened in new tab")
    public void twitter_Tab_isOpened()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver , Duration.ofMillis(2000));
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Set<String> tabs = Hooks.driver.getWindowHandles();
        String tab1 = (String)  tabs.toArray()[0];
        String tab2 = (String)  tabs.toArray()[1];
        Hooks.driver.switchTo().window(tab2);

        String expectedResult = "https://twitter.com/nopCommerce";
        String currentResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentResult,expectedResult);
        Hooks.driver.quit();
    }
    @Given("user click on rss link")
    public void user_click_on_rss_link()
    {
        locator.rssLocator().click();

    }
    @Then("rss is opened in new tab")
    public void rss_Tab_isOpened()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver , Duration.ofMillis(15000));
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
        Set<String> tabs = Hooks.driver.getWindowHandles();
        String tab1 = (String)  tabs.toArray()[0];
        String tab2 = (String)  tabs.toArray()[1];
        Hooks.driver.switchTo().window(tab2);
        String expectedResult = "https://demo.nopcommerce.com/new-online-store-is-open";
        String currentResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentResult,expectedResult);
    }

    @Given("user click on youtube link")
    public void user_click_on_youtube_link()
    {
        locator.youtubeLocator().click();

    }
    @Then("youtube is opened in new tab")
    public void youtube_Tab_isOpened()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver , Duration.ofMillis(15000));
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
        Set<String> tabs = Hooks.driver.getWindowHandles();
        String tab1 = (String)  tabs.toArray()[0];
        String tab2 = (String)  tabs.toArray()[1];
        Hooks.driver.switchTo().window(tab2);
        String expectedResult = "https://www.youtube.com/user/nopCommerce";
        String currentResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentResult,expectedResult);
    }

}
