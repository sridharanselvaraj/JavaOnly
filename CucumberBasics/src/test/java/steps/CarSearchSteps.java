package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CarSearchSteps {

    public static WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
    }

    @After
    public void tearDown(Scenario scenario)
    {
        if(scenario.isFailed())
        {
            byte[] screenshotEmbeded=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotEmbeded,"image/png");
        }
        if(driver !=null) {
            driver.quit();
        }
    }

    @Given("^I am on the home page http://www\\.carsguild\\.co\\.au of carsguide website$")
    public void i_am_on_the_home_page_http_www_carsguild_co_au_of_carsguide_website() throws Throwable {

        driver.get("http://www.carsguide.com.au");
    }

    @When("^I move to Car for Sale Menu$")
    public void i_move_to_Car_for_Sale_Menu() throws Throwable {
        WebElement menu=driver.findElement(By.xpath("//*[@id='view_car_deal']/a[1]"));
        new Actions(driver).moveToElement(menu).perform();
    }

    @Then("^I click on Search Cars$")
    public void i_click_on_Search_Cars() throws Throwable {
        driver.findElement(By.xpath("//*[@id='view_car_deal']/ul/li[1]/a")).click();
    }

    @Then("^I select Make as \"([^\"]*)\"$")
    public void i_select_Make_as(String make) throws Throwable {

        new Select(driver.findElement(By.xpath("//*[@id='makes']"))).selectByVisibleText(make);
    }

    @Then("^I select Model as \"([^\"]*)\"$")
    public void i_select_Model_as(String model) throws Throwable {
        Thread.sleep(3000);
        new Select(driver.findElement(By.xpath("//*[@id='models']"))).selectByVisibleText(model);
    }

    @Then("^I select location as \"([^\"]*)\"$")
    public void i_select_location_as(String location) throws Throwable {
        new Select(driver.findElement(By.xpath("//*[@id='locations']"))).selectByVisibleText(location);
    }

    @Then("^I select price as \"([^\"]*)\"$")
    public void i_select_price_as(String price) throws Throwable {
        new Select(driver.findElement(By.xpath("//*[@id='price-max']"))).selectByVisibleText(price);
    }

    @Then("^I click on Find My Next Car button$")
    public void i_click_on_Find_My_Next_Car_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id='search-submit']")).click();
    }

    @Then("^I should see list of searched cars from \"([^\"]*)\"$")
    public void i_should_see_list_of_searched_cars(String car) throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='pos0']/div[2]/div[2]/div[1]/div[1]/h5")).getText().contains(car));
    }

    @Then("^the page title should be \"([^\"]*)\"$")
    public void the_page_title_should_be(String title) throws Throwable {
        Assert.assertEquals(title,driver.getTitle());
    }


}
