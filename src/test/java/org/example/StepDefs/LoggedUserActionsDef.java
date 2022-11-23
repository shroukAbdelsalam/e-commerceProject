package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.LoggedUserActionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoggedUserActionsDef {
    WebDriver driver= new ChromeDriver();
    LoggedUserActionsPage loggedPage= new LoggedUserActionsPage(driver);
    @Given("user is success logged")
    public void EnsureLogged(){
        Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
    }
    @When("type of search field")
    public void EnterInSearch(){
        loggedPage.LocateSearchBox().sendKeys("Shoes");
    }
    @And("Click on search Button")
    public void ClickOnSearchButton(){
        loggedPage.LocateSearchButton().click();
    }
    @Then("Categories id display")
    public void EnsureCategoryDisplay(){
        Assert.assertTrue(driver.findElement(By.linkText("Categories")).isDisplayed());
    }

    @And("Search for any product")
    public void SearchForProduct(){
        loggedPage.LocateSearchBox().sendKeys("adidas Consortium Campus 80s");
    }
    @When("click on dropdownlist of currencies and select one")
    public void ChangeCurrency(){
        Select currancy = new Select(driver.findElement(By.id("customerCurrency")));
        currancy.selectByVisibleText("Euro");
    }
    @Then("price display of  product change to selected currencies")
    public void EnsurecurrencyChanged(){
        String Actual=driver.findElement(By.className("price actual-price")).getText();
        Assert.assertTrue(Actual.contains("€"));

    }
    @When("Select random category")
    public void SelectRandomCategory() throws InterruptedException {
        loggedPage.LocateCategory().click();
    }
    @And("hover and open sub-Category if found")
    public void SelectSubCategory(){
        loggedPage.LocateSubCategory().click();
    }
    @Then("Ensure top bar hold same choosen sub-category")
    public void SubmitTopBar(){
        String ExpectedResult="shoes";
        String ActualResult= driver.findElement(By.className("current-item")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
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
    @And("select tag")
    public void SelectTag(){
        loggedPage.LocateTag().click();
    }

    @Then("Ensure Selected Tag Name is appear in top")
    public void EnsureOfSelectedTag(){
        String Expected="Products tagged with 'apparel'";
      String Actual=  driver.findElement(By.cssSelector("h1")).getText();
        Assert.assertTrue(Actual.contains(Expected));
    }
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
    @And("add item to wishlist")
    public void AddToWishList(){

        driver.findElement(By.id("add-to-wishlist-button-25")).click();
    }
    @Then("The product has been added to your wishlist")
    public void ProductAddedToWishList(){
        Assert.assertTrue(driver.findElement(
                By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
    }

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
