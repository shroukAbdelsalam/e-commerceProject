package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    WebDriver driver = Hooks.driver;

    @Given("Search for any product")
    public void SearchForProduct() {
        driver.findElement(By.id("small-searchterms")).sendKeys("adidas Consortium Campus 80s");
    }

    @When("click on dropdownlist of currencies and select one")
    public void ChangeCurrency() {
        Select currancy = new Select(driver.findElement(By.id("customerCurrency")));
        currancy.selectByVisibleText("Euro");
    }

    @Then("price display of  product change to selected currencies")
    public void EnsurecurrencyChanged() {
        String Actual = driver.findElement(By.className("price actual-price")).getText();
        Assert.assertTrue(Actual.contains("€"));
    }
}