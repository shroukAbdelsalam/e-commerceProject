package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D09_AddToCompareListStepDef {
    WebDriver driver=Hooks.driver;

    @And("add item to CompareList")
    public void AddToCompareList(){

        driver.findElement(By.className("button-2")).click();
    }
    @Then("The product has been added to your CompareList")
    public void ProductAddedToCompareList(){
        Assert.assertTrue(driver.findElement(
                By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
    }


}
