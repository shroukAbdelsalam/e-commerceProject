package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ResetPasswordRequestPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ResetPasswordDef {
    WebDriver driver= new ChromeDriver();
    ResetPasswordRequestPage resetpage=new ResetPasswordRequestPage(driver);
    @And("click on Forgot password? link")
    public void EnterForgetLink() throws InterruptedException {
        Thread.sleep(5000);
        resetpage.LocateForgetPasswordLink().click();
    }
    @When("user enter  mail to reset password")
    public void EnterEmail(){
        resetpage.LocateEmailAdressField().sendKeys("shrouk95@mail.com");
    }
    @And("user click on recover Button")
    public void ClickOnRecoverButton(){
        resetpage.LocateRecoverButton().click();
    }
    @Then("success email is send message is display")
    public void SuccessResetMessage(){
      String ActualResult=  resetpage.LocateDisplayedMessage().getText();
      String ExpectedResult="Email with instructions has been sent to you.";
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }


}
