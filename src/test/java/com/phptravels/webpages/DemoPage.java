package com.phptravels.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 10/5/2016.
 */
public class DemoPage {
    private WebDriver driver;

    //Page URL:
    private static String PAGE_URL = "http://phptravels.com/demo/";

    //Locators:


    //Constructor:
    public DemoPage(WebDriver driver){
    this.driver = driver;
    driver.get(PAGE_URL);

    //Initialize Elements
    PageFactory.initElements(driver, this);
    }

}
