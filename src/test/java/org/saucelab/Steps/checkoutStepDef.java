package org.saucelab.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.saucelab.Pages.P03_CartPage;
import org.saucelab.Pages.P04_CheckOutPage;
import org.testng.Assert;

public class checkoutStepDef {
P04_CheckOutPage checkout=new P04_CheckOutPage();

    @When("provide checkout firstName as {string} and lastName as {string} and Postalcode as {string}")
    public void provide_checkout_first_name_as_and_last_name_as_and_postalcode_as(String firstName, String lastName, String Postal) {
        checkout.insertFirstName(firstName);
        checkout.insertLastName(lastName);
        checkout.insertPostalcode(Postal);

    }
    @When("user click on continue Button")
    public void user_click_on_continue_button() {
       checkout.clickOnContinue();
    }


    @When("user redirected to checkout overview and clicks on Finish button")
    public void user_redirected_to_checkout_overview_and_clicks_on_finish_button() {
     checkout.clickonFinish();
    }

    @Then("success message will be displayed {string}")
    public void success_message_will_be_displayed(String Msg) {
       Boolean result= checkout.AssertSuccessMessageDisplay(Msg);
        Assert.assertTrue(result,"success");
    }

}
