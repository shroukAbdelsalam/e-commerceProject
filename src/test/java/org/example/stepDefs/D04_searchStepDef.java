package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D04_searchStepDef {
    WebDriver driver = Hooks.driver;
    @Given("type of search field")
    public void EnterInSearch(){
        driver.findElement(By.id("small-searchterms")).sendKeys("Shoes");
    }
    @When("Click on search Button")
    public void ClickOnSearchButton(){
        driver.findElement(By.className("button-1")).click();
    }
    @Then("Categories id display")
    public void EnsureCategoryDisplay(){
        Assert.assertTrue(driver.findElement(By.linkText("Categories")).isDisplayed());
    }
}
