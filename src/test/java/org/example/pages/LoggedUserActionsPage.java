package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

public class LoggedUserActionsPage {
    WebDriver driver;
    public LoggedUserActionsPage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement LocateSearchBox(){
        return driver.findElement(By.id("small-searchterms"));
    }
        public WebElement LocateSearchButton(){
        return driver.findElement(By.className("button-1"));
        }
    public WebElement LocateCategory() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement LocateSubCategory(){
        return driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
    }
    public WebElement LocateTag(){
        return driver.findElement(By.cssSelector("a[href=\"/apparel-2\"]"));
    }


}
