package com.epam.hicucumber;

import com.epam.pages.DriverAbstract;
import cucumber.api.java.After;


public class Hooks{
    @After
    public void closeDriver() {
        DriverAbstract.closeDriver();
    }
}


