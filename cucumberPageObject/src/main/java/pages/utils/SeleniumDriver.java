package pages.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    public static SeleniumDriver seleniumDriver;

    //init WebDriver
    public static WebDriver driver;

    public static WebDriverWait webDriverWait;

    public final static int TIMEOUT=30;
    public final static int PAGE_LOAD_TIMEOUT=50;


    private SeleniumDriver() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en_GB");
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"),desiredCapabilities);

//        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//        driver=new ChromeDriver();
        driver.manage().window().maximize();

        webDriverWait=new WebDriverWait(driver,TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
    }

    public static void opentPage(String url)
    {
        driver.get(url);
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public static void setUpDriver() throws MalformedURLException {
        if(seleniumDriver==null)
        {
            seleniumDriver=new SeleniumDriver();
        }

    }

    public static void tearDown()
    {
        if(driver!=null)
        {
            driver.close();
            driver.quit();
        }

        seleniumDriver=null;
    }

}
