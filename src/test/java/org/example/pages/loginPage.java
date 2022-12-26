package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    static WebDriver driver;
    public loginPage(WebDriver driver){
        this.driver=driver;
    }
    public static WebElement LocateEmailBox(){
        System.out.println("from locatemail");
        return driver.findElement(By.id("Email"));
    }
    public static WebElement LocatePasswordBox(){
        return driver.findElement(By.id("Password"));
    }

    public static WebElement LocateLogInButton(){
        return driver.findElement(By.className("button-1"));
    }
}
