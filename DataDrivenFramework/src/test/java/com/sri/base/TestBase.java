package com.sri.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sri.utils.ExcelReader;
import com.sri.utils.ExtentManager;
import com.sri.utils.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    /*
     * WebDriver
     * Properties
     * Logs
     * ExtentReports
     * DB
     * Excel
     * Mail
     *
     *  */

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Properties config = new Properties();
    public static Properties OR = new Properties();
    public static FileInputStream fis;
    public static Logger log= Logger.getLogger("devpinoyLogger");
    public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
    public ExtentReports reports=ExtentManager.getInstance();
    public static ExtentTest test;

    @BeforeSuite
    public void setUp() throws IOException {

        if (driver == null) {
            try {
                fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/Config.properties");
            }catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            try {
                config.load(fis);
                log.debug("Config file loaded!!!");
            }catch (IOException e)
            {
                e.printStackTrace();
            }
            try {
                fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/OR.properties");
            }catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            try {

                OR.load(fis);
                log.debug("OR file loaded!!!");
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        if (config.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            log.debug("Chrome Launched !!!");
        } else if (config.getProperty("browser").equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (config.getProperty("browser").equals("ie")) {
            System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.get(config.getProperty("testsiteurl"));
        log.debug("Navigated to :"+config.getProperty("testsiteurl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,5);
    }

    public void click(String locator)
    {
        if(locator.endsWith("_CSS")) {
            driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
        }else if(locator.endsWith("_XPATH")) {
            driver.findElement(By.xpath(OR.getProperty(locator))).click();
        }else if(locator.endsWith("_ID")){
            driver.findElement(By.id(OR.getProperty(locator))).click();
        }
        test.log(LogStatus.INFO,"Clicking on: "+locator);
    }

    public void type(String locator,String value)
    {
        if(locator.endsWith("_CSS")) {
            driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
        }else if (locator.endsWith("_XPATH")) {
            driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
        }else if (locator.endsWith("_ID")) {
            driver.findElement(By.id(OR.getProperty(locator))).sendKeys(value);
        }
        test.log(LogStatus.INFO,"Typing in: "+locator+ " entered value as value "+value);
    }


    public static boolean isElementPresent(By by)
    {
        try {
            driver.findElement(by);
            return true;
        }catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public static void verifyEquals(String expected,String actual) throws IOException {
        try
        {
            Assert.assertEquals(actual,expected);
        }
        catch (Throwable e)
        {
            TestUtil.captureScreenshot();
            //ReportNG
            Reporter.log("<br>"+"Verification Failure :"+e.getMessage()+" ");
            Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName +">" +
                    "<img src="+TestUtil.screenshotName +" height=200 width=200></img></a>");
            Reporter.log("<br>");
            Reporter.log("<br>");
            //ExtentReport

            test.log(LogStatus.FAIL,"Verification failed with exception :"+e.getMessage());

        }

    }

    static WebElement dropDown;
    public void select(String locator,String value)
    {
        if(locator.endsWith("_CSS")) {
            dropDown=driver.findElement(By.cssSelector(OR.getProperty(locator)));

        }else if (locator.endsWith("_XPATH")) {
        dropDown=driver.findElement(By.xpath(OR.getProperty(locator)));
        }else if (locator.endsWith("_ID")) {
            dropDown = driver.findElement(By.id(OR.getProperty(locator)));
        }
            Select select=new Select(dropDown);
            select.selectByVisibleText(value);
            test.log(LogStatus.INFO,"Selecting from dropdown: "+locator+ " value as value "+value);
    }

    @AfterSuite
    public  void tearDown()
    {
        if(driver != null) {
            driver.quit();
        }
        log.debug("test execution completed ....");
    }
}
