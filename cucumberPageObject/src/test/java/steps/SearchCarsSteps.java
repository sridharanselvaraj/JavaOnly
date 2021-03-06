package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.actions.CarsGuideHomePageAction;
import pages.actions.CarsSearchPageActions;
import pages.utils.SeleniumDriver;

import java.util.List;

public class SearchCarsSteps {

    CarsGuideHomePageAction carsGuideHomePageAction=new CarsGuideHomePageAction();
    CarsSearchPageActions carsSearchPageActions=new CarsSearchPageActions();

    @Given("^I am on the Home page \"([^\"]*)\" of carsguide website$")
    public void i_am_on_the_Home_page_of_carsguide_website(String url) throws Throwable {
        SeleniumDriver.opentPage(url);
    }

    @When("^I move to the Menu$")
    public void i_move_to_the_Menu(List<String> list) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        String menu =list.get(1);
        System.out.println("Menu Selected is :"+menu);
        carsGuideHomePageAction.moveToCarsForSaleMenu();


    }

    @And("^click on \"([^\"]*)\" link$")
    public void click_on_link(String searchCars) throws Throwable {

        carsGuideHomePageAction.clickOnSearchCarsMenu();
    }

    @And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
    public void select_carbrand_as_from_AnyMake_dropdown(String carBrand) throws Throwable {
        carsSearchPageActions.selectCarMake(carBrand);
    }

    @And("^select carmodel as \"([^\"]*)\" from SelectModel dropdown$")
    public void select_carmodel_as_from_SelectModel_dropdown(String carModel) throws Throwable {

        carsSearchPageActions.selectCarModel(carModel);
    }

    @And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
    public void select_location_as_from_SelectLocation_dropdown(String carLocation) throws Throwable {
        carsSearchPageActions.selectCarLocation(carLocation);
    }

    @And("^select price as \"([^\"]*)\" from price dropdown$")
    public void select_price_as_from_price_dropdown(String carPrice) throws Throwable {
        carsSearchPageActions.selectCarPrice(carPrice);
    }

    @And("^click on Find_My_Next_Car button$")
    public void click_on_Find_My_Next_Car_button() throws Throwable {
        carsSearchPageActions.clickOnFindMyNextCarButton();
    }

    @Then("^I should see list of searched cars$")
    public void i_should_see_list_of_searched_cars() throws Throwable {
        System.out.println("Car list is found!!!");
    }

    @And("^the page title should be \"([^\"]*)\"$")
    public void the_page_title_should_be(String title) throws Throwable {

        Assert.assertEquals(title,SeleniumDriver.getDriver().getTitle());

    }



}
