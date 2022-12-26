package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    WebDriver driver=Hooks.driver;
    RegisterPage registerPage= new RegisterPage(driver);

    @Given("click on register link")
    public void ClickRegButton(){
        driver.findElement(By.className("ico-register")).click();

    }
    @When("user choose gender")
    public void userChooseGender(){
        registerPage.LocateGenderFemail().click();
    }
    @And("user enter first name and last name")
    public void  EnterFirstLastName(){
        registerPage.LocateFirstName().sendKeys("shrouk");
        registerPage.LocateLastName().sendKeys("abdelsalam");
    }
    @And("user enter birthday date")
    public void EnterBirthDayDate () throws InterruptedException {

//        driver.findElement(By.linkText("31")).sendKeys("31");
//        driver.findElement(By.linkText("31")).sendKeys(Keys.ENTER);

//        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
//
//        selectDay.selectByVisibleText("31");
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByVisibleText("May");
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByVisibleText("1995");
        Thread.sleep(5000);

    }
    @And("user enter Email")
    public void EnterMail(){
        registerPage.LocateEmail().sendKeys("shrouk95@mail.com");
    }
    @And("user enter password")
    public void EnterPassword (){
        registerPage.LocatePassword().sendKeys("12345678");
    }
    @And("user confirm password")
    public void ConfirmPassword (){
        registerPage.LocateConfirmPassword().sendKeys("12345678");
    }
    @And("user click on register Button")
    public void  ClickRegisterButton(){
        registerPage.LocateRegisterButton().click();
    }
    @Then("success message is display")
    public void ConfirmRegisteration (){

        String ExpectedResult= "Your registration completed";
        String ActualResult= driver.findElement(By.className("result")).getText();
        SoftAssert soft= new SoftAssert();
        soft.assertTrue(ActualResult.contains(ExpectedResult));
       // Assert.assertTrue(ActualResult.contains(ExpectedResult));


    }

}
