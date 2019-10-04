package hellocucumber;

import org.junit.After;
import pages.DriverAbstract;

public class Hooks{
    @After
    public void closeDriver(){
        new DriverAbstract().closeDriver();
    }
}


