package com.simplilearn.testNG.ProjectRedBusTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RedBusFirefoxDriver {

    WebDriver driver;
    String url = "https://www.redbus.in/";

    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.gecko.driver", "DRIVERS/WIN/geckodriver.exe");
        driver = new FirefoxDriver();
        // Navigate to the RedBus website
        driver.get(url);
    }

    @Test(priority = 1)
    public void verifyTitle() {
        // Verify the title of the RedBus website
        String expectedTitle = "Online Bus Ticket Booking with Best Offers and Lowest Price - redBus";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after all tests are executed
        if (driver != null) {
            driver.quit();
        }
    }
}