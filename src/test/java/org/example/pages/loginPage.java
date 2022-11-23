package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    WebDriver driver;
    public loginPage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement LocateEmailBox(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement LocatePasswordBox(){
        return driver.findElement(By.id("Password"));
    }

    public WebElement LocateLogInButton(){
        return driver.findElement(By.className("button-1"));
    }
}
