package com.phptravels.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 10/4/2016.
 * Modeling after http://blog.testproject.io/2016/09/06/test-automation-selenium-page-object-model-page-factory/
 * Learning about pagefactory
 * Creating page object models (POMS)
 */
public class HomePage {
    private WebDriver driver;   //private is an access modifier allows access to this class only

    //Page URL:
    private static String PAGE_URL = "http://phptravels.com/";

    //Locators:
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/ul/li[8]/a")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/ul/li[1]/a")
    private WebElement demoLink;

    //Constructor:
    //In class-based object-oriented programming, a constructor (abbreviation: ctor) in a class is a special type of subroutine called to create an object.
    // It prepares the new object for use, often accepting arguments that the constructor uses to set required member variables.
    public HomePage(WebDriver driver){
        this.driver = driver;               //"this" is a keyword in Java. It can be used inside the Method or constructor of Class.
        // It(this) works as a reference to the current Object whose Method or constructor is being invoked.
        // The this keyword can be used to refer to any member of the current object from within an instance Method or a constructor.
        driver.get(PAGE_URL);

        //Initialize Elements
        PageFactory.initElements(driver, this);
    }

    //We will use this boolean for assertion. To check if page is opened
    //String actualTitle = driver.getTitle();
    //public boolean isPageOpened(){
    //use some heading?
      //  return actualTitle.contains("PHP Hotels Script tours");
    //}

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void clickOnDemoLink() { demoLink.click(); }
}
