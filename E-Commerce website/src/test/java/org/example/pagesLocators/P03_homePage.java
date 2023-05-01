package org.example.pagesLocators;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage
{
    public WebElement currencyDropList()
    {
        WebElement dropList = Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]"));
        return dropList;
    }
    public List <WebElement> checkcurrency()
    {
        List <WebElement> CheckCurrency = Hooks.driver.findElements(By.className("actual-price"));
        return CheckCurrency;
    }
    public WebElement searchLocator()
    {
        WebElement Searchloc = Hooks.driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        return Searchloc;
    }
    public WebElement searchbuttonlocator()
    {
        WebElement searchbutton = Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
        return searchbutton;
    }
    public WebElement computersLocator()
    {
        WebElement comploc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        return comploc;
    }
    public WebElement desktopLoc()
    {
        WebElement deskloc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
        return deskloc;
    }
    public WebElement iphoneLocator()
    {
        WebElement iphoneloc = Hooks.driver.findElement(By.xpath("//*[@src=\"https://demo.nopcommerce.com/images/thumbs/0000088_banner_01.webp\"]/a[1]/img"));
        return iphoneloc;
    }
    public WebElement samsunglocator()
    {
        WebElement samloc = Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
        return samloc;
    }

    public WebElement facebookLocator()
    {
        WebElement faceloc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
        return faceloc;
    }

    public WebElement twitterLocator()
    {
        WebElement twitterloc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
        return twitterloc;
    }
    public WebElement rssLocator()
    {
        WebElement rssloc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]"));
        return rssloc;
    }
    public WebElement youtubeLocator()
    {
        WebElement youtubeLoc = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
        return youtubeLoc;
    }
    public WebElement heartLocator()
    {
        WebElement heart = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
        return heart;
    }
    public WebElement wishlistmessageLocator()
    {
        WebElement mess = Hooks.driver.findElement(By.id("bar-notification"));
        return mess;
    }
    public WebElement greenlocator()
    {
        WebElement green = Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
        return green;
    }
    public WebElement wishlistButton()
    {
        WebElement wish = Hooks.driver.findElement(By.className("wishlist-label"));
        return wish;
    }
    public WebElement QTY()
    {
        WebElement qty = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
        return qty;
    }
    public WebElement searchresult()
    {
        WebElement searchresult = Hooks.driver.findElement(By.xpath("//*[@id=\"q\"]"));
        return searchresult;
    }
    public WebElement selectProduct()
    {
        WebElement selectproduct =  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img"));
        return selectproduct;
    }
    public WebElement productSKU()
    {
        WebElement productsku = Hooks.driver.findElement(By.xpath("//*[@class=\"sku\"]"));
        return productsku;
    }

}
