package com.seleniumsimplified.webdriver;

import static org.junit.Assert.*;
/**
 * RIGHT NOW THIS DOES NOT WORK WITH WINDOWS 10 64 BIT
 *
 * a static import to make the members available without qualification. If you use:
 import static org.junit.Assert.*;
 then that should statically import all the static methods in the Assert class, so you can write assertTrue instead of Assert.assertTrue.
 Note that presumably Assert itself has nested types, otherwise I'd have expected your "normal" import to fail.
 */
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Admin on 9/29/2016.
 * Requires latest ChromeDriver from:
 *      https://sites.google.com/a/chromium.org/chromedriver/downloads
 *      1. Download zip file and extract to location example C:\chromedriver_win32
 *
 *  Setup:
 *      1. include the ChromeDriver location in your PATH environment variable
 *          Windows 10: type "environment variables"
 *          System Properties window opens.  Click "Environment Variables..."
 *          Under System Variables, select Path (NOT VARIABLES FOR ADMIN) and "Edit..."
 *          Select "New" and add C:\chromedriver_win32
 *      2. (Java only) specify its location via the webdriver.chrome.driver system property
 */
public class ChromeBrowser
{
    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        // RIGHT NOW THIS DOES NOT WORK WITH WINDOWS 10 64 BIT
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver");

        /**WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
         */
    }
}
