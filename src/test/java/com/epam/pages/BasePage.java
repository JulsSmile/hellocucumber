package com.epam.pages;

import com.epam.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage{

    public static WebDriver getDriver() {
        return DriverManager.getDriver();
    }
}