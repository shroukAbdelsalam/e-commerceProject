package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement LocateFirstName(){
        return driver.findElement(By.id("FirstName"));
    }
    public WebElement LocateLastName(){
        return   driver.findElement(By.id("LastName"));
    }
    public WebElement LocateEmail(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement LocatePassword(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement LocateConfirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement LocateGenderMail(){
        return driver.findElement(By.id("gender-male"));
    }
    public WebElement LocateGenderFemail(){
        return driver.findElement(By.id("gender-female"));
    }
    public WebElement LocateRegisterButton(){
        return driver.findElement(By.id("register-button"));
    }
}
