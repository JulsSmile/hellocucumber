package com.epam.pages;

import com.epam.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class DriverAbstract{

    static WebDriver driver = DriverManager.getDriver();

    public static void closeDriver() {
        if (driver != null)
            driver.quit();
        driver = null;
    }
}