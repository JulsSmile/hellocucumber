package com.epam.test;

import com.epam.utils.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks{
    @Before
    public void openDriver() {
            }

    @After
    public void closeDriver() {
        DriverManager.closeDriver();
    }
}


