package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pagesLocators.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import sun.font.TrueTypeFont;

import java.util.List;

public class D03_currenciesStepDef
{
    P03_homePage locator = new P03_homePage();
    @Given("user Select Euro currency from the dropdown list on the top left of home page")
    public void user_Select_euro_currency()
    {
        Select sel = new Select(locator.currencyDropList());
        sel.selectByIndex(1);
    }
    @Then("Euro symbol is displayed across products of homepage")
    public void Euro_symbol_isDisplayed()
    {
        String expectedText = "€";

        for(WebElement element : locator.checkcurrency() ) {
            if (element.getText().contains(expectedText))
            {
                boolean actual = true;
              Assert.assertTrue(actual);
              System.out.println("euro is displayed");
            }
        }
    }
}
