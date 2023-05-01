package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pagesLocators.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef
{
    P03_homePage locator = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();
@Given("user clicks on heart")
        public void user_clicks_onHeart()
{
    locator.heartLocator().click();
}
@Then("success green message is displayed")
    public void green_message_is_displayed()
{
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(15000));
    WebElement con = locator.wishlistmessageLocator();
    wait.until(ExpectedConditions.visibilityOf(con));
    boolean condition = locator.wishlistmessageLocator().isDisplayed();
    softAssert.assertTrue(condition);
    String rgbFormat = con.getCssValue("background-color");
    String hexcolor = Color.fromString(rgbFormat).asHex();
    softAssert.assertEquals(hexcolor,"#4BB07A");
}
@And("user clicks on wishlist")
    public void user_clicks_on_wishlist()
{
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(15000));
    wait.until(ExpectedConditions.invisibilityOf(locator.wishlistmessageLocator()));
    locator.wishlistButton().click();
}
@Then("quantity is more than one")
    public void quantity_is_more_than_one()
{
    String QTY = locator.QTY().getAttribute("value");
    int i=Integer.parseInt(QTY);
    Assert.assertEquals(i,1);
}

}
