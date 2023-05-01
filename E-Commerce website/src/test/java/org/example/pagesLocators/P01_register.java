package org.example.pagesLocators;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_register
{
    public WebElement registerLoc()
    {
        WebElement RegisterLoc = Hooks.driver.findElement(By.className("ico-register"));
        return RegisterLoc;
    }
    public WebElement genderloc()
    {
        WebElement GenderLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
        return GenderLoc;
    }
    public WebElement firstNameLoc()
    {
        WebElement FirstNameLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
        return FirstNameLoc;
    }
    public WebElement lastNameLoc()
    {
        WebElement LastNameLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
        return LastNameLoc;
    }
    public WebElement dayOfBirth()
    {
        WebElement DayOfBirth = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
        return DayOfBirth;
    }
    public WebElement monthOfBirth()
    {
        WebElement MonthOfBirth = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
        return MonthOfBirth;
    }
    public WebElement yearOfBirth()
    {
        WebElement YearOfBirth = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
        return YearOfBirth;
    }
    public WebElement emailLoc()
    {
        WebElement EmailLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        return EmailLoc;
    }
    public WebElement passwordLoc()
    {
        WebElement PasswordLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        return PasswordLoc;
    }
    public WebElement confirmPasswordLoc()
    {
        WebElement ConfirmPasswordLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
        return ConfirmPasswordLoc;
    }
    public WebElement registerButtonLoc()
    {
        WebElement RegisterButtonLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        return RegisterButtonLoc;
    }
    public WebElement successMessageLoc()
    {
        WebElement SuccessMessageLoc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
        return SuccessMessageLoc;
    }

}
