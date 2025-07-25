package org.saucelab.Steps;

import io.cucumber.java.en.When;
import org.saucelab.Pages.P02_ProductsPage;

public class ProductsStepDef {

    P02_ProductsPage products=new P02_ProductsPage();
    @When("user add product to cart")
    public void user_add_product_to_cart() {
       products.addSaucelabProductToCart();
    }
    @When("user navigates to shopping cart")
    public void user_naviagtes_to_shopping_cart() {
        products.clickOnCart();
    }
}
