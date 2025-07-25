package org.saucelab.Pages;

import org.openqa.selenium.By;
import org.saucelab.Steps.Hooks;

public class P03_CartPage {

    By checkout= By.id("checkout");

    public void clickOnCheckout(){
        Hooks.driver.findElement(checkout).click();}
}
