package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LogInStepDef {
    WebDriver driver= new ChromeDriver();
    final String LogInUrl="https://demo.nopcommerce.com/login";
    loginPage loginPage= new loginPage(driver);
    @Given("click on login link")
    public void ClickLoginLink () throws InterruptedException {
        Thread.sleep(3000);
       // driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.findElement(By.className("ico-login")).click();
        //driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();

    }
   @When("user enter valid mail")
   public void  EnterEmail(){
       loginPage.LocateEmailBox().sendKeys("shrouk95@mail.com");
   }
    @And("user enter valid password")
    public void  EnterPassword(){
        loginPage.LocatePasswordBox().sendKeys("12345678");
    }
    @And ("user click on login Button")
    public void  ClickLoginButton(){
        loginPage.LocateLogInButton().click();
    }
    @Then("login success message is display")
    public void SuccessLogIn (){
        Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
    }
}
