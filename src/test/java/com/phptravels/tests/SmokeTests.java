package com.phptravels.tests;

import com.phptravels.webpages.DemoPage;
import com.phptravels.webpages.HomePage;
import com.phptravels.webpages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 10/4/2016.
 */
public class SmokeTests {
    WebDriver driver;

    @Before
    public void setup(){
        //use Firefox Driver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
        //Without this line we get error: Exception in thread "main" java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.geck
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void Login(){
        //-------------Home Page---------------------
        //Create object of HomePage Class
        HomePage homePage = new HomePage(driver);

        //Check if page is opened
        Assert.assertTrue(driver.getTitle().contains("PHP Hotels Script tours"));

        //-------------Demo Page----------------------
        //Navigate to Demo Page
        homePage.clickOnDemoLink();

        //Create object of DemoPage Class
        DemoPage demoPage = new DemoPage(driver);

        //Check if page is opened
        Assert.assertTrue(driver.getTitle().contains("Demo"));

        //-------------Login Page---------------------
        //Navigate to Login Page
        homePage.clickOnLoginButton();

        //Create object of LoginPage
        LoginPage loginPage = new LoginPage(driver);

        //Check if page is opened
        Assert.assertTrue(driver.getTitle().contains("Client Area - PHPTRAVELS"));
    }

    @After
    public void close(){
        driver.close();
    }
    //Generally driver.close() closes the browser(the instance of driver is still intact) and
    //driver.driver.quit() is to kill the webdriver instance.
}
