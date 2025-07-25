package org.saucelab.Pages;

import org.openqa.selenium.By;
import org.saucelab.Steps.Hooks;

public class P02_ProductsPage {

    By AddtoCartsauceLabeLocator= By.id("add-to-cart-sauce-labs-bike-light");
    By cart=By.xpath("//div[@id='shopping_cart_container']//a");

    public void addSaucelabProductToCart(){
        Hooks.driver.findElement(AddtoCartsauceLabeLocator).click();
    }

    public void clickOnCart(){
        Hooks.driver.findElement(cart).click();
    }
}
