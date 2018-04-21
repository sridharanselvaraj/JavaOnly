package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.utils.SeleniumDriver;

public class AfterActions {

    @After
    public static void tearDown(Scenario scenario) {

        WebDriver driver=SeleniumDriver.getDriver();
        System.out.println(scenario.isFailed());
        if(scenario.isFailed())
        {
            byte[] screenshotEmbeded=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotEmbeded,"image/png");
        }
        SeleniumDriver.tearDown();
    }
}
