package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D08_AddToCardStepDef {
    WebDriver driver=Hooks.driver;
    @And("open SelectedItem")
    public void OpenSelcectedItem(){
        driver.findElement(By.cssSelector
                ("a[href=\"/adidas-consortium-campus-80s-running-shoes\"]")).click();
    }
    @And("add selected item to card")
    public void AddSlectedItem() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button-25")).click();
    }
    @And("Select Size")
    public void SelectSize() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("product_attribute_9")).click();
        driver.findElement(By.cssSelector("option[data-attr-value=\"21\"]")).click();
    }
    @Then("Added Messae is visible")
    public void SuccessMessage(){
        String ExpectesResult="The product has been added to your shopping cart";
        Assert.assertTrue(driver.findElement(
                By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed()) ;
    }
}
