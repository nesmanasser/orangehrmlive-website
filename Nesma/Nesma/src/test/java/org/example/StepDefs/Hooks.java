package org.example.StepDefs;

import java.time.Duration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void open() {
        driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com/");
        // Implicitly Wait.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Explicitly Wait.
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void quit() {
        driver.quit();
    }
}