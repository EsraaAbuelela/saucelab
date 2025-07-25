package org.saucelab.Pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.saucelab.Steps.Hooks;

public class P04_CheckOutPage {

    By firstName= By.id("first-name");
    By lastName=By.id("last-name");
    By postalcode=By.id("postal-code");
    By continueBtn=By.id("continue");
   By finish=By.id("finish");
   By successMsg=By.xpath("//h2[text()=\"Thank you for your order!\"]");


public void insertFirstName(String fName){
    Hooks.driver.findElement(firstName).sendKeys(fName);
}

public void insertLastName (String lName){
    Hooks.driver.findElement(lastName).sendKeys(lName);

}

public void insertPostalcode(String postal)
{Hooks.driver.findElement(postalcode).sendKeys(postal);}

    public void clickOnContinue(){
    Hooks.driver.findElement(continueBtn).click();
    }
    public void clickonFinish(){
        Hooks.driver.findElement(finish).click();
    }

    public Boolean AssertSuccessMessageDisplay(String Msg){
    return Hooks.driver.findElement(By.xpath("//h2[text()='"+Msg+"']")).isDisplayed();
    }

}
