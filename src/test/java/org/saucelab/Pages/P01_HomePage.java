package org.saucelab.Pages;

import org.openqa.selenium.By;
import org.saucelab.Steps.Hooks;

public class P01_HomePage {

    //Page locators
    By username=By.id("user-name");
    By password=By.id("password");
    By loginBTN=By.id("login-button");

public void insertUserName(String Name){
    Hooks.driver.findElement(username).sendKeys(Name);
}

public void insertPassword(String pass){
    Hooks.driver.findElement(password).sendKeys(pass);
}

public void clickOnLoginBtn(){
    Hooks.driver.findElement(loginBTN).click();
}

}
