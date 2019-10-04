package pages;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class DriverAbstract{

        protected WebDriver driver = DriverManager.getDriver();

        public void closeDriver(){
            if(driver!=null)
                driver.quit();
        }
    }