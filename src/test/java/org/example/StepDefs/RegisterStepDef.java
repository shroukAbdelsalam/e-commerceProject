package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterStepDef {
    WebDriver driver= new ChromeDriver();
    final String RegisterUrl="https://demo.nopcommerce.com/register";
    final String WebsiteUrl="https://demo.nopcommerce.com";
    final String ChromePath= System.getProperty("user.dir")+"\\src\\test\\resources\\resource\\chromedriver.exe";
RegisterPage registerPage= new RegisterPage(driver);
    @Before
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.edge.verboseLogging", ChromePath);
        driver.navigate().to(WebsiteUrl);
        Thread.sleep(5000);
        driver.manage().window().maximize();
    }
    @After
    public void CloseBrowser() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }

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
//
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
        Assert.assertTrue(ActualResult.contains(ExpectedResult));

    }


}
