package org.saucelab.Steps;

import io.cucumber.java.en.Given;
import org.saucelab.Pages.P01_HomePage;

public class HomeStepDef {
    P01_HomePage home= new P01_HomePage();

    @Given("user login as {string} and enter password as {string}")
    public void user_login_as_and_enter_password_as(String username, String Password) {
        home.insertUserName(username);
        home.insertPassword(Password);

    }
    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        home.clickOnLoginBtn();
    }
}
