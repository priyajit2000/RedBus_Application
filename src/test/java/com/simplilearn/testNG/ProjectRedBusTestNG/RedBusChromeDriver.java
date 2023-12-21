package com.simplilearn.testNG.ProjectRedBusTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RedBusChromeDriver {

    WebDriver driver;
    String url = "https://www.redbus.in/";

    @BeforeClass
    public void setUp() {
     
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
      
        driver = new ChromeDriver();
   
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
            //driver.quit();
        }
    }
}
