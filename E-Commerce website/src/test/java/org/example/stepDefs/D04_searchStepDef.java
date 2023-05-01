package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Examples;
import org.example.pagesLocators.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef
{
   P03_homePage locator = new P03_homePage();
   SoftAssert softAssert = new SoftAssert();
   Assertion hardAssert = new Assertion();
   @Given("user navigate to to the search bar")
   public void user_navigate_to_searchBar()
    {
       // Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        locator.searchLocator().click();
    }
     @And("user enter {string} on search and click search button")
     public void user_enter_example(String string) throws Throwable
    {
         locator.searchLocator().sendKeys(string);
         locator.searchbuttonlocator().click();
    }
    @Then("the product search {string} will appear")
    public void the_product_search_will_appear(String string) throws Throwable
    {
        String currentUrl = Hooks.driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/search?q=";
        boolean result = currentUrl.contains(expectedURL);
        softAssert.assertTrue(result);
        String value = locator.searchresult().getAttribute("value").toLowerCase();
        softAssert.assertEquals(value,string);


    }
    @And("user enter {string} in search sku and click search button")
    public void user_enter_example2(String string)
    {
        locator.searchLocator().sendKeys(string);
        locator.searchbuttonlocator().click();
        locator.selectProduct().click();
    }
    @Then("the product search sku {string} will appear")
    public void the_product_search_sku_will_appear(String string)
    {
        String currentSKU = locator.productSKU().getText();
        boolean result = currentSKU.contains(string);
        hardAssert.assertEquals(result,true);

    }
}
