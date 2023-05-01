package org.example.stepDefs;

import io.cucumber.core.backend.HookDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_lol.AN;
import org.example.pagesLocators.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

import static com.google.common.base.Predicates.contains;

public class D05_hoverCategoriesStepDef {
    Actions action = new Actions(Hooks.driver);
    P03_homePage locator = new P03_homePage();


    @Given("user hoover over Computers and select desktops")
    public void user_hoover_over_Computers()
    {


        action.moveToElement(locator.computersLocator()).perform();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        String selectedCategori = locator.computersLocator().getText().toLowerCase().trim();
        WebElement subCategori = locator.desktopLoc();
        locator.desktopLoc().click();

        if (selectedCategori.contains("desktops"))
        {
            locator.desktopLoc().click();

        }
    }
    @Then("desktop page is displayed")
            public void desktop_page_is_displayed()
    {
        String currentURL = Hooks.driver.getCurrentUrl();
        String expectURL = "https://demo.nopcommerce.com/desktops";
        Assert.assertEquals(currentURL , expectURL);

    }


}
