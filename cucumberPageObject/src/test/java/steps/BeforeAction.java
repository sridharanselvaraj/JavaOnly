package steps;

import cucumber.api.java.Before;
import pages.utils.SeleniumDriver;

import java.net.MalformedURLException;

public class BeforeAction {

    @Before
    public static void setUp() throws MalformedURLException {
        SeleniumDriver.setUpDriver();
    }

}
