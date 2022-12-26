package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.example.pages.RegisterPage;
import org.example.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {
    WebDriver driver=Hooks.driver;

    @Given("click on login link")
    public void ClickLoginLink ()  {
        System.out.println("from locatemail");
        driver.findElement(By.className("ico-login")).click();
    }
    @When("user enter valid mail")
    public void  EnterEmail() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.className("email")).sendKeys("shrouk95@mail.com");
    }
    @And("user enter valid password")
    public void  EnterPassword() throws InterruptedException {
        driver.findElement(By.id("Password")).sendKeys("12345678");
        driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);

    }
    @And ("user click on login Button")
    public void  ClickLoginButton(){

       driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);

       // driver.findElement(By.className("button-1 login-button")).click();
    }
    @Then("login success message is display")
    public void SuccessLogIn () throws InterruptedException {
//        Thread.sleep(10000);
        SoftAssert soft= new SoftAssert();

       soft.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
//
}
}
