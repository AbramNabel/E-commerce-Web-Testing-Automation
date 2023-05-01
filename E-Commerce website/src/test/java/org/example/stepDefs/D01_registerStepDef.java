package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pagesLocators.P01_register;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef
{
    P01_register loc= new P01_register();
    SoftAssert softAssert = new SoftAssert();
    @Given("navigate to home page")
    public void navigate_to_home_page()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user go to register page")
    public void user_go_to_register_page()
    {
        loc.registerLoc().click();
    }
    @When("user select gender type")
    public void user_select_gender_type()
    {
        loc.genderloc().click();
    }
    @And("user enter first name \"automation\" and last name \"tester\"")
    public void user_enter_first_name_last_name()
    {
        loc.firstNameLoc().sendKeys("automation");
        loc.lastNameLoc().sendKeys("tester");
    }
    @And("user enter date of birth")
    public void user_enter_date_of_birth()
    {
        Select sel =new Select(loc.dayOfBirth());
        sel.selectByIndex(9);

        Select selM=new Select(loc.monthOfBirth());
        selM.selectByIndex(7);

        Select selY = new Select(loc.yearOfBirth());
        selY.selectByIndex(84);
    }
    @And("user enter email \"testabram@example.com\" field")
    public void user_enter_email()
    {
        loc.emailLoc().sendKeys("testabram@example.com");
    }
    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void user_fills_password()
    {
        loc.passwordLoc().sendKeys("P@ssw0rd");
        loc.confirmPasswordLoc().sendKeys("P@ssw0rd");
    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button()
    {
        loc.registerButtonLoc().click();
    }
    @Then("success message is displayed")
    public void success_message_is_displayed()
    {
        boolean condition = loc.successMessageLoc().isDisplayed();
        softAssert.assertTrue(condition,"True");
        String rgbFormat = loc.successMessageLoc().getCssValue("color");
        System.out.println(rgbFormat);
        softAssert.assertEquals(rgbFormat,"rgba(76, 177, 124, 1)","True color");
        softAssert.assertAll();

    }
}
