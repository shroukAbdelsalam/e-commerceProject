package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D06_FilterByColorStepDef {
    WebDriver driver=Hooks.driver;
    @Given("Select any random category")
    public void SelectRandomCategory() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"/apparel\"]")).click();
    }
    @When("hover and open sub-Category if Exist")
    public void SelectSubCategory(){
        driver.findElement(By.cssSelector("a[href=\"/shoes\"]")).click();
    }
    @And("Change the color filter")
    public void ChangeColor(){
        driver.findElement(By.id("attribute-option-15")).click();
    }
    @Then("Ensure of ckecked color")
    public void EnsureOfChoosenColor(){
        WebElement checkeBox=driver.findElement(By.id("attribute-option-15"));
        boolean isSelected = checkeBox.isSelected();
        Assert.assertTrue(isSelected==true);
    }
}
