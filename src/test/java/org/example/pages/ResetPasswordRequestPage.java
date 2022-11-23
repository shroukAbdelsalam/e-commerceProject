package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordRequestPage {
    WebDriver driver;
    public ResetPasswordRequestPage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement LocateForgetPasswordLink()  {

        return driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }
    public WebElement LocateEmailAdressField(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement LocateRecoverButton(){
        return driver.findElement(By.className("button-1 password-recovery-button"));
    }
    public WebElement LocateDisplayedMessage(){
        return driver.findElement(By.className("content"));
    }

}
