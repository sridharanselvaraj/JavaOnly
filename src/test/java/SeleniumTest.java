import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Test
    public static void doStart()
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver.get("www.google.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen();
        driver.close();

    }



}
