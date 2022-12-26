package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D09_AddToWishListStepDef {
    WebDriver driver=Hooks.driver;
    @And("add item to wishlist")
    public void AddToWishList(){

        driver.findElement(By.id("add-to-wishlist-button-25")).click();
    }
    @Then("The product has been added to your wishlist")
    public void ProductAddedToWishList(){
        Assert.assertTrue(driver.findElement(
                By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
    }

}
