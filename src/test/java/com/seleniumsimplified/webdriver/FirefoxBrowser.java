package com.seleniumsimplified.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 /**
 * Created by Admin on 9/29/2016.
  * latest version of Selenium WebDriver i.e. Selenium 3.x, this version of webdriver doesn't support direct firefox launch. You have to set the SystemProperty for webdriver.gecko.driver.
  *
  * http://www.learn-selenium.com
  *
  * Get geckodriver:
  * 1. The latest version can be downloaded from https://github.com/mozilla/geckodriver/releases
  * 2. Download geckodriver-v0.10.0-win64.zip
  * See https://github.com/mozilla/geckodriver
 */
public class FirefoxBrowser
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
        //Without this line we get error: Exception in thread "main" java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.geck
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        //driver.quit();
    }
}
