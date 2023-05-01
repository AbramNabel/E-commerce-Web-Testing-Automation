package org.example.stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pagesLocators.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef
{
    P02_Login locator = new P02_Login();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void user_go_to_login_page()
    {
        locator.loginLocator().click();
    }
    @When("user login with \"valid\" \"testabram@example.com\" and \"P@ssw0rd\"")
    public void user_login_with_valid_credentials()
    {
        locator.loginEmailLocator().sendKeys("testabram@example.com");
        locator.passwordLoginLocator().sendKeys("P@ssw0rd");
    }
    @And("user press on login button")
    public void user_press_on_login_button()
    {
        locator.loginButtonLocator().click();
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully()
    {
        String currentUrl = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(currentUrl,"https://demo.nopcommerce.com/","URL True");
        boolean CheckMyAcc = locator.myAccLocator().isDisplayed();
        softAssert.assertTrue(CheckMyAcc,"MyAcc Is Displayed");
    }
    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void user_login_with_invalid_credentials()
    {
        locator.loginEmailLocator().sendKeys("wrong@example.com");
        locator.passwordLoginLocator().sendKeys("P@ssw0rd");
    }
    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system()
    {
        boolean unsuccessfulMessage = locator.loginWasUnsuccessfulMessage().isDisplayed();
        softAssert.assertTrue(unsuccessfulMessage);
        String rgbFormat = locator.loginWasUnsuccessfulMessage().getCssValue("color");
        String hexcolor = Color.fromString(rgbFormat).asHex();
        System.out.println(hexcolor);
        softAssert.assertEquals(hexcolor,"#e4434b");
        softAssert.assertAll();
    }
}
