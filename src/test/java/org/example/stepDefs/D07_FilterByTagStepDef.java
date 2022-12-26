package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D07_FilterByTagStepDef {
    WebDriver driver=Hooks.driver;
    @And("select tag")
    public void SelectTag(){
        driver.findElement(By.cssSelector("a[href=\"/apparel-2\"]")).click();
    }

    @Then("Ensure Selected Tag Name is appear in top")
    public void EnsureOfSelectedTag(){
        String Expected="Products tagged with 'apparel'";
        String Actual=  driver.findElement(By.cssSelector("h1")).getText();
        Assert.assertTrue(Actual.contains(Expected));
    }
}
