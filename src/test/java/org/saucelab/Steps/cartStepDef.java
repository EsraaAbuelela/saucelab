package org.saucelab.Steps;

import io.cucumber.java.en.When;
import org.saucelab.Pages.P03_CartPage;

public class cartStepDef {
    P03_CartPage checkout=new P03_CartPage();
    @When("user clicks on checkout")
    public void user_clicks_on_checkout() {
        checkout.clickOnCheckout();
    }

}
