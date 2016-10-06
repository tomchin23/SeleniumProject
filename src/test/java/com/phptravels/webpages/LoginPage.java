package com.phptravels.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 10/4/2016.
 */
public class LoginPage {
    private WebDriver driver;

    //Page URL:
    private static String PAGE_URL = "https://phptravels.org/clientarea.php";

    //Locators:
    @FindBy(xpath = "//[@id='main-body']/div[1]/div/div/form/div[4]/a")
    private WebElement forgotPasswordButton;

    //Constructor:
    public LoginPage(WebDriver driver){
    this.driver = driver;
    driver.get(PAGE_URL);

    //Initialize Elements
    PageFactory.initElements(driver, this);
    }

    public void clickOnLoginButton(){
        forgotPasswordButton.click();
    }
}
