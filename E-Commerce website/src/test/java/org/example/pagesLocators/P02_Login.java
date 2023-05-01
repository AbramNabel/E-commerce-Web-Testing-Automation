package org.example.pagesLocators;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login
{
    public WebElement loginLocator()
    {
        WebElement LoginLoc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        return LoginLoc;
    }
    public WebElement loginEmailLocator()
    {
        WebElement LoginLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        return LoginLoc;
    }
    public WebElement passwordLoginLocator()
    {
        WebElement PassLoc = Hooks.driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        return PassLoc;
    }
    public WebElement loginButtonLocator()
    {
        WebElement LoginLocButton = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        return LoginLocButton;
    }
    public WebElement myAccLocator()
    {
        WebElement MyAccLoc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        return MyAccLoc;
    }
    public WebElement loginWasUnsuccessfulMessage()
    {
        WebElement LWUMessage = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
        return LWUMessage;
    }


}
