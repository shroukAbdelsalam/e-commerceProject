package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    WebDriver driver=Hooks.driver;
    @Given("Select random category")
    public void SelectRandomCategory() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"/apparel\"]")).click();
    }
    @When("hover and open sub-Category if found")
    public void SelectSubCategory(){
        driver.findElement(By.cssSelector("a[href=\"/shoes\"]")).click();
    }
    @Then("Ensure top bar hold same choosen sub-category")
    public void SubmitTopBar(){
        String ExpectedResult="shoes";
        String ActualResult= driver.findElement(By.className("current-item")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
}
