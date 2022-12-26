package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hooks {
    public static WebDriver driver  ;
    final String WebsiteUrl="https://demo.nopcommerce.com";
    final String ChromePath= System.getProperty("user.dir")+"\\src\\main\\resources\\resource\\chromedriver.exe";

    @Before
    public void openBrowser() throws InterruptedException {
        System.out.println(ChromePath);
        driver= new ChromeDriver();
        System.setProperty("webdriver.edge.verboseLogging", ChromePath);
        driver.navigate().to(WebsiteUrl);

        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
